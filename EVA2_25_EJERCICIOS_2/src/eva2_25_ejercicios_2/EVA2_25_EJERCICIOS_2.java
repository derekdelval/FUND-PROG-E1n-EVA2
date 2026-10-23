/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        
        int cantidad;
        String as = "*";
        
        System.out.println("Primer numero de la secuancia");
        cantidad = captu.nextInt();
        captu.nextLine();
        
        
        
        for(int i = 1; i <= cantidad; i+=1 ){
            
            System.out.println(as);
            
            as = as + "*";
            
            
            
            }
            
            
    }
}

        
        
    
    

