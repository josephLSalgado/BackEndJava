package practicaMona;

import java.util.Arrays;

// Clase para definir las distintas profesiones que ejerce Mona
public class MonaProfesion extends Mona {
    // Accesorio que caracteriza a lo que se dedica Mona
    private String accesorio;
    private String profesion;

    MonaProfesion(int id, String nombre, boolean animacion, String[] autor,
         String accesorio, String profesion) {
        super(id, nombre, animacion, autor);
        this.accesorio = accesorio;
        this.profesion = profesion;
    }

    // Setters y Getters
    public boolean setAccesorio(String accesorio) {
        if (!accesorio.isEmpty()) {
            this.accesorio = accesorio;
            return true;
        } else
             return false;
    }

    public boolean setProfesion(String profesion) {
        if (!profesion.isEmpty()) {
            this.profesion = profesion;
            return true;
        } else
            return false;
    }

    public String showMessage() {
        return "Nombre: " + super.getNombre() +
                " Id: " + super.getId() +
                " Animacion: " + super.getAnimacion() +
                "\nAutor(es): " + Arrays.toString(super.getAutor()) +
                "\nProfesión: " + profesion +
                " Accesorio: " + accesorio;
    }

    // Actividades que desarrolla Mona
    public void actividad() {
        System.out.println("A Mona le gusta desempeñarse en distintas" +
                " profesiones. ¡Le encanta su trabajo!");
    }
}
