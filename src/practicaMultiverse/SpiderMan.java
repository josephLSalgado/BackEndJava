package practicaMultiverse;

public class SpiderMan {
    private String nombre;
    private String alias;
    // Cómic de primera aparición de SpiderMan
    private String comic;
    private String afiliacion;
    private String genero;
    private String universo;

    // Constructor parametrizado
    SpiderMan(String nombre, String alias, String comic, String afiliacion,
              String genero, String universo) {
        this.nombre = nombre;
        this.alias = alias;
        this.comic = comic;
        this.afiliacion = afiliacion;
        this.genero = genero;
        this.universo = universo;
    }
    // Setters y Getters
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setAlias(String alias) {
        if (!alias.isEmpty()) {
            this.alias = alias;
            return true;
        } else
            return false;
    }

    public boolean setComic(String comic) {
        if (!comic.isEmpty()) {
            this.comic = comic;
            return true;
        } else
            return false;
    }

    public boolean setAfiliacion(String afiliacion) {
        if (!afiliacion.isEmpty()) {
            this.afiliacion = afiliacion;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero) {
        if (!genero.isEmpty()) {
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(String universo) {
        if (!universo.isEmpty()) {
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public String getNombre() { return nombre; }
    public String getAlias() { return alias; }
    public String getComic() { return comic; }
    public String getAfiliacion() { return afiliacion; }
    public String getGenero() { return genero; }
    public String getUniverso() { return universo; }

    public String showMessage() {
        return "Nombre: " + nombre +
                " Alias: " + alias +
                " Comic: " + comic +
                " Afiliación: " + afiliacion +
                " Género: " + genero +
                " Universo: " + universo + "\n";
    }
}
