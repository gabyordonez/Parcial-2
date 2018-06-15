package edificaciones.Generadores;

import control.GameObjectUSA;

public class GeneradoresUSA extends GameObjectUSA {
    private String type;
    private int cantidadProducida;

    public GeneradoresUSA(String nombre, int health, int tiempo, int adamantium, int mercurio, int piedra, String type, int cantidadProducida){
        super(nombre, health, tiempo, adamantium, mercurio, piedra);

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

