/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      
       Scanner captu = new Scanner (System.in);
       
       int adivinador, num = 67;
       
       do{
       
          System.out.println("Adivina mi numero, entre el 1 y el 67");
          adivinador = captu.nextInt();
          
          
       }while (adivinador != 67 );
       
          System.out.println("Correctoo!!!");
          
   }
   }
   

