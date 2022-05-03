package practicaComic;

public class Texto extends Pagina {
    private String texto;

    // Constructor super parametrizado
    Texto(int numeroPagina, String texto) {
        super(numeroPagina);
        this.texto = texto;
    }

    // Setter y Getter
    public boolean setTexto(String texto) {
        if (!texto.isEmpty()) {
            this.texto = texto;
            return true;
        } else
            return false;
    }

    public String getTexto() { return texto; }
}