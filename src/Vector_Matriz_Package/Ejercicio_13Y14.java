/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vector_Matriz_Package;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejercicio_13Y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Equipo = new String[8];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Digita el nombre del miembro número " + (i+1) +" de tu equipo");
            Equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("El nombre del miembro número " + (i+1) + " de tu equipo es " + Equipo[i]);
        }
        
    }
    
}
