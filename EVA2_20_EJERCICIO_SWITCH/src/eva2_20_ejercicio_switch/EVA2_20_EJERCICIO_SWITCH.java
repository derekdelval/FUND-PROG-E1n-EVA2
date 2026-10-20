/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captu = new Scanner (System.in);
        
        int operacion ;
        double valor1, valor2, resultado;
        
        System.out.println("Dime el primer valor");
        valor1 = captu.nextDouble();
        System.out.println("Dime el segundo valor");
        valor2 = captu.nextDouble();
        
        
        
        System.out.println("Que operacion deseas realizar? (suma(1), resta(2), multiplicacion(3), division(4))");
        operacion = captu.nextInt();
        captu.nextLine();
        
        switch(operacion){
        
            case 1:
                
                resultado = valor1 + valor2;
                System.out.println("El resultado de la suma es = " + resultado);
                break;
            case 2:
                resultado = valor1 - valor2;
                System.out.println("El resultado de la resta es = " + resultado);
                break; 
            case 3:
                resultado = valor1 * valor2;
                System.out.println("El resultado de la multiplicacion es = " + resultado);
                break;
            case 4:
                resultado = valor1 / valor2;
                System.out.println("El resultado de la division es = " + resultado);
                break;
                
            default: System.out.println("Operacion invalida");
    }
    }
    
}
