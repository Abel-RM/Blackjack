import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja;

    public Baraja() {

    }
    //toma una carta aleatoria de la baraja y la borra
    public Carta getCarta(){
        return new Carta( NumerosCartas.ACEESPADAS,0);
    }
    //baraja las cartas
    public void barajarse(){

    }

    //generar la baraja con 52 cartas
    public void generarCartas(){
        ArrayList<Carta> c = new ArrayList<>();
        Carta c1 = new Carta(NumerosCartas.ACECORAZONES, 1);
        Carta c2 = new Carta(NumerosCartas.ACEESPADAS, 1);

        this.baraja.add(c1);
        this.baraja.add(c2);
    }
}
