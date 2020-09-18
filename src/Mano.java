import java.util.ArrayList;

public class Mano {
    private int apuesta;
    private ArrayList<Carta> mano;
    public Mano(int apuesta, ArrayList<Carta> cartas) {
        this.apuesta = apuesta;
        this.mano = cartas;
    }
    public Mano( ArrayList<Carta> cartas) {

        this.mano = cartas;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public ArrayList<Carta> getCartas() {
        return mano;
    }

    public void setCartas(Carta c) {
        mano.add(c);
    }
    public int contar(){
        return 0;
    }


}
