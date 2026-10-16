/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_BECA {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
     
      
      double ingresos, promedio;
      
      
       Scanner captu = new Scanner (System.in);
       
       System.out.println("Cuales son los ingresos de tu familia al mes?");
       ingresos = captu.nextDouble();
       System.out.println("cual es tu promedio? ");
       promedio = captu.nextDouble();
       
       
        
       
        if((promedio > 80) && ingresos < 10000) {
           
           System.out.println("Tienes beca");
   
   
   }else {
        System.out.println("No tienes beca");
        }
   }
   
}
