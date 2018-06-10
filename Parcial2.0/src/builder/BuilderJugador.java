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
public class BuilderJugador {

        private String firstName;
        private String lastName; 
        
        public void setFirstName(String firstName){
            this.firstName = firstName; 
        }
        
        public void  setlastName(String lastName){
            this.lastName = lastName;   
        }
        
        public BuilderJugador construir(){
            BuilderJugador jugador = new BuilderJugador(); 
            jugador.firstName = this.firstName; 
            jugador.lastName = this.lastName; 
            
            return jugador; 
        }
    
 private BuilderJugador(){
     
 }
}

