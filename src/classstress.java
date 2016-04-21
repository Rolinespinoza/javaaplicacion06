/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/**
 *
 * @author Roling Espinoza
 */
public class classstress {
    
	 public static void main (String[] args )
	 {
		 boolean boleano;
		 short entero_pequeño; // 16 bits 
		 char caracteres ; // 16 bits 
		 int enteros;  // 32 bits 
		 float punto_flotante;  // 32 bits 
		 long enteros_grandes;  // 64 bits 
		 double flotantes_grandes; // 64 bits
	 String cadena_caracteres;  
                    
		 
		 int resultado= suma(23,7);
                 System.out.println("logramos lo k buscamos ");
		 System.out.println("el resultado de la suma es:"+resultado);
	 }
	 
	 public  static int suma( int uno, int dos)
	 {
		 return uno + dos;
	 }
}
