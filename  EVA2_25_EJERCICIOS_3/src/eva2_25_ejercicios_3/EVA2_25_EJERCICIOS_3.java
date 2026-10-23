/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

/**
 *
 * @author bisonte
 */
public class EVA2_25_EJERCICIOS_3 {

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner (System.in);
        
        int num, resultado;
        
        
        System.out.println("Dime el numero un numero para ver su tabla de multiplicar");
        num = captu.nextInt();
        captu.nextLine();
        
        for (int i = 1; i <= 10; i += 1){
        
            resultado = i * num;
            
        System.out.println(num + " x " + i + " = " + resultado);
        
        }
        
        
    }
    