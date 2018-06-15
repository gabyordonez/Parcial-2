package edificaciones.Recolectores;
import control.GameObjectDEU;

public class RecolectoresDEU extends GameObjectDEU {
    private int maximo;
    private int actual;

    private String nombre;
    private int health;
    private int tiempo;
    private int vibranium;
    private int plomo;
    private int marmol;

    public RecolectoresDEU(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol) {
        super(nombre, health, tiempo, vibranium, plomo, marmol);
        this.nombre = nombre;
        this.health = health;
        this.tiempo = tiempo;
        this.vibranium = vibranium;
        this.plomo = plomo;
        this.marmol = marmol;
        this.maximo = maximo;
        actual = 0;
    }

    public int getMaximo(){
        return maximo;
    }


    public void recolectar(int cantidad){
        if(actual+cantidad > maximo){
            actual = maximo;
        }

        else{
            actual = actual+cantidad;
        }
    }
}
