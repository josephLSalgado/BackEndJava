package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class JessicaDrew extends SpiderMan implements JessicaDrewHabilidades {
    JessicaDrew(String nombre, String alias, String comic, String afiliacion,
                String genero, String universo) {
        super(nombre, alias, comic, afiliacion, genero, universo);
    }

    // Redefinición de los métodos de la interface JessicaDrewHabilidades
    public void artistaMarcial(Screen screen) {
        String s = "Jessica es una luchadora muy experimentada tras haber " +
                "entrenado en combate armado y desarmado bajo la supervisión " +
                "del Taskmaster a través de su afiliación como una agente de " +
                "Hydra. Al ser una artista marcial calificada, Jessica fue " +
                "capaz de captar por completo varios principios diferentes " +
                "estilos de combate, lo cual le permitió desarrollar " +
                "tácticas que integran diversos métodos utilizados en karate, " +
                "boxeo, capoeira, judo y esgrima.\n";

        screen.out("\nArtista marcial\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
        screen.showImage(".\\src\\practicaMultiverse\\artistaMarcial.png");
    }

    public void espiaExperta(Screen screen) {
        String s = "Gracias a su participación en diferentes organizaciones " +
                "de inteligencia como HYDRA y S.H.I.E.L.D., Jessica está " +
                "ampliamente capacitada en el espionaje, operaciones " +
                "encubiertas y el sigilo.\n";

        screen.out("\nEspía experta\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
    }

    public void vuelo(Screen screen) {
        String s = "Cuando los invasores Skrull rediseñaron el proceso que le " +
                "concedió a Jessica sus poderes, esto aumento sus poderes de " +
                "vuelo limitados; por lo cual ahora es capaz de volar " +
                "completamente. Aunque no está claro el rango y el alcance de " +
                "este poder.\n";

        screen.out("\nVuelo\n", "Corbel", 30, Colors.Desire);
        screen.out(s, "Corbel", 25, Colors.PrestigeBlue);
    }
}
