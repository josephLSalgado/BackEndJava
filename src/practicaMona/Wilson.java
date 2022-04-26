package practicaMona;

public class Wilson extends MonaProfesion {
    Wilson(int id, String nombre, boolean animacion, String[] autor,
           String accesorio, String profesion) {
        super(id, nombre, animacion, autor, accesorio, profesion);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("A Wilson le gusta jugar béisbol. Es un buen Catcher.");
    }
}
