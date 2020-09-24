import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> mano = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Carta> getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }

    //retorna un string con las cartas que estan en la mano
    public String decirMano()
    {
        String resp = "";

        resp = "Tiene";

        for(int i = 0; i < mano.size(); i++)
        {
            Carta c = mano.get(i);
            resp += " " + c.getValorFigura() + ", ";
        }

        //Elimina el ultimo caracter, siendo una coma.
        resp = resp.substring(0, resp.length() - 2);

        return resp;
    }
    //retorna la suma de los puntos
    public int contarPuntos(ArrayList<Carta> mano) {

        int contAs = 0;
        int valorNoAs = 0;

        for (Carta item : mano){
            if(item.getValorNum() == 1){
                contAs++;
            }else
                valorNoAs += item.getValorNum();
        }

        int suma[] = new int[2];

        switch (contAs){
            case 1:
                suma[0] = valorNoAs + 1;
                suma[1] = valorNoAs + 11;
                break;
            case 2:
                suma[0] = valorNoAs + 2;
                suma[1] = valorNoAs + 12;
                break;
            case 3:
                suma[0] = valorNoAs + 3;
                suma[1] = valorNoAs + 13;
                break;
            case 4:
                suma[0] = valorNoAs + 4;
                suma[1] = valorNoAs + 14;
                break;
            default:
                return valorNoAs;
        }

        Arrays.sort(suma);

        for (int i = suma.length-1 ; i >= 0; i-- ){
            if (suma[i] <= 21){
                return suma[i];
            }
        }

        return suma[0];
    }

}
