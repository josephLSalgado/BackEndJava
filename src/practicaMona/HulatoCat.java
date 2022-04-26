package practicaMona;

public class HulatoCat extends MonaProfesion{
    HulatoCat(int id, String nombre, boolean animacion, String[] autor,
               String accesorio, String profesion) {
        super(id, nombre, animacion, autor, accesorio, profesion);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("A Hula le sabe mucho a tocar las canciones de" +
                " Genshin Impact.");
    }
}
