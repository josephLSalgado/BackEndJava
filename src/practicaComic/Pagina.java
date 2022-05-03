package practicaComic;

public class Pagina {
    private int numeroPagina;

    // Constructor parametrizado
    Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    // Setter y Getter
    public boolean setNumeroPagina(int numeroPagina) {
        if (numeroPagina > 0) {
            this.numeroPagina = numeroPagina;
            return true;
        } else
            return false;
    }

    public int getNumeroPagina() { return numeroPagina; }
}
