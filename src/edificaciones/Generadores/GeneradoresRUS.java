package edificaciones.Generadores;

import control.GameObjectRUS;

public class GeneradoresRUS extends GameObjectRUS {

    private int cantidadProducida;

    public GeneradoresRUS(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol, int cantidadProducida){

        super(nombre, health, tiempo, vibranium, plomo, marmol);

        this.cantidadProducida = cantidadProducida;
    }

    public int produce(){
        return cantidadProducida;
    }
}

