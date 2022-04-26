package practicaMona;

public class BenjaminBanneKat extends MonaProfesion {
    BenjaminBanneKat(int id, String nombre, boolean animacion, String[] autor,
             String accesorio, String profesion) {
        super(id, nombre, animacion, autor, accesorio, profesion);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("Benjamin construye un reloj de madera.");
    }
}
