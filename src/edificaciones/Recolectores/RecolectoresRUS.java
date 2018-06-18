package edificaciones.Recolectores;

import control.GameObjectRUS;

public class RecolectoresRUS extends GameObjectRUS {
    private int maximo;
    private int actual;

    private String nombre;
    private int health;
    private int tiempo;
    private int promethium;
    private int titanio;
    private int ceramica;

    public RecolectoresRUS(String nombre, int health, int tiempo, int promethium, int titanio, int ceramica, int maximo, String nombre1, int health1, int tiempo1, int promethium1, int titanio1, int ceramica1){
        super(nombre, health, tiempo, promethium, titanio, ceramica);
        this.maximo = maximo;
        this.nombre = nombre1;
        this.health = health1;
        this.tiempo = tiempo1;
        this.promethium = promethium1;
        this.titanio = titanio1;
        this.ceramica = ceramica1;
        actual = 0;
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
