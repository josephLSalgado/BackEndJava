package practicaMona;

public class SupportCat extends MonaProfesion {
    SupportCat(int id, String nombre, boolean animacion, String[] autor,
               String accesorio, String profesion) {
        super(id, nombre, animacion, autor, accesorio, profesion);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("Ayuda con el soporte técnico de GitHub para los" +
                " estudiantes.");
    }
}
