/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_calificaciones;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_2_CALIFICACIONES {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
    
      int calif;
    
    Scanner captu = new Scanner(System.in);
    
    System.out.println ("Cual es tu calificación? ");
    
    calif = captu.nextInt();
    
   //parentecis obligatorios, dentro la expresion condicional (Verdadero o falso)
    
    
    if(calif >= 70){ //que hacemos si es verdad
      
      
       
      
      
        System.out.println ("Pasaste la materia chavo, felicidades!!");
      
    }
    
    else {  //Que hacemos si es falso
    
        System.out.println ("No pasaste, decepcion de la familia!! ");
    
    
    }
  }
  
}
