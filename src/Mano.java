import java.util.ArrayList;

public class Mano {
    private int apuesta;
    private ArrayList<Carta> mano = new ArrayList<>();
    public Mano(int apuesta, ArrayList<Carta> cartas) {
        this.apuesta = apuesta;
        this.mano = cartas;
    }
    public ArrayList<Carta> getMano()
    {
        return this.mano;
    }
    public Mano( ArrayList<Carta> cartas) {

        this.mano = cartas;
    }
    public Mano( ) {

    }


    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }


    public void setCartas(Carta c) {
        mano.add(c);
    }



}
