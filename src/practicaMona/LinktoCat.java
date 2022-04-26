package practicaMona;

public class LinktoCat extends MonaCosplay {
    LinktoCat(int id, String nombre, boolean animacion, String[] autor,
             String referencia) {
        super(id, nombre, animacion, autor, referencia);
    }

    // Se redefine el método de actividad()
    public void actividad() {
        System.out.println("Link está buscando a la princesa Zelda.");
    }
}
