package edificaciones.Generadores;

import control.GameObjectUSA;

public class GeneradoresUSA extends GameObjectUSA {

    private int cantidadProducida;

    public GeneradoresUSA(String nombre, int health, int tiempo, int adamantium, int mercurio, int piedra, int cantidadProducida){

        super(nombre, health, tiempo, adamantium, mercurio, piedra);

        this.cantidadProducida = cantidadProducida;
    }

    public int produce(){
        return cantidadProducida;
    }
}

