/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author gabyordonez
 */
public class GameObjectUSA {
    private String nombre;
    private int health;
    private int currentHealth;
    private int tiempo;
    private int adamanthium;
    private int mercurio;
    private int piedra;

    
    public GameObjectUSA(String nombre, int health,int tiempo, int adamanthium, int mercurio, int piedra){
        this.nombre = nombre;
        this.health = health;
        this.adamanthium = adamanthium;
        this.mercurio = mercurio;
        this.piedra = piedra;
        this.tiempo = tiempo;
    }
    
    public  String getNombre (){

        return nombre;
    }
    
    public int getHealth (){

         return health;
    }

    public void setCurrentHealth(int damage) {
        if(currentHealth-damage < 0) {
            currentHealth = 0;
        }
        else {
            currentHealth = currentHealth - damage;
        }
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int tiempo(){
        return tiempo;
    }

    public int getAdamanthium(){
        return adamanthium;
    }

    public int getMercurio(){
        return mercurio;
    }

    public int getPiedra(){
        return piedra;
    }

    public int getTiempo(){
        return tiempo;
    }


}
