/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas;
import java.util.Map;



/**
 *
 * @author gabyordonez
 */
public class Alemania extends Razas {

    private Alemania(){
        super();
        Map.put("escuadron1A", new Razas("Rommel", 200, 2, 30, 25, 125, 0));
        Map.put("escuadron2A", new Razas("Himmler", 200, 1, 15, 25, 0, 75));
        Map.put("escuadron3A", new Razas("Baer", 200, 3, 50, 0, 100, 75));

        Map.put("especialista1A", new Razas("Hitler", 300, 5, 100, 100, 100, 0));

        Map.put("vehiculo1A", new Razas("Avion", 300, 5, 100, 150, 0, 100));
        Map.put("vehiculo2A", new Razas("Tanque", 350, 5, 100, 200, 0, 100));

        Map.put("recolector1A", new Razas("Plomo", 350, 4, "recurso2",0, 200, 0, 100 ));
        Map.put("recolector1A", new Razas("marmol", 350, 4, "recurso3",0, 150, 75, 0 ));

        Map.put("Generador1A", new Razas("Vibranium", 450,5,"recurso1", 0, 300, 100));

    }

}
