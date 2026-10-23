/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicios_1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_24_EJERCICIOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captu = new Scanner (System.in);
        
        int numinicial,numfinal, secu;
        
        
        System.out.println("Primer numero de la secuancia");
        numinicial = captu.nextInt();
        captu.nextLine();
        System.out.println("Numero final de la secuancia");
        numfinal = captu.nextInt();
        
        
        for(int i = numinicial; i <= numfinal; i+=1 ){
            
            System.out.print(" - " + i + " - ");
            
        
        }
        
    }
    
}
