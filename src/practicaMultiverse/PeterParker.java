package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class PeterParker extends SpiderMan implements PeterParkerHabilidades {
    PeterParker(String nombre, String alias, String comic, String afiliacion,
                String genero, String universo) {
        super(nombre, alias, comic, afiliacion, genero, universo);
    }

    // Redefinición de los métodos de la interface PeterParkerHabilidades
    public void habilidadParaSaltar(Screen screen) {
        String s = "Tanto su fuerza como su agilidad y rapidez le permiten a " +
                "Peter realizar saltos extraordinarios y de gran velocidad " +
                "pudiendo cubrir 100 metros en un salto largo y 30 metros " +
                "en altura. Unido todo esto a su capacidad de adherirse a " +
                "cualquier superficie, hacen de Spider-Man un peleador " +
                "extraordinario porque puede atacar desde cualquier " +
                "posición.\n";

        screen.out("\nHabilidad para saltar\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
    }

    public void sentidoAracnido(Screen screen) {
        String s = "Spider-Man posee un sentido extrasensorial o sentido " +
                "arácnido que le avisa de los potenciales peligros " +
                "inmediatos con una sensación de hormigueo en la parte " +
                "posterior de su cabeza. \n";

        screen.out("\nSentido arácnido\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
        screen.showImage(".\\src\\practicaMultiverse\\sentidoAracnido.png");
    }

    public void reflejosSobrehumanos(Screen screen) {
        String s = "Sus reflejos y movimientos le permiten esquivar casi " +
                "cualquier objeto que viaje a grandes velocidades: Balas, " +
                "proyectiles, rayos láser, etc. Su capacidad de movimiento y " +
                "reflejos son tales que él es prácticamente intocable. Su " +
                "extraordinaria agilidad, reflejos y velocidad le " +
                "permitirían escapar de un grupo de agentes de S.H.I.E.L.D. " +
                "como si nada, llevándose a Mary Jane con él y esquivando a " +
                "la vez los disparos. También Spider-Man esquivaría " +
                "fácilmente los disparos del Buitre que también posee " +
                "fuerza, reflejos y velocidad aumentados mucho más allá de " +
                "los límites normales.\n";

        screen.out("\nReflejos sobrehumanos\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
    }
}
