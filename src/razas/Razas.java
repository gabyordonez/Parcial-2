package razas;

public class Razas {
    private String nombre;
    private String type;
    private int health;
    private int tiempo;
    private int attack;
    private int recurso1;
    private int recurso2;
    private int recurso3;
    private int base1;
    private int base2;
    private int base3;
    private String recolectado;
    private String generado;

    public Razas() {

    }

    public  String getNombre(){
        return nombre;
    }

    public int getHealth(){
        return health;
    }

    public int getTiempo(){
        return tiempo;
    }

    public int getAttack(){
        return attack;
    }

    public int getRecurso1(){
        return recurso1;
    }

    public int getRecurso2(){
        return recurso2;
    }

    public int getRecurso3(){
        return recurso3;
    }


    public String getRecolectado() {
        return recolectado;
    }


/**
 * constructor para soldados vehiculos
 */

    public Razas(String nombre, int health, int tiempo, int attack, int recurso1, int recurso2, int recurso3){
        this.nombre = nombre;
        this.health = health;
        this.tiempo = tiempo;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        this.attack = attack;
    }

/**
 * constructor para generarar recursos
 */

    public Razas(String nombre, int health,  int tiempo, String generado, int recurso1, int recurso2, int recurso3){
        this.nombre = nombre;
        this.health = health;
        this.tiempo = tiempo;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        this.generado = generado;
    }

    /**
     * constructor para recolectores
     */

    public Razas( String nombre, int health, int tiempo, String recolectado, int attack, int recurso1, int recurso2, int recurso3){
        this.nombre = nombre;
        this.health = health;
        this.attack = attack;
        this.tiempo = tiempo;
        this.recurso1 = recurso1;
        this.recurso2 = recurso2;
        this.recurso3 = recurso3;
        this.recolectado = recolectado;
    }

}
