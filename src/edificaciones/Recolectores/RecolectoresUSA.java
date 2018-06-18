package edificaciones.Recolectores;

import control.GameObjectUSA;

public class RecolectoresUSA extends GameObjectUSA {
    private int maximo;
    private int actual;

    private  String nombre;
    private int health;
    private int tiempo;
    private int adamantium;
    private int mercurio;
    private int piedra;

    public RecolectoresUSA(String nombre, int health, int tiempo, int adamantium, int mercurio, int piedra, int maximo){
        super(nombre, health, tiempo, adamantium, mercurio, piedra);
        this.maximo = maximo;
        this.nombre = nombre;
        this.health = health;
        this.tiempo = tiempo;
        this.adamantium = adamantium;
        this.mercurio = mercurio;
        this.piedra = piedra;
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