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

    public void setValorFigura(NumerosCartas valorFigura) {
        this.valorFigura = valorFigura;
    }

    public int getValorNum() {
        return valorNum;
    }

    public void setValorNum(int valorNum) {
        this.valorNum = valorNum;
    }



    public String getNumero() {
        return valorFigura.toString();
    }

}
