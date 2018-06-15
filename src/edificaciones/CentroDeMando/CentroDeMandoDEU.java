/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificaciones.CentroDeMando;

import control.GameObjectDEU;

/**
 *
 * @author gabyordonez
 */
public class CentroDeMandoDEU extends GameObjectDEU {

    private int actualRecurso1;
    private int actualRecurso2;
    private int actualRecurso3;
    private int recurso1;
    private int recurso2;
    private int recurso3;

    public CentroDeMandoDEU(String nombre, int health, int tiempo, int vibranium, int plomo, int marmol) {
        super(nombre, health, tiempo, vibranium, plomo, marmol);
    }
}
