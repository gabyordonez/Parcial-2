package edificaciones.Generadores;

import control.GameObjectDEU;

public class GeneradoresDEU extends GameObjectDEU {
    private int cantidadProducida;

    public GeneradoresDEU(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol, int cantidadProducida){

        super(nombre, health, tiempo, vibranium, plomo, marmol);

        this.cantidadProducida = cantidadProducida;
    }

    public int produce(){
        return cantidadProducida;
    }
}
