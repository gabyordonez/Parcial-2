package edificaciones.Recolectores;
import control.GameObjectDEU;

public class RecolectoresDEU extends GameObjectDEU {
    private String type;
    private int maximo;
    private int actual;

    public RecolectoresDEU(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol, String type, int maximo){
        super(nombre, health, tiempo, vibranium, plomo, marmol);
        this.maximo = maximo;
        this.type = type;
        actual = 0;
    }

    public String getType(){
        return type;
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
