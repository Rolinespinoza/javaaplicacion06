/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Roling Espinoza
 */
public class ejerciciofibonacci {
    static int fib(int a)
    {if (a<2)
        return a;
    else
        return fib (a-1)+fib(a-2);

    }
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++)          
        System.out.println("el fib("+i+ ") es:"+fib(i));
    }
    
}
