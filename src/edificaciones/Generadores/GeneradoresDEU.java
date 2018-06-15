package edificaciones.Generadores;

import control.GameObjectDEU;

public class GeneradoresDEU extends GameObjectDEU {
    private String type;
    private int cantidadProducida;

    public GeneradoresDEU(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol, String type, int cantidadProducida){
        super(nombre, health, tiempo, vibranium, plomo, marmol);

        this.cantidadProducida = cantidadProducida;
        this.type = type;
    }

    public int produce(){
        return cantidadProducida;
    }

    public String getType(){
        return type;
    }
}
