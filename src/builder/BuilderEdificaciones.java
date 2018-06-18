/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author gabyordonez
 */
public class BuilderEdificaciones {
    private String nombre;
    private int health;
    private int attack;
    private int damage; 
    private int tiempo; 
    private int recurso1;
    private int recurso2;
    private int recurso3;
    
    public BuilderEdificaciones() {
        
    }
    
    public BuilderEdificaciones getNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public BuilderEdificaciones getHealth(int health) {
        this.health = health;
        return this;
    }
    
    public BuilderEdificaciones getAttack(int attack) {
        this.attack = attack;
        return this;
    }
    
    public BuilderEdificaciones getTiempo(int tiempo) {
        this.tiempo = tiempo;
        return this;
    }
    
    public BuilderEdificaciones getRecurso1(int recurso1) {
        this.recurso1 = recurso1;
        return this;
    }

    public BuilderEdificaciones getRecurso2(int recurso2){
        this.recurso2 = recurso2;
        return this;
    }

    public BuilderEdificaciones getRecurso3(int recurso3){
        this.recurso3 = recurso3;
        return this;
    }
    
    public BuilderEdificaciones getDamage(int damage) {
        this.damage = damage;
        return this;
    }

}