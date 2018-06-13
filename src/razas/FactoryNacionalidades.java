/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;

/**
 *
 * @author gabyordonez
 */
public class FactoryNacionalidades {
    
    public static Nacionalidades getNacionalidades(NacionalidadesType type){
        switch(type) {
            case Alemania:
                return new Alemania();
            case EstadosUnidos:
                return new EstadosUnidos();
            case Rusia:
                return new Rusia();
        }
        return null;
    }
    }
    
    

