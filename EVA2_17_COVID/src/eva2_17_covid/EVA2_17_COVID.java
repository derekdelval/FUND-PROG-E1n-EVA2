/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author herna
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner captu = new Scanner (System.in);
       
        double peso, imc, altura;
        String cronica;
        int edad;
        
        System.out.println("Cual es tu edad?");
        edad = captu.nextInt();
        captu.nextLine();
 
        if (edad < 65){
            
            System.out.println("Cual es tu altura en m?(ejemplo: 1,70)");
        altura = captu.nextDouble();
        
        
        System.out.println("Cual es tu peso en kg?(ejemplo: 70)");
        peso = captu.nextDouble();
        captu.nextLine();
        
        System.out.println("Tienes alguna enfermedad cronica?(si/no)");
        cronica = captu.nextLine();
            
            imc = peso / (altura * altura);
        
        if (cronica.equals("si") || (imc >= 25)){
            
            System.out.println("-SI- presentas riesgo ante el covid");
           
            
        }else if (cronica.equals("no") || (imc < 25)){
            
            System.out.println("-NO- presentas riesgo ante el covid");
        
        }
        
        }else {
            
            System.out.println("-SI- presentas riesgo ante el covid");
        
        }
        
    }
    
}
