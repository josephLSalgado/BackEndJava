package practicaComic;

import imonsh.Screen;

public class TestComic {
    public static void main(String[] args) {
        // Objetos de la clase Screen
        Screen screenTexto = new Screen("Cómic texto");
        Screen screenImagen = new Screen("Cómic imagen");

        // Objeto de la clase HarleyRebirth
        HarleyRebirth harleyRebirth = new HarleyRebirth("Harley Quinn",
                "¡Después de nacer!", 1, "Amanda Conner & Jimmy Palmiotti",
                "Junio 21, 2018", "Español");

        // Creación de la páginas con texto e imágenes
        // Hacemos un total de 6 páginas de cada tipo
        Texto[] textos = new Texto[6];
        Imagen[] imagenes = new Imagen[6];

        // Definimos y agregamos al arreglo todas las páginas al objeto de la
        // clase HarleyRebirth
        textos[0] = new Texto(1, harleyRebirth.showMessage());
        textos[1] = new Texto(2, "HARLEY: ¡Bienvenidos sean todos, al show más " +
                "fenomenal en el mundo entero!\n    ¡Me bautizaron como Harleen Quinzel, pero " +
                "mis amigos y mis enemigos me conocen simplemente como Harley Quinn!\n    Esta " +
                "noche seré su absoluta anfitriona.\n    Primero, un poco acerca de mí...");
        textos[2] = new Texto(3, "HARLEY: Nací y fui criada aquí en Brooklyn. " +
                "Tengo tres hermanos y un par de padres retirados que viven en Florida junto al " +
                "resto de Neoyorquinos retirados.\n    Vaya que fui un problema en la escuela, " +
                "y obtuve una beca para la Gotham University, donde me gradué como la primera " +
                "de la clase. Rápidamente encontré trabajo en un prominente hospital de Gotham " +
                "City.\n\nJOKER: Hola, Doctora.");
        textos[3] = new Texto(4, "HARLEY: ¡Casa!\n    ¡Y aquí estoy hoy, frente " +
                "a ustedes, visiblemente muy agradecida de lo que resulte ser!\n    ¡Ahora " +
                "quiero presentar a los mejores amigos que Harley podría tener!\n\nTONY: Mátenme." +
                "\n\nCASTOR: A mí también.\n\nHARLEY: ¿No son condenadamente lindos?");
        textos[4] = new Texto(5, "HARLEY: ¡También permítanme informales de mi " +
                "galante y apetecible Pandilla de Harleys! Harlem Harley, Harvey Quinn y la " +
                "entrenadora...\n\nPERSONAJE 1: Bien, esto es algo por lo que no firmé." +
                "\n\nPERSONAJE 2: Aich, no es tan malo... tan sólo imagina en ropa interior a " +
                "aquellos tipos.\n\nHARLEY: Harley Queens y Carli Quinn...\n\nPERSONAJE 3: ¿Ropa " +
                "interior? ¡Me dijeron que habría pizza gratis!");
        textos[5] = new Texto(6, "HARLEY: Y eso es todo lo que necesitan saber " +
                "por ahora. ¿Comprenden?\n\nRED TOOL: Por supuesto que conozco todo eso. Soy tu " +
                "acosador número uno... \n    ...Er... Uh... ¿Enamorado incondicional?\n\nHARLEY: " +
                "No eres tan incodicional, Freddy.\n\nRED TOOL: Amigo, ¿en verdad?\n\nHARLEY: Los " +
                "gatitos y los perritos todos tienen nombre, pero no los pajaritos... aún\n    " +
                "Tendrás que esperar por eso, porque me estoy quedando afónica.\n    ¡Ja! " +
                "¿Entendieron?");
        harleyRebirth.setTexto(textos);

        imagenes[0] = new Imagen(1, ".\\src\\practicaComic\\pagina1.jpg");
        imagenes[1] = new Imagen(2, ".\\src\\practicaComic\\pagina2.jpg");
        imagenes[2] = new Imagen(3, ".\\src\\practicaComic\\pagina3.jpg");
        imagenes[3] = new Imagen(4, ".\\src\\practicaComic\\pagina4.jpg");
        imagenes[4] = new Imagen(5, ".\\src\\practicaComic\\pagina5.jpg");
        imagenes[5] = new Imagen(6, ".\\src\\practicaComic\\pagina6.jpg");
        harleyRebirth.setImagen(imagenes);

        leeComicHarley(screenTexto, screenImagen, harleyRebirth);
    }

    public static void leeComicHarley(Screen screenTexto, Screen screenImagen,
                                         HarleyRebirth harleyRebirth) {
        // Objetos para la presentación de las páginas en las pantallas
        PaginaTexto paginaTexto = new PaginaTexto();
        PaginaImagen paginaImagen = new PaginaImagen();

        // Hilos para visualizar el cómic en 2 ventanas con imágenes y texto
        Runnable texto = new Runnable() {
            @Override
            public void run() {
                screenTexto.setVisible(true);
                screenTexto.setBounds(0,0,430, 700);

                // Ciclo que pasará por cada una de las páginas de texto
                for (int i = 0; i < harleyRebirth.getTexto().length; i++) {
                    // Visualiza cada página dando un tiempo de 20 segundos
                    paginaTexto.leerPagina(screenTexto,
                            harleyRebirth.getTexto()[i].getTexto());

                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        };

        Runnable imagen = new Runnable() {
            @Override
            public void run() {
                screenImagen.setVisible(true);
                screenImagen.setBounds(415,0,430,700);

                // Ciclo que pasará por cada una de las páginas de imagen
                for (int i = 0; i < harleyRebirth.getImagen().length; i++) {
                    // Visualiza cada página dando un tiempo de 20 segundos
                    paginaImagen.leerPagina(screenImagen,
                            harleyRebirth.getImagen()[i].getUbicacionImagen());

                    try {
                        Thread.sleep(20000);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        };

        Thread ventanaTexto = new Thread(texto);
        Thread ventanaImagen = new Thread(imagen);

        ventanaTexto.start();
        ventanaImagen.start();
    }
}
