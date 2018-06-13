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
public abstract class GameObject {
    protected int x, y; 
    protected int velX, velY;
    protected Id id; 
    
    public abstract void check();
    
    public GameObject(int  x, int y, Id id){
        this.x = x; 
        this.y = y;
        this.id = id; 
    }
    
    public void setX (int x){
        this.x= x; 
    }
    
    public void setY (int y){
        this.y = y; 
    }
    
    public void setId(Id id){
        this.id = id;  
    }
    
    public int getX (int x){
        return x; 
    }
    
    public int getY (int y){
        return y; 
    }
    
    public void setVelX (int velX){
        this.velX = velX; 
    }
    
    public int getVelX (int velX){
        return velX; 
    }
    
    public Id getId(){
    return id; 
    }
    
    public void setVelY (int velY){
        this.velY = velY; 
    }
    
    public int getVelY (int vely){
        return vely; 
    }
    
    
}
