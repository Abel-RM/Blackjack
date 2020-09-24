import java.util.ArrayList;

public class Juego {
    public static void main(String[] args) {

        int numJugadores = 0;
        //leer el numero de jugadores
        do{
            System.out.println("Cuantos jugadores son(1-7):");
            numJugadores = Keyboard.readInt();
        }while (!(numJugadores>=1 && numJugadores<=7));
        Jugador jugadores[] = new Jugador[numJugadores];
        String j ="";



        Coupier coupier = new Coupier("Coupier");
        ArrayList<Carta> manoCoupier = coupier.getMano();
        //dar dos cartas a cada jugador
        for (int i = 0; i<numJugadores;i++){
            System.out.println("Escribe tu nombre:");
            j = Keyboard.readString();
            //asigna mano a jugador
            jugadores[i]= new Jugador(j);
            jugadores[i].getMano().add(coupier.getBarajaActual().getCarta());
            jugadores[i].getMano().add(coupier.getBarajaActual().getCarta());

        }
        //asigna mano a coupier
        manoCoupier.add(coupier.getBarajaActual().getCarta());
        manoCoupier.add(coupier.getBarajaActual().getCarta());


        System.out.println("La primera carta del coupier es: "+coupier.getMano().get(0).getValorFigura());
        System.out.println("La segunda carta es: ?????");


        int sumaPuntos = 0;
        String valorMano ="";
        char opcion = ' ';
        boolean plantarse;
        int numAs =0 ;
        //recorrer a todos los jugadores hasta que se planten
        for(int i = 0; i<numJugadores;i++){
            System.out.println("--------------------------------------------------------------------------------");
            plantarse = true;
            do{

                System.out.println("Jugador : "+jugadores[i].getNombre());
                valorMano = jugadores[i].decirMano();
                System.out.println("La mano del jugador es:");
                System.out.println(valorMano);
                //determinar si el jugador tiene blackjack
                if(coupier.determinarBlackjack(jugadores[i].getMano())){
                    plantarse = false;
                }else{
                    System.out.println("Da una suma total de:");
                    sumaPuntos = jugadores[i].contarPuntos(jugadores[i].getMano());
                    System.out.println(sumaPuntos);
                    if(sumaPuntos < 21 && jugadores[i].getMano().size() < 5){
                        System.out.println("C:tomar ota carta, P: plantarse");

                        do{
                            opcion = Keyboard.readChar();
                        }while (opcion != 'C' && opcion !='c'&& opcion != 'P' && opcion != 'p');
                        if(opcion =='C' || opcion == 'c'){
                            jugadores[i].getMano().add(coupier.getBarajaActual().getCarta());

                        }else{
                            plantarse = false;
                        }

                    }else
                        plantarse = false;

                }

            }while (plantarse);

        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(coupier.manoFinalCoupier());
        //comparar la mano del coupier con cada jugador para determinar los ganadores
        for(Jugador jugador: jugadores){
            System.out.println(coupier.determinarGanador(jugador));
        }


    }

}
