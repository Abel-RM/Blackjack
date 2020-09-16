public class Carta {
    private String numero;
    private String figura;

    public Carta(String numero, String figura) {
        this.numero = numero;
        this.figura = figura;
    }

    public String getFigura(){
        return figura;
    }

    public String getNumero() {
        return numero;
    }

    public String getCarta(){
        return numero+" de "+figura;
    }

}
