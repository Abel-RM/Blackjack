import java.util.ArrayList;

public class Baraja {
    public ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja() {

    }
    //toma una carta aleatoria de la baraja y la borra
    public void getCarta(Mano m){
        int num = (int) (Math.random() * baraja.size()-1) ;
        m.setCartas(baraja.get(num));
        baraja.remove(num);
    }
    //baraja las cartas
    public void barajarse(int cont){
        if(cont < 5){
            Mano m =  new Mano();
            for(int i = 0; i< 52; i++){
                getCarta(m);
            }
            baraja.clear();
            baraja.addAll(m.getMano());
        }else
            barajarse(++cont);
    }

    //generar la baraja con 52 cartas
    public void generarCartas(){
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
}
