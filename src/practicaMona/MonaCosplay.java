package practicaMona;

import java.util.Arrays;

// Clase para definir los distintos cosplays que ha hecho Mona
public class MonaCosplay extends Mona {
    // A qué serie, programa o juego es el cosplay
    private String referencia;

    MonaCosplay(int id, String nombre, boolean animacion, String[] autor,
                  String referencia) {
        super(id, nombre, animacion, autor);
        this.referencia = referencia;
    }

    // Setter y Getter
    public boolean setReferencia(String referencia) {
        if (!referencia.isEmpty()) {
            this.referencia = referencia;
            return true;
        } else
            return false;
    }

    public String getReferencia() { return referencia; }

    public String showMessage() {
        return "Nombre: " + super.getNombre() +
                " Id: " + super.getId() +
                " Animacion: " + super.getAnimacion() +
                "\nAutor(es): " + Arrays.toString(super.getAutor()) +
                "\nReferencia: " + referencia;
    }

    // Actividades que desarrolla Mona
    public void actividad() {
        System.out.println("A Mona le gusta hacer muchos cosplays, es su hobby" +
                " favorito.");
    }
}
