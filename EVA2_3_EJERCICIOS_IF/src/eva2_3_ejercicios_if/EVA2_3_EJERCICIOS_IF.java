/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EJERCICIOS_IF {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
      double precio, cant, sub, descuento, total;
    
    Scanner captu = new Scanner(System.in);
    
    System.out.println ("Cual es el precio del producto? ");
    
    precio = captu.nextDouble();
    
    System.out.println ("Cual es la cantidad del producto? ");
    
    cant = captu.nextDouble();
    
   
    sub = precio * cant;
    
    descuento = sub * 0.10;
    
    
    
    if(sub >= 1000){ 
      
      
       descuento = sub * 0.10;
       total = sub - descuento;
       
        System.out.println ("Subtotal: " + sub + " pesos");
        
        
        System.out.println ("descuento: " + descuento + " pesos");
    
    
        System.out.println ("total: " + total + " pesos");
      
      
       
      
    }
        
    
    else {
    
    descuento = 0; 
    
    total = sub;
      
    System.out.println ("Subtotal: " + sub + " pesos");
        
        
        System.out.println ("descuento: " + descuento + " pesos");
    
    
        System.out.println ("total: " + total + " pesos");
    
    }

   
  }






    
    
    
    
  }
  

