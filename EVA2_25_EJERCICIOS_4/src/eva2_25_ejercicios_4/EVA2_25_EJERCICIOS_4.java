/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner captu = new Scanner (System.in);
        
        int num, potencia, resultado = 1;
        
        
        System.out.println("Numero base: ");
        num = captu.nextInt();
        captu.nextLine();
        System.out.println("A que potencia lo quieres elevar? ");
        potencia = captu.nextInt();
        captu.nextLine();
        
        for (int i = 1; i <= potencia; i += 1 ){
            
            resultado = resultado * num;
            
            
          
        }
        
        System.out.println(num + " elevado a la " + potencia + " es igual a: " + resultado);
    }
    
}
