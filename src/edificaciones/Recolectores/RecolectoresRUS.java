package edificaciones.Recolectores;

import control.GameObjectRUS;

public class RecolectoresRUS extends GameObjectRUS {
    private String type;
    private int maximo;
    private int actual;

    public RecolectoresRUS(String nombre, int health, int tiempo, int promethium, int titanio, int ceramica, String type, int maximo){
        super(nombre, health, tiempo, promethium, titanio, ceramica);
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
