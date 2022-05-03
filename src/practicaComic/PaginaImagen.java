package practicaComic;

import imonsh.Screen;

// Clase para mostrar una página con imagen en una ventana de la librería imonsh

public class PaginaImagen implements PaginaAction {
    // Redefinición del método leerPagina para PaginaImagen
    public void leerPagina(Screen screen, String ubicacionImagen) {
        screen.cls();
        screen.repaint();
        screen.showImage(ubicacionImagen);
    }
}
