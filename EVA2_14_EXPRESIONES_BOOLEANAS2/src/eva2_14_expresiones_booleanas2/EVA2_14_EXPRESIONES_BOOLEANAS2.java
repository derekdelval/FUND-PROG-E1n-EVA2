/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      //BECA 
      
      
      String equipo;
      int promedio;
      
       Scanner captu = new Scanner (System.in);
       
       System.out.println("Estas en un equipo representativo?(S/N) ");
       equipo = captu.nextLine();
       System.out.println("cual es el promedio? ");
       promedio = captu.nextInt();
       
       
        
       
        if((promedio >= 95) || equipo.equals("S")) {
           
           System.out.println("Tienes beca");
   
   
   }else {
        System.out.println("No tienes beca");
        }
      
   }
   
}
