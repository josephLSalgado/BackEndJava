package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class MilesMorales extends SpiderMan implements MilesMoralesHabilidades {
    MilesMorales(String nombre, String alias, String comic, String afiliacion,
                 String genero, String universo) {
        super(nombre, alias, comic, afiliacion, genero, universo);
    }

    // Redefinición de los métodos de la interface MilesMoralesHabilidades
    public void rayoVenenoso(Screen screen) {
        String s = "El cuerpo de Miles posee una enorme cantidad de bio-energía" +
                " que ha aprendido a canalizar y descargar para paralizar " +
                "temporalmente a sus enemigos con tal solo tocarlos. Parece " +
                "que hay varios grados de esta capacidad, ya que algunos " +
                "oponentes han sido simplemente aturdidos mientras otros han " +
                "sido completamente incapacitados. Este poder proporciona " +
                "una gran ventaja para Miles ya que puede terminar " +
                "rápidamente una confrontación con poco daño colateral. El " +
                "rayo venenoso ha demostrado ser la habilidad más poderosa de " +
                "Miles, capaz de detener a pesos pesados como el Duende Verde " +
                "o hasta el demonio Blackheart.\n";

        screen.out("\nRayo Venenoso\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
        screen.showImage(".\\src\\practicaMultiverse\\rayoVenenoso.png");
    }

    public void trepaMuros(Screen screen) {
        String s = "Miles puede aferrarse a cualquier superficie utilizando " +
                "sólo los dedos y los pies. La medida en la cantidad de " +
                "presión con la que puede adherirse a las paredes es hasta " +
                "ahora desconocida, salvo que él puede manejar el " +
                "levantamiento de su propio peso.\n";

        screen.out("\nTrepa muros\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
    }

    public void fuerzaSobreHumana(Screen screen) {
        String s = "Miles es capaz de levantar 25 o mas toneladas de peso " +
                "sobre su cabeza usando ambos brazos. Su fuerza física " +
                "también se extiende a las piernas, lo que le permite ser " +
                "capaz de alcanzar una altura de varios pisos de un solo " +
                "salto. Esta extraordinaria fuerza arácnida le ha permitido " +
                "levantar autos, camiones de gran tamaño y causar daño a una " +
                "persona superhumana como Rhino con gran facilidad, Miles " +
                "debe contener sus golpes para no asesinar a sus enemigos.\n";

        screen.out("\nFuerza Sobrehumana\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
        screen.showImage(".\\src\\practicaMultiverse\\fuerzaSobrehumana.png");
    }
}
