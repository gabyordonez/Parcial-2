/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;

/**
 *
 * @author gabyordonez
 */
public class Control {
    LinkedList<GameObject> gameO = new LinkedList<GameObject>();
    
    public void check(){
        for(int i = 0; i < gameO.size(); i++){
            /** resets foo a game0.get(i) que es una funcion de la linked list que nos permite tener el id del objeto
             * 
             */
            
            GameObject foo = gameO.get(i); 
            foo.check();
        }
    }
    
    public void addObject (GameObject gameO){
        this.gameO.add(gameO);
    }
    
    public void removeObject (GameObject gameO){
        this.gameO.remove(gameO); 
    }
}

