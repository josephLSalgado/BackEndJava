package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

// Clase para mostrar una página con texto en una ventana de la librería imonsh

public class PaginaTexto implements PaginaAction {
    // Redefinición del método leerPagina para PaginaTexto
    public void leerPagina(Screen screen, String texto) {
        screen.cls();
        screen.repaint();
        screen.out(texto, "Corbel", 25, Colors.BalticSea);
    }
}
