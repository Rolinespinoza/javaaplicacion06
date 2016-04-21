/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.IOException;

/**
 *
 * @author Roling Espinoza
 */
public class ejerciciosnumerosprimos {
    static boolean  esprimo(int n)
    {
     boolean esprimo=true;
     int i=2;
     while (i<n)
     {
       if(n%2==0)
           esprimo=false;
       i++;
     }
        return esprimo;
    }
    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 1000; i++)
        {
         if(esprimo(i))  
             System.out.println(i);
        }
          
         
    }
    
}
