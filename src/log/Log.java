/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

/**
 *
 * @author gabyordonez
 */
public class Log {
    private static int fase = 1;

    public static void sumaFase(){
        Log.fase = Log.fase +1;
    }

    /**
     *
     */
    private Log() { }
}
