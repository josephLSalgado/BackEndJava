package practicaMona;

public class HomerCat extends MonaCosplay {
    HomerCat(int id, String nombre, boolean animacion, String[] autor,
           String referencia) {
        super(id, nombre, animacion, autor, referencia);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("A HomerCat le encanta tomar cerveza Duff.");
    }
}
