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
    private int healthActual;
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

    public int getCurrentHealth() {
        return healthActual;
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

    public void setHealthActual(int damage) {
        if(healthActual-damage < 0) {
            healthActual = 0;
        }
        else {
            healthActual = healthActual - damage;
        }
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealthActual() {
        return healthActual;
    }

    public void setAdamanthium(int adamanthium) {
        this.adamanthium = adamanthium;
    }

    public void setMercurio(int mercurio) {
        this.mercurio = mercurio;
    }

    public void setPiedra(int piedra) {
        this.piedra = piedra;
    }
}
