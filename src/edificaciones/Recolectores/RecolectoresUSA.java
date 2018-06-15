package edificaciones.Recolectores;

import control.GameObjectUSA;

public class RecolectoresUSA extends GameObjectUSA {
    private String type;
    private int maximo;
    private int actual;

    public RecolectoresUSA(String nombre, int health, int tiempo, int adamantium, int mercurio, int piedra, String type, int maximo){
        super(nombre, health, tiempo, adamantium, mercurio, piedra);
        this.maximo = maximo;
        this.type = type;
        actual = 0;
    }

    public String getType(){
        return type;
    }

    public int getMaximo(){
        return maximo;
    }


    public void recolectar(int cantidad){
        if(actual+cantidad > maximo){
            actual = maximo;
        }

        else{
            actual = actual+cantidad;
        }
    }
}