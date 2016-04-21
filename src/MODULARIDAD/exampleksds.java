/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODULARIDAD;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Roling Espinoza
 */
public class exampleksds {
    static boolean esprimo(int j)
    {
        boolean esprimo=true;
        int i=2;
        while(i<j)
        {
        if (j%i==0)
        
            esprimo=false;
        
        i++;
        }
        return esprimo;
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        for (int i = 1; i <= 1000; i++) {
            if(esprimo(i))
            System.out.println(i);
  
        }
    }
}
