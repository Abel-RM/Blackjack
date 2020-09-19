public enum NumerosCartas {
    ACEESPADAS("A(Espadas)"),ACECORAZONES("A(Corazones)"),ACEROMBOS("A(Rombos)"),ACETREBOLES("A(Treboles)"),
    DOSESPADAS("2(Espadas)"),DOSCORAZON("2(Corazones)"),DOSROMBOS("2(Rombos)"),DOSTREBOLES("2(Treboles)"),
    TRESESPADAS("3(Espadas)"),TRESCORAZON("3(Corazones)"),TRESROMBOS("3(Rombos)"),TRESTREBOLES("3(Treboles)"),
    CUATROESPADAS("4(Espadas)"),CUATROCORAZON("4(Corazones)"),CUATROROMBOS("4(Rombos)"),CUATROTREBOLES("4(Treboles)"),
    CINCOESPADAS("5(Espadas)"),CINCOCORAZON("5(Corazones)"),CINCOROMBOS("5(Rombos)"),CINCOTREBOLES("5(Treboles)"),
    SEISESPADAS("6(Espadas)"),SEISCORAZON("6(Corazones)"),SEISROMBOS("6(Rombos)"),SEISTREBOLES("6(Treboles)"),
    SIETEESPADAS("7(Espadas)"),SIETECORAZON("7(Corazones)"),SIETEROMBOS("7(Rombos)"),SIETETREBOLES("7(Treboles)"),
    OCHOESPADAS("8(Espadas)"),OCHOCORAZON("8(Corazones)"),OCHOROMBOS("8(Rombos)"),OCHOTREBOLES("8(Treboles)"),
    NUEVEESPADAS("9(Espadas)"),NUEVECORAZON("9(Corazones)"),NUEVEROMBOS("9(Rombos)"),NUEVETREBOLES("9(Treboles)"),
    DIEZESPADAS("10(Espadas)"),DIEZCORAZON("10(Corazones)"),DIEZROMBOS("10(Rombos)"),DIEZTREBOLES("10(Treboles)"),
    JACKESPADAS("J(Espadas)"),JACKCORAZON("J(Corazones)"),JACKROMBOS("J(Rombos)"),JACKTREBOLES("J(Treboles)"),
    KINGESPADAS("K(Espadas)"),KINGCORAZON("K(Corazones)"),KINGROMBOS("K(Rombos)"),KINGTREBOLES("K(Treboles)"),
    QUEENESPADAS("Q(Espadas)"),QUEENCORAZON("Q(Corazones)"),QUEENROMBOS("Q(Rombos)"),QUEENTREBOLES("Q(Treboles)");

    private final String text;

    NumerosCartas(final String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
