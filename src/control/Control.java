/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import control.GameObjectDEU;
import control.GameObjectRUS;
import control.GameObjectUSA;

import java.util.LinkedList;

/**
 *
 * @author gabyordonez
 */
public class Control {
    private static boolean gameOver = false;

    public static boolean isGameOver() {

        return gameOver;
    }

    public static void setGameOver(boolean gameOver) {

        Control.gameOver = gameOver;
    }


}

