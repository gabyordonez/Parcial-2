package control;

public class GameObjectRUS {
    private String nombre;
    private int health;
    private int currentHealth;
    private int tiempo;
    private int promethium;
    private int titanio;
    private int ceramica;


    public GameObjectRUS(String nombre, int health, int tiempo, int promethium, int titanio, int ceramica){
        this.nombre = nombre;
        this.health = health;
        this.promethium = promethium;
        this.titanio = titanio;
        this.ceramica = ceramica;
        this.tiempo = tiempo;
    }

    public  String getNombre (){

        return nombre;
    }

    public int getHealth (){

        return health;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int tiempo(){
        return tiempo;
    }

    public int getPromethium(){
        return promethium;
    }

    public int getTitanio(){
        return titanio;
    }

    public int getCeramica(){
        return ceramica;
    }

    public int getTiempo(){
        return tiempo;
    }

    public void setCurrentHealth(int damage) {
        if(currentHealth-damage < 0) {
            currentHealth = 0;
        }
        else {
            currentHealth = currentHealth - damage;
        }
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setCeramica(int ceramica) {
        this.ceramica = ceramica;
    }

    public void setPromethium(int promethium) {
        this.promethium = promethium;
    }

    public void setTitanio(int titanio) {
        this.titanio = titanio;
    }
}