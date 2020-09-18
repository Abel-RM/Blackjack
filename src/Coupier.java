public class Coupier extends Jugador{


    public Coupier(String nombre, Mano mano) {
        super(nombre, mano);
    }
    //determina si gana el copier o el jugador en turno y dice los puntos
    //verificando si el jugador tiene blackjack
    public String determinarGanador(Mano m){
        return "";
    }

    //retorna un string con las cartas que estan en la mano
    public String decirMano(Mano m){
        return "";
    }
    //retorna la suma de los puntos
    public int contarPuntos(Mano m){
        return 0;
    }
    //iterar hasta que el coupier se plante, seguir reglas para el coupier
    public void manoFinalCoupier( Baraja b){
        //dejar guardada la mano final del coupier para despues ser comparada en el metodo determinarGanador

    }
    //Determina si la mano del jugador tiene blackjack
    public boolean determinarBlackjack(Mano m){
        return false;
    }




}
