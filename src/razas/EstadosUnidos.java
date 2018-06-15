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
public class EstadosUnidos extends Razas {
    private EstadosUnidos(){
        super();
        Map.put("escuadron1E", new Razas("Roosevelt", 200, 2, 30, 25, 125, 0));
        Map.put("escuadron2E", new Razas("Eisenhower", 200, 1, 15, 25, 0, 75));
        Map.put("escuadron3E", new Razas("Patton", 200, 3, 50, 0, 100, 75));

        Map.put("especialista1E", new Razas("Churchill", 300, 5, 100, 100, 100, 0));

        Map.put("vehiculo1E", new Razas("Avion", 300, 5, 100, 150, 0, 100));
        Map.put("vehiculo2E", new Razas("Tanque", 350, 5, 100, 200, 0, 100));

        Map.put("recolector1E", new Razas("Mercurio", 350, 4, "recurso2",0, 200, 0, 100 ));
        Map.put("recolector2E", new Razas("piedra", 350, 4, "recurso3",0, 150, 75, 0 ));

        Map.put("Generador1E", new Razas("Adamantium", 450,5,"recurso1", 0, 300, 100));

    }

}
