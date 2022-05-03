package practicaComic;

public class HarleyRebirth extends Comic{
    // Variables para el contenido del cómic
    private Imagen[] imagen;
    private Texto[] texto;

    // Constructor super, parametrizado
    // No se incluyen en este las variables para la clase HarleyRebirth
    HarleyRebirth(String nombre, String titulo, int numero, String autores,
                  String fechaPublicacion, String idioma) {
        super(nombre, titulo, numero, autores, fechaPublicacion, idioma);
    }

    // Setters y Getters
    public boolean setImagen(Imagen[] imagen) {
        if (imagen != null) {
            this.imagen = imagen;
            return true;
        } else
            return false;
    }

    public boolean setTexto(Texto[] texto) {
        if (texto != null) {
            this.texto = texto;
            return true;
        } else
            return false;
    }

    public Imagen[] getImagen() { return imagen; }
    public Texto[] getTexto() { return  texto; }
}
