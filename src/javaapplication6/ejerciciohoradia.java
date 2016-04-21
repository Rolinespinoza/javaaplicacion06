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
public class ejerciciohoradia {
    public static void main(String[] args) throws IOException {
        int hora, min;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("ingresa solo la hora actual:");
        hora=Integer.parseInt(br.readLine());
        System.out.print("ahora ingresa los minutos :");
         min=Integer.parseInt(br.readLine());
        /* tengamos en cuenta una cosa 
         
         madrugada: 00:00-06:00.
         MAÑANA 06:00-12:00
         tarde 12:00-18:00
         NOCHE18:00-00:00
         
         
         Mensaje especial si es el 
         mediodia: 12:00
         medianoche 00:00
         
         */
         if (hora==12 && min==00)
         {
             System.out.println("MEDIODIA");
             
         }
         else
             if(hora==00 && min==00)
             {
                 System.out.println("MEDIANOCHE");           
              }
             else 
                 if(hora>=00 && hora<=5)
                 {
                     System.out.println("MADRUGADA");
                 }
                 
          else 
                 if(hora>=6 && hora<=11)
                 {
                     System.out.println("MAÑANA");
                 }
                 else 
                     if(hora>=12 && hora<=17)
                     {
                         System.out.println("TARDE");
                     }      
           else 
                     if(hora>=18 && hora<=23)
                     {
                         System.out.println("NOCHE");
                     }      
        System.out.println("ha finalizado satisfactoriamente!!!!");
        
        
    }
}
