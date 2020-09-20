import java.util.ArrayList;

public class Coupier extends Jugador{


    public Coupier(String nombre, Mano mano) {
        super(nombre, mano);
    }
    //determina si gana el copier o el jugador en turno y dice los puntos
    //verificando si el jugador tiene blackjack
    public String determinarGanador(Mano m,String nombre)
    {
        String resp = "";

        if (this.determinarBlackjack(m))
        {
            resp = "El ganador en automatico es "+nombre+ " ya que tiene Blackjack, Felicidades!";
        }
        else
        {
            int valorJugador = 0;
            int valorCoupier = 0;

            ArrayList<Carta> arrManoJugador = m.getMano();

            for(int i = 0; i < arrManoJugador.size(); i++)
            {
                valorJugador += arrManoJugador.get(i).getValorNum();
            }
            Mano mCoupier = getMano();
            ArrayList<Carta> arrManoCoupier = mCoupier.getMano();

            for(int i = 0; i < arrManoCoupier.size(); i++)
            {
                valorCoupier += arrManoCoupier.get(i).getValorNum();
            }

            if (((valorJugador >= valorCoupier) && valorJugador <= 21 )||(valorCoupier > 21 && valorJugador <= 21))
            {
                resp = "El ganador es "+nombre+" con "+ valorJugador + " Puntos, sobre " + valorCoupier + " del Coupier";
            }
            else
                if(valorJugador > 21){
                    resp = "El ganador es el Coupier con " + valorCoupier + " Puntos, sobre " + valorJugador + " de "+nombre+" ya que se pasó de los 21";
                }
                else {
                    resp = "El ganador es el Coupier con " + valorCoupier + " Puntos, sobre " + valorJugador + " de "+nombre;
                }
        }

        return resp;
    }

    //retorna un string con las cartas que estan en la mano
    public String decirMano(Mano m)
    {
        String resp = "";

        ArrayList<Carta> arrMano = m.getMano();

        resp = "Tiene";

        for(int i = 0; i < arrMano.size(); i++)
        {
            Carta c = arrMano.get(i);
            resp += " " + c.getValorFigura() + ", ";
        }

        //Elimina el ultimo caracter, siendo una coma.
        resp = resp.substring(0, resp.length() - 2);

        return resp;
    }
    //retorna la suma de los puntos
    public int contarPuntos(Mano m)
    {
        int valor = 0;

        ArrayList<Carta> arrMano = m.getMano();
        for (Carta c : arrMano){
            valor += c.getValorNum();
        }

        return valor;
    }
    //iterar hasta que el coupier se plante, seguir reglas para el coupier
    public String manoFinalCoupier(Baraja b)
    {
        //dejar guardada la mano final del coupier para despues ser comparada en el metodo determinarGanador
        Mano m = getMano();
        int valor = 0;
        String g="";
        //Extrae el valor de las cartas de la mano actual
        valor = contarPuntos(m);
        g = "La mano del coupier es: \n";
        g += decirMano(m)+"\n";
        g += "Da una suma total de:\n"+contarPuntos(m)+"\n";

        //Pide una nueva carta si el valor es menor a 17
        while (valor < 17){
            g += "El coupier toma una carta \n";
            b.getCarta(m);
            g += m.getMano().get(m.getMano().size()-1).getValorFigura()+"\n";
            valor = contarPuntos(m);
            g += "Da una suma total de:\n"+contarPuntos(m)+"\n";
        }
        return g;
    }
    //Determina si la mano del jugador tiene blackjack
    public boolean determinarBlackjack(Mano m)
    {

        if(contarPuntos(m) == 21)
            return true;
        else
            return false;

    }

}
