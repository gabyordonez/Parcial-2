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
    private int precio; 
    
    public BuilderSoldado() {
        
    }
    
    public BuilderSoldado getNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public BuilderSoldado getHealth(int health) {
        this.health = health;
        return this;
    }
    
    public BuilderSoldado getAttack(int attack) {
        this.attack = attack;
        return this;
    }
    
    public BuilderSoldado getTiempo(int tiempo) {
        this.tiempo = tiempo;
        return this;
    }
    
    public BuilderSoldado getPrecio(int precio) {
        this.precio = precio;
        return this;
    }
    
    public BuilderSoldado getDamage(int damage) {
        this.damage = damage;
        return this;
    }
    
    public static void main(String[] args) {
    
        CuentaBanco cuenta1 = new CuentaBanco()
                .conBalance(100)
                .conDireccion("primera calle")
                .conNombre("mario");
        
        
    
    }
}
