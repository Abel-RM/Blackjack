import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Mano mano;

    public Jugador(String nombre, Mano mano) {
        this.nombre = nombre;
        this.mano = mano;
    }
    public Jugador() {

    }

    public Mano getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }
    public void setMano(Carta c)
    {
        this.mano.setCartas(c);
    }

}
