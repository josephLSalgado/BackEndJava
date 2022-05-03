package practicaComic;

public class Imagen extends Pagina {
    private String ubicacionImagen;

    // Constructor super, parametrizado
    Imagen(int numeroPagina, String ubicacionImagen) {
        super(numeroPagina);
        this.ubicacionImagen = ubicacionImagen;
    }

    // Setter y Getter
    public boolean setUbicacionImagen(String ubicacionImagen) {
        if (!ubicacionImagen.isEmpty()) {
            this.ubicacionImagen = ubicacionImagen;
            return true;
        } else
            return false;
    }

    public String getUbicacionImagen() { return ubicacionImagen; }
}
