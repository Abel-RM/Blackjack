

public class Juego {
    public static void main(String[] args) {

        int numJugadores = 0;

        do{
            System.out.println("Cuantos jugadores son(1-7):");
            numJugadores = Keyboard.readInt();
        }while (!(numJugadores>=1 && numJugadores<=7));
        Jugador jugadores[] = new Jugador[numJugadores];
        String j ="";
        Baraja baraja = new Baraja();
        baraja.generarCartas();
        baraja.barajarse(0);
        Mano arregloCartas = new Mano();

        for (int i = 0; i<numJugadores;i++){
            System.out.println("Escribe tu nombre:");
            j = Keyboard.readString();
            //asigna mano a jugador
            jugadores[i]= new Jugador(j,new Mano());
            baraja.getCarta(jugadores[i].getMano());
            baraja.getCarta(jugadores[i].getMano());
            arregloCartas = new Mano();
        }
        //asigna mano a coupier
        baraja.getCarta(arregloCartas);
        baraja.getCarta(arregloCartas);
        Coupier coupier = new Coupier("Coupier",arregloCartas);
        System.out.println("La primera carta del coupier es: "+coupier.getMano().getMano().get(0).getValorFigura());
        System.out.println("La segunda carta es: ?????");


        int sumaPuntos = 0;
        String valorMano ="";
        char opcion = ' ';
        boolean plantarse;
        for(int i = 0; i<numJugadores;i++){
            System.out.println("--------------------------------------------------------------------------------");
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
                    if(sumaPuntos < 21){
                        System.out.println("C:tomar ota carta, P: plantarse");

                        do{
                            opcion = Keyboard.readChar();
                        }while (opcion != 'C' && opcion != 'P');
                        if(opcion =='C'){
                            baraja.getCarta(jugadores[i].getMano());

                        }else{
                            plantarse = false;
                        }
                    }else
                        plantarse = false;

                }

            }while (plantarse);

        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(coupier.manoFinalCoupier(baraja));
        for(Jugador jugador: jugadores){
            System.out.println(coupier.determinarGanador(jugador.getMano(),jugador.getNombre()));
        }


    }

}
