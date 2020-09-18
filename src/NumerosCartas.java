public enum NumerosCartas {
    ACEESPADAS("Ace(Espadas)"),ACECORAZONES("Ace(CORAZONES)");

    private final String text;

    NumerosCartas(final String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
