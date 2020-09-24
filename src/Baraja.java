import java.util.ArrayList;
import java.util.Random;

public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {
        int valor = 1;
        int cont = 1;
        for(int i = 0; i< NumerosCartas.values().length; i++){
            this.baraja.add(new Carta(NumerosCartas.values()[i],valor));
            if( cont == 4 && valor != 10){
                valor++;
                cont = 0;
            }
            cont++;
        }
    }
    //toma una carta aleatoria de la baraja y la borra
    public Carta getCarta(){
        Random rn = new Random();
        int num = rn.nextInt(baraja.size());
        Carta c = baraja.get(num);
        baraja.remove(num);
        return c;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
}
