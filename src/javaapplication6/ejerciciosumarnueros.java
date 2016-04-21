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
public class ejerciciosumarnueros {
    public static void main(String[] args) throws IOException {
       int total=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿quieres sumar numeros? s/n :");
        String respuesta= br.readLine();
         
        while (respuesta.equals("s"))
        {
            System.out.println("ingresa un numero:");
        int num=Integer.parseInt(br.readLine());
        total=total+num;
        System.out.println("¿quieres seguir  sumando  numeros? s/n :");
         respuesta= br.readLine();
        }
        System.out.println("el resultado es:"+total);
    }
    
}
