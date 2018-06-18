/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import razas.Razas;

/**
 *
 * @author gabyordonez
 */
public class BuilderSoldado {
    private String nombre;
    private int health;
    private int attack;
    private int damage; 
    private int tiempo; 
    private int recurso1;
    private int recurso2;
    private int recurso3;

    
    public BuilderSoldado() {
        
    }

    public int getAttack() {
        return attack;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
