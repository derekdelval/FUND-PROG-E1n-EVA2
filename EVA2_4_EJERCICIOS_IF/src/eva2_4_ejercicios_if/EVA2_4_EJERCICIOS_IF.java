/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJERCICIOS_IF {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String name;
    double sal, bono1, bono2, salfinal1, salfinal2;
    
    Scanner captu = new Scanner(System.in);
    
    System.out.println ("Cual es tu nombre? ");
    
    name = captu.nextLine();
    
    System.out.println ("Cual es tu salario? ");
    
    sal = captu.nextDouble();
    
 
    
    if(sal < 12000){ 
      
      
       bono1 = sal * 0.10;
       salfinal1 = sal + bono1;
       
        System.out.println ("Nombre: " + name);
        
        
        System.out.println ("Salario: " + sal + " pesos");
    
    
        System.out.println ("bono: " + bono1 + " pesos");
        
    
        System.out.println ("salario final: " + salfinal1 + " pesos");
      
      
       
      
    }
        
    
    else {
    
    bono2 = sal * 0.05;
    
    salfinal2 = sal + bono2;
      
        System.out.println ("Nombre: " + name);
        
        
        System.out.println ("Salario: " + sal + " pesos");
    
    
        System.out.println ("bono: " + bono2 + " pesos");
        
    
        System.out.println ("salario final: " + salfinal2 + " pesos");
    
    }
  }
  
}
