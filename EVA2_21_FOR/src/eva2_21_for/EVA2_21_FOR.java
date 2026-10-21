/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_for;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_21_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        
        for(int i = 1; i <= 10; i++){
            
            System.out.print(i + " - ");
        }
        System.out.println();
        for(int i = 20; i <= 40; i+=2){
            System.out.print(i + " - ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(i + " - ");
        }
        System.out.println();
        for(int i = 10; i >= 1; i-=1){
            System.out.print(i + " - ");
        }
        System.out.println();
        for(int i = 0; i <= 20; i+=2){
            System.out.print(i + " - ");
        }
            
        
    }
    
}
