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
public class Rusia extends Razas{
    private Rusia(){
        super();
        Map.put("escuadron1R", new Razas("Zhukov", 200, 2, 30, 25, 125, 0));
        Map.put("escuadron2R", new Razas("Sorge", 200, 1, 15, 25, 0, 75));
        Map.put("escuadron3R", new Razas("Zaitsev", 200, 3, 50, 0, 100, 75));

        Map.put("especialista1R", new Razas("Stalin", 300, 5, 100, 100, 100, 0));

        Map.put("vehiculo1R", new Razas("Avion", 300, 5, 100, 150, 0, 100));
        Map.put("vehiculo2R", new Razas("Tanque", 350, 5, 100, 200, 0, 100));

        Map.put("recolector1R", new Razas("titanio", 350, 4, "recurso2",0, 200, 0, 100 ));
        Map.put("recolector2R", new Razas("ceramica", 350, 4, "recurso3",0, 150, 75, 0 ));

        Map.put("Generador1R", new Razas("promethium", 450,5,"recurso1", 0, 300, 100));
    }
    
}
