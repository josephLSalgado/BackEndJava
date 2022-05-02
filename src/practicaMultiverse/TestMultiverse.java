package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class TestMultiverse {
    public static void main(String[] args) {
        // Objetos de las clases
        Screen screen = new Screen();
        MilesMorales milesMorales = new MilesMorales("Miles Gonzalo Morales",
                "Spider-Man", "Ultimate Comics Fallout Vol 14", "Champions, " +
                "Order of the Web", "Masculino", "Tierra-1610");
        JessicaDrew jessicaDrew = new JessicaDrew("Jessica Miriam Drew",
                "Spider-Woman", "Marvel Spotlight Vol 1 32", "Avengers",
                "Femenino", "Tierra-616");
        PeterParker peterParker = new PeterParker("Peter Benjamin Parker",
                "Spider-Man", "Amazing Fantasy Vol 1 15", "Avengers",
                "Masculino", "Tierra-616");

        // Hacer visible la ventana y dimensionarla
        screen.setVisible(true);
        screen.setBounds(0, 0, 1000, 600);

        // Muestra primero a MilesMorales
        screen.out(milesMorales.showMessage(), "Corbel", 30, Colors.LighterPurple);
        milesMorales.rayoVenenoso(screen);
        milesMorales.trepaMuros(screen);
        milesMorales.fuerzaSobreHumana(screen);
        screen.out("\n");

        // JessicaDrew
        screen.out(jessicaDrew.showMessage(), "Corbel", 30, Colors.LighterPurple);
        jessicaDrew.artistaMarcial(screen);
        jessicaDrew.espiaExperta(screen);
        jessicaDrew.vuelo(screen);
        screen.out("\n");

        //PeterParker
        screen.out(peterParker.showMessage(), "Corbel", 30, Colors.LighterPurple);
        peterParker.habilidadParaSaltar(screen);
        peterParker.sentidoAracnido(screen);
        peterParker.reflejosSobrehumanos(screen);
    }
}
