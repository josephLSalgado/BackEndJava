package practicaMona;

import java.util.Arrays;

// Clase para definir a la mascota de Github, Mona
public class Mona {
    private int id;
    private String nombre;
    private boolean animacion;
    private String[] autor;

    Mona(int id, String nombre, boolean animacion, String[] autor) {
        this.id = id;
        this.nombre = nombre;
        this.animacion = animacion;
        this.autor = autor;
    }

    // Setters y Getters
    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setAnimacion(boolean animacion) {
        if (animacion == true || animacion == false) {
            this.animacion = animacion;
            return true;
        } else
            return false;
    }

    public boolean setAutor(String[] autor) {
        if (autor.length != 0) {
            this.autor = autor;
            return true;
        } else
            return false;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean getAnimacion() { return animacion; }
    public String[] getAutor() { return autor; }

    public String showMessage() {
        return "Nombre: " + nombre +
                " Id: " + id +
                " Animación: " + animacion +
                "\nAutor(es): " + Arrays.toString(autor);
    }
}
