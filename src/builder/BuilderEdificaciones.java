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
    private int precio; 
    
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
    
    public BuilderEdificaciones getPrecio(int precio) {
        this.precio = precio;
        return this;
    }
    
    public BuilderEdificaciones getDamage(int damage) {
        this.damage = damage;
        return this;
    }
}