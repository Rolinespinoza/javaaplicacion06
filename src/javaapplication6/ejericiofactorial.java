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
public class ejericiofactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ingresa un numero :");
        int n=Integer.parseInt(br.readLine());
        
        while  (n<0)
        {
            System.out.println("error: el numero no es positivo");
            System.out.print("ingresa un numero :");
             n=Integer.parseInt(br.readLine());
        }
        int factorial=1;
        for (int i = 1; i <= n; i++) 
        {
      //      factorial=factorial*1;
            factorial *=i;

        }
                 System.out.println("el factorial de "+n+" es:"+factorial);
        
    }
}
