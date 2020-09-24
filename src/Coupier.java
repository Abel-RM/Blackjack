import java.util.ArrayList;
import java.util.Collections;

public class Coupier extends Jugador{
    private Baraja baraja;

    public Coupier(String nombre) {
        super(nombre);
        baraja = new Baraja();
        barajarse();
    }
    //determina si gana el copier o el jugador en turno y dice los puntos
    //verificando si el jugador tiene blackjack
    public String determinarGanador(Jugador jugador)
    {
        String resp = "";
        ArrayList<Carta> arrManoJugador = jugador.getMano();

        if (this.determinarBlackjack(arrManoJugador))
        {
            resp = "El ganador en automatico es "+jugador.getNombre()+ " ya que tiene Blackjack, Felicidades!";
        }
        else if (this.determinarBlackjack(getMano())){
            resp = "El ganador en automatico es el coupier ya que tiene Blackjack, Felicidades!";
        }
        else
        {
            int valorJugador = 0;
            int valorCoupier = 0;

            valorJugador = contarPuntos(arrManoJugador);
            valorCoupier = contarPuntos(getMano());
            if(valorJugador > 21){
                resp = "El ganador es el Coupier con " + valorCoupier + " Puntos, sobre " + valorJugador + " de "+jugador.getNombre()+" ya que se pasó de los 21";
            }else
                if (jugador.getMano().size() == 5 && valorJugador <= 21 ){
                    resp = "El ganador es "+jugador.getNombre()+" con "+ valorJugador + " Puntos, ya que tiene 5 cartas y no se ha pasado de los 21" ;
                }else
                    if (getMano().size() == 5 && valorCoupier <= 21 ){
                        resp = "El ganador es el Coupier con " + valorCoupier + " Puntos, ya que tiene 5 cartas y no se ha pasado de los 21";
                    }else
                        if ((valorJugador >= valorCoupier) || (valorCoupier > 21))
                        {
                            resp = "El ganador es "+jugador.getNombre()+" con "+ valorJugador + " Puntos, sobre " + valorCoupier + " del Coupier";
                        }
                        else {
                            resp = "El ganador es el Coupier con " + valorCoupier + " Puntos, sobre " + valorJugador + " de "+jugador.getNombre();
                        }

        }

        return resp;
    }


    public Baraja getBarajaActual() {
        return baraja;
    }

    //iterar hasta que el coupier se plante, seguir reglas para el coupier
    public String manoFinalCoupier()
    {
        ArrayList<Carta> manoActual = getMano();
        int valor = 0;
        String g="";
        //Extrae el valor de las cartas de la mano actual
        valor = contarPuntos(manoActual);
        g = "La mano del coupier es: \n";
        g += decirMano()+"\n";
        g += "Da una suma total de:\n"+contarPuntos(manoActual)+"\n";

        //Pide una nueva carta si el valor es menor a 17
        while (valor < 17){
            g += "El coupier toma una carta \n";
            manoActual.add(baraja.getCarta());
            g += manoActual.get(manoActual.size()-1).getValorFigura()+"\n";
            valor = contarPuntos(manoActual);
            g += "Da una suma total de:\n"+contarPuntos(manoActual)+"\n";
        }
        return g;
    }
    //Determina si la mano del jugador tiene blackjack
    public boolean determinarBlackjack(ArrayList<Carta> manoActual)
    {

        if(contarPuntos(manoActual) == 21 && manoActual.size() == 2)
            return true;
        else
            return false;

    }

    //baraja las cartas
    private void barajarse(){
        Collections.shuffle(baraja.getBaraja());
    }


}
