import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> baraja;

    public Baraja() {

    }
    //toma una carta aleatoria de la baraja y la borra
    public Carta getCarta(){
        return new Carta( NumerosCartas.ACEESPADAS);
    }
    public void barajarse(){

    }
    public void partirse(){

    }
    //generar la baraja con 52 cartas
    public void generarCartas(){

        ArrayList<Carta> c = new ArrayList<>();
        this.baraja = c;
    }
}
