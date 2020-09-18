import java.security.Key;
import java.util.ArrayList;

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

        int cont=0;
        int sumaPuntos = 0;
        String valorMano ="";
        char opcion = ' ';
        do{
            System.out.println("Jugador : "+jugadores[cont].getNombre());
            valorMano = coupier.decirMano(jugadores[cont].getMano());
            System.out.println("La mano del jugador es:");
            System.out.println(valorMano);
            System.out.println("Da una suma total de:");
            sumaPuntos = coupier.contarPuntos(jugadores[cont].getMano());
            System.out.println(sumaPuntos);
            System.out.println("C:tomar ota carta, P: plantarse");
            do{
                opcion = Keyboard.readChar();
            }while (opcion == 'C' ||opcion == 'P');
            if(opcion =='C'){

            }else{

            }

            if( cont == numJugadores-1)
                cont=0;
            else cont++;
        }while (true);

    }



}
