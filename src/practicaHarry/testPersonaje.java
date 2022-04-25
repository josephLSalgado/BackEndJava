package practicaHarry;

public class testPersonaje {
    public static void main(String[] args) {
        // Modelando 5 objetos de la clase Personaje
        Personaje myrtle = new Personaje("Myrtle Elizabeth Warren", "Muggle",
                "Femenino", "Ravenclaw", "Desconocido", "Desconocido");
        Personaje cedric = new Personaje("Cedric Diggory", "Pura",
                "Hufflepuff");
        Personaje harry = new Personaje("Harry James Potter", "Mestiza",
                "Masculino", "Gryffindor", "Dementor", "Ciervo");
        Personaje bellatrix = new Personaje("Bellatrix Lestrange", "Pura",
                "Femenino", "Slytherin", "Desconocido", "Desconocido");
        Personaje voldemort = new Personaje("Tom Ryddle 'Lord Voldemort'",
                "Mestiza", "Slytherin");

        cedric.setGenero("Masculino");
        cedric.setBoggart("Desconocido");
        cedric.setPatronus("Desconocido");

        voldemort.setGenero("Masculino");
        voldemort.setBoggart("Su propia muerte");
        voldemort.setPatronus("Desconocido");

        System.out.println(myrtle.showMessage());
        System.out.println(cedric.showMessage());
        System.out.println(harry.showMessage());
        System.out.println(bellatrix.showMessage());
        System.out.println(voldemort.showMessage());
        System.out.println("Mi personaje favorito de la saga de Harry Potter" +
                " es: " + bellatrix.getNombre());
    }
}
