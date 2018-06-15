package control;

public class GameObjectDEU {
    private String nombre;
    private int health;
    private int healthActual;
    private int tiempo;
    private int vibranium;
    private int plomo;
    private int marmol;


    public GameObjectDEU(String nombre, int health, int tiempo,  int vibranium, int plomo, int marmol){
        this.nombre = nombre;
        this.health = health;
        this.vibranium = vibranium;
        this.plomo = plomo;
        this.marmol = marmol;
        this.tiempo = tiempo;
    }

    public  String getNombre (){

        return nombre;
    }

    public int getHealth (){

        return health;
    }

    public int getHealthActual() {
        return healthActual;
    }

    public int getVibranium(){
        return vibranium;
    }

    public int getPlomo(){
        return plomo;
    }


    public int getMarmol(){
        return marmol;
    }

    public int getTiempo(){
        return tiempo;
    }

    public void setHealthActual(int damage) {
        if(healthActual-damage < 0) {
            healthActual = 0;
        }
        else {
            healthActual = healthActual - damage;
        }
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMarmol(int marmol) {
        this.marmol = marmol;
    }

    public void setPlomo(int plomo) {
        this.plomo = plomo;
    }

    public void setVibranium(int vibranium) {
        this.vibranium = vibranium;
    }

}
