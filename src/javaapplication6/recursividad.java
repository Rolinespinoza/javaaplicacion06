/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import static javaapplication6.recursividad.factorial;

/**
 *
 * @author Roling Espinoza
 */
public class recursividad {
    static int factorial(int a)
    {
        if (a==0)
            return 1;
        else 
            return a*factorial(a-1);
        
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
