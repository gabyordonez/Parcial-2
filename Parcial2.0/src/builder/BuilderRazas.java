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
public class BuilderRazas {
    private final String nombre;
    private final int health;
    private final int attack;


    private BuilderRazas(RazasBuilder builder) {
        this.nombre = builder.nombre;
        this.health = builder.health;
        this.attack = builder.attack;
    }

    public String getCho() {
        return sabor;
    }

    public String getCaramelo() {
        return tamanio;
    }

    public static class RazasBuilder {

        private final String nombre;
        private final int health;
        private final int attack;

        public RazasBuilder(String nombre, int health, int attack) {
            this.nombre = nombre;
            this.health = health;
            this.attack = attack; 
        }

        public BuilderRazas build() {
            return new BuilderRazas(this);
        }

    }
    
    @Override
    public String toString(){
        return "PastelBluider{" + " Chocolate = " + sabor + ", Caramelo= " + tamanio + ", Complemento= " + complemento + ", Precio= " + precio + ", Cantidad de Porciones= " + cant_Porciones + "}";
    }
    
}
}
