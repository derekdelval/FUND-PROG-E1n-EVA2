/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captu = new Scanner (System.in);
        
        int cantidad,califa = 0;
        double promedio;
        
        System.out.println("Cuantas calificaciones vas a capturar? ");
        cantidad = captu.nextInt();
        captu.nextLine();
        
        for(int i = 0; i < cantidad; i+=1 ){
            System.out.println("Captura la calificacion:  ");
            califa = califa + captu.nextInt();
            captu.nextLine();
            
        
        }
        System.out.println("Acumulado = " + califa);
        promedio = califa / (cantidad * 1.0);
        System.out.println("Promedio = " + promedio);
    }
    
}
