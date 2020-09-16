import java.util.ArrayList;

public class Mano {
    private int apuesta;
    private ArrayList<Carta> cartas;

    public Mano(int apuesta, ArrayList<Carta> cartas) {
        this.apuesta = apuesta;
        this.cartas = cartas;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Carta c) {
        cartas.add(c);
    }
    public int contar(){
        return 0;
    }
}
