/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Roling Espinoza
 */
public class buscadordetickets {
    public static int [] leerarreglo (int c)
    {
    int[]tickes=new int[c];
    for(int i=0;i<=c-1;i++)
    {
        System.out.println("ingrese los numeros de los tickes obtenidos");
        tickes[i]=leer.nextInt();
    }
    return tickes;
    }
    public static boolean Buscar (int[] tickes, int codigo, int c)
    {//true=verdadero, false=falso
        for(int i=0;i<=c-1;i++)
        {
            if(tickes[i]==codigo)
            {
                return true;//se retorna un valor y se finaliza la funcion
            }
        }
        return false;
    }
    public static Scanner leer=new Scanner(System.in);
    public static void main (String[] args)
    {
        System.out.println("Numero del arreglos ingresado al sistema:");
        int c=leer.nextInt();
        int[] arreglotickes=leerarreglo(c);
        System.out.println("ticket que desea buscar:");
        int codigo=leer.nextInt();
        if(Buscar (arreglotickes,codigo,c)==true)
        {
            System.out.println("ticke si existe en el sistema.");
        }
        else
        {
            System.out.println("ticke no existe en el sistema.");
        }
        
    }
}
