/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author Usuario
 */
public class EVA2_13_EXPRESIONES_BOOLEANAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      boolean antro, credencial = true;
      int edad = 18;
      
      
      //AND  para ser true, ambas expresiones deben ser verdad
      antro = (edad >= 18) && (credencial == true);
      System.out.println("permiso para entrar: " + antro);
         
      //OR  para que sea true, solo se necesita una verdad
      boolean  soleado = false, dinero = false;
      boolean salir; 
      
      salir = (soleado == true) || (dinero == true); 
      System.out.println("permiso para salir: " + salir);
   }
   
}
