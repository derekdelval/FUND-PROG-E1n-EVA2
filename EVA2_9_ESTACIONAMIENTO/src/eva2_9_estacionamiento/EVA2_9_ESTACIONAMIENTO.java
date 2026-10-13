/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
         int horas;
         double costo;
         
    Scanner captu = new Scanner(System.in);
    
    System.out.println("Cuantas horas estuvo en el estacionamiento?");
    horas = captu.nextInt();
    
    
    if( horas <= 2){
      
        costo = horas * 25;
    
        
        System.out.println("Costo total: $" + costo);
    
    }
    else if (horas <= 5){
        
        costo = horas * 20;
        
        System.out.println("Costo total: $" + costo);
        
        }
    else if (horas <= 10){
    
        costo = horas * 15;
        
        System.out.println("Costo total: $" + costo);
    }
    else if (horas > 10){
    
        costo = 150;
        
        System.out.println("Costo total: $" + costo);
    }
    
   
    } 
    
}
