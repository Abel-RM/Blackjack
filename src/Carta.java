public class Carta {
    private NumerosCartas valor;


    public Carta( NumerosCartas val) {
        this.valor = val;

    }

    public String getNumero() {
        return valor.toString();
    }

}
