/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Roling Espinoza
 */
public class ejercicioaprobadodesaprobado {
    public static void main(String[] args) throws IOException {
        int nota;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          System.out.print("ingresa solo una nota del 1 al 10:");
        nota=Integer.parseInt(br.readLine());
        
        if(nota>=1 && nota<=10)
        {
            
                     switch(nota)
         {
             case 0:
                 System.out.println("SUSPENDIDO");
                 break;
             case 1:
                 System.out.println("tiene opcion a una segunda oportunidad");
                 break;
             case 2: 
                 System.out.println("es interesante saber que puede mejorar");
                 break;
             case 3:
                 System.out.println("debe reflexionar que va mejorar y lo hara, estoy seguro de ello");
             case 4:
                 System.out.println("claro que lo lograras");
                 break;
             case 5:
                 System.out.println("no esta nada mal, bien hecho");
                 break;
             case 6: 
                 System.out.println("sobresaliente");
                 break;
             case 7:
                 System.out.println("muy notable, se ve que te esfuerzas bastante");
                 case 8:
                 System.out.println("genial, poco mas y lograras dominarlo");
                 break;
             case 9:
                 System.out.println("eres un genio, tienes un gran potencial, sigue adelante muchacho");
                 break;
             case 10: 
                 System.out.println("felicitaciones , nivel superado");
                 break;
                     }
                   
         }
          else 
                     
                     {
                             System.out.println("ERROR!!!!");
                             System.out.println("escriba un numero que este ubicado entre el 1 al 10");
                             }
    }
}
