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
    private static Log foo = null;
    private static int fase = 1;

    public static Log getFoo() {
        if(foo == null)
            foo = new Log();
        return foo;
    }

    /**
     *
     */
    private Log() { }
}
