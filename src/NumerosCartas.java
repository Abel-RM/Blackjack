public enum NumerosCartas {
    ACEESPADAS("Ace(Espadas)"),ACECORAZONES("Ace(CORAZONES)"),DOSCORAZON("Dos(Corazones)");

    private final String text;

    NumerosCartas(final String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
