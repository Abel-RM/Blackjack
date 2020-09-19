import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Juego {
    public static void main(String[] args) {

        int numJugadores = 0;
        Jugador jugadores[] = new Jugador[numJugadores];
        do{
            System.out.println("Cuantos jugadores son(1-7):");
            numJugadores = Keyboard.readInt();
        }while (!(numJugadores>=1 && numJugadores<=7));
        String j ="";
        Baraja baraja = new Baraja();
        baraja.generarCartas();
        baraja.barajarse(0);
        ArrayList<Carta> arregloCartas = new ArrayList<>();
        Carta c1;
        Carta c2;
        for (int i = 0; i<numJugadores;i++){
            System.out.println("Escribe tu nombre:");
            j = Keyboard.readString();
            //asigna mano a jugador
            c1 = baraja.getCarta();
            c2 = baraja.getCarta();
            arregloCartas.add(c1);
            arregloCartas.add(c2);
            jugadores[i]= new Jugador(j,new Mano(arregloCartas));
            arregloCartas.clear();
        }
        //asigna mano a coupier
        c1 = baraja.getCarta();
        c2 = baraja.getCarta();
        arregloCartas.add(c1);
        arregloCartas.add(c2);
        Coupier coupier = new Coupier("Coupier",new Mano(arregloCartas));

        coupier.manoFinalCoupier(baraja);


        int sumaPuntos = 0;
        String valorMano ="";
        char opcion = ' ';
        boolean plantarse;
        for(int i = 0; i<numJugadores;i++){
            plantarse = true;
            do{

                System.out.println("Jugador : "+jugadores[i].getNombre());
                valorMano = coupier.decirMano(jugadores[i].getMano());
                System.out.println("La mano del jugador es:");
                System.out.println(valorMano);
                if(coupier.determinarBlackjack(jugadores[i].getMano())){
                    plantarse = false;
                }else{
                    System.out.println("Da una suma total de:");
                    sumaPuntos = coupier.contarPuntos(jugadores[i].getMano());
                    System.out.println(sumaPuntos);
                    System.out.println("C:tomar ota carta, P: plantarse");

                    do{
                        opcion = Keyboard.readChar();
                    }while (opcion == 'C' ||opcion == 'P');
                    if(opcion =='C'){
                        jugadores[i].getMano().setCartas(baraja.getCarta());
                    }else{
                        plantarse = false;
                    }
                }


            }while (plantarse);
            //determinar el juego del jugador en turno
            System.out.println(coupier.determinarGanador(jugadores[i].getMano()));
        }

        /*

        Baraja b = new Baraja();
        b.generarCartas();

        for(Carta c : b.baraja){
            System.out.println(c.getValorFigura());
        }
        b.barajarse(0);

       System.out.println("------------------------------------------------------------------------------------");

        for(Carta c : b.baraja){
            System.out.println(c.getValorFigura());
        }
        System.out.println(b.baraja.size());
        */

    }

}
