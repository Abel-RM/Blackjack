import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Mano mano;
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Mano getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador(String nombre, Mano mano) {
        this.nombre = nombre;
        this.mano = mano;
    }

    public void pedirCarta(Carta carta){
        mano.setCartas(carta);
    }

}
