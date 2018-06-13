/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.Scanner;
/**
 *
 * @author gabyordonez
 */
public class Gui {
    
    static void jugar(){
        
    }
    
    static void instrucciones(){
        
    }
    
    public static void menuPrincipal() {
        int opcion = -1;
        while (opcion != 3) {
            System.out.println("Menu de GabyOrdonez's World. Escoja opcion: ");
            System.out.println("1. Jugar");
            System.out.println("2. Instrucciones");
            System.out.println("3. Salir");

            Scanner reader = new Scanner(System.in);
            System.out.print("Introduzca el numero de opcion: ");
            opcion = reader.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    jugar();
                    break;
                    
                case 2: 
                    instrucciones(); 
                    break; 
                    
                case 3: 
                    break; 
                    
                default:
                    System.out.println("No escogio una opcion.");
            }
        }
        
    public  static void jugar(){
            String jugador;
            
            while (opcion != 4) {
            Scanner reader = new Scanner(System.String);
            System.out.print("Introduzca nombre de jugador 1: ");
            jugador1 = reader.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    reemplazarPaquete();
                    break;
        }
    }
