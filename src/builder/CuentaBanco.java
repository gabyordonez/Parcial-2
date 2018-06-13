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
public class CuentaBanco {
    
    private String nombre;
    private int balance;
    private String direccion;
    
    public CuentaBanco() {
        
    }
    
    public CuentaBanco conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    
    public CuentaBanco conBalance(int balance) {
        this.balance = balance;
        return this;
    }
    
    public CuentaBanco conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }
    
    public static void main(String[] args) {
    
        CuentaBanco cuenta1 = new CuentaBanco()
                .conBalance(100)
                .conDireccion("primera calle")
                .conNombre("mario");
        
        
    
    }
    
}
