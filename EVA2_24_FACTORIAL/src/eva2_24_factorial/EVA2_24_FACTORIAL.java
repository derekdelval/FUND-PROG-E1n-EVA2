/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner captu = new Scanner (System.in);
        
        int num,num2, resultado = 1,resultado2 = 1;
        
        
        System.out.println("Cual es el numero que quieres sacar factorial? ");
        num = captu.nextInt();
        System.out.println("Cual es el 2do numero que quieres sacar factorial? ");
        num2 = captu.nextInt();
        
        
        for(int i = num; i >= 1; i-=1 ){
            System.out.println("Secuencia 1: " + i);
           
            resultado = resultado * i;
        
        }
        System.out.println("- Aqui el 1er resultado: " + resultado);
        
        
        
        for(int i = 1; i <= num2; i+=1 ){
            System.out.println("Secuancia 2: " + i);
           
            resultado2 = resultado2 * i;
        
        }
        System.out.println("- Aqui el 2do resultado: " + resultado2);
            
            
    }
    
}
