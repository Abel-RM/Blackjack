public class Carta {
    private NumerosCartas valorFigura;
    private int valorNum;

    public Carta(NumerosCartas val, int valor) {
        this.valorFigura = val;
        this.valorNum =  valor;
    }

    public NumerosCartas getValorFigura() {
        return valorFigura;
    }

    public int getValorNum() {
        return valorNum;
    }


}
