package practicaComic;

public class Comic {
    // Nombre del cómic
    private String nombre;
    private String titulo;
    private int numero;
    private String autores;
    private String fechaPublicacion;
    private String idioma;

    // Constructor parametrizado
    Comic(String nombre, String titulo, int numero, String autores,
          String fechaPublicacion, String idioma) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.numero = numero;
        this.autores = autores;
        this.fechaPublicacion = fechaPublicacion;
        this.idioma = idioma;
    }

    // Setters y Getters
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setTitulo(String titulo) {
        if (!titulo.isEmpty()) {
            this.titulo = titulo;
            return true;
        } else
            return false;
    }

    public boolean setNumero(int numero) {
        if (numero >= 0) {
            this.numero = numero;
            return true;
        } else
            return false;
    }

    public boolean setAutores(String autores) {
        if (!autores.isEmpty()) {
            this.autores = autores;
            return true;
        } else
            return false;
    }

    public boolean setFechaPublicacion(String fechaPublicacion) {
        if (!fechaPublicacion.isEmpty()) {
            this.fechaPublicacion = fechaPublicacion;
            return true;
        } else
            return false;
    }

    public boolean setIdioma(String idioma) {
        if (!idioma.isEmpty()) {
            this.idioma = idioma;
            return true;
        } else
            return false;
    }

    public String getNombre() { return nombre; }
    public String getTitulo() { return titulo; }
    public int getNumero() { return numero; }
    public String getAutores() { return autores; }
    public String getFechaPublicacion() { return fechaPublicacion; }
    public String getIdioma() { return idioma; }

    public String showMessage() {
        return "Nombre: " + nombre +
                "\nTítulo: " + titulo +
                "\nNúmero: " + numero +
                "\nAutores: " + autores +
                "\nFecha de publicación: " + fechaPublicacion +
                "\nIdioma: " + idioma + "\n";
    }
}
