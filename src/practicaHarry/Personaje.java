package practicaHarry;

// Clase para modelar Personajes de la saga de Harry Potter
public class Personaje {
    private String nombre;
    private String estatusSangre;
    private String genero;
    private String casa;
    private String boggart;
    private String patronus;

    Personaje(String nombre, String estatusSangre, String genero, String casa, String boggart, String patronus) {
        this.nombre = nombre;
        this.estatusSangre = estatusSangre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    Personaje(String nombre, String estatusSangre, String casa) {
        this.nombre = nombre;
        this.estatusSangre = estatusSangre;
        this.casa = casa;
    }

    // Setters y Getters
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setEstatusSangre(String estatusSangre) {
        if (!estatusSangre.isEmpty()) {
            this.estatusSangre = estatusSangre;
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

    public boolean setCasa(String casa) {
        if (!casa.isEmpty()) {
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    public String getNombre() { return nombre; }
    public String getEstatusSangre() { return estatusSangre; }
    public String getGenero() { return genero; }
    public String getCasa() { return casa; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }

    // Mensaje de estado
    public String showMessage() {
        return "Nombre: " + nombre +
                " Estatus de sangre: " + estatusSangre +
                " Género: " + genero +
                " Casa: " + casa +
                " Boggart: " + boggart +
                " Patronus: " + patronus;
    }
}
