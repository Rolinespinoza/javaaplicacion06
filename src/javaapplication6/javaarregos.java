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
public class javaarregos {
    
 
    public static void main(String[] args) {
        int [] arre={23,765,75,9,756,854,8,90};
        burbuja(arre);
    }
    public static void burbuja (int []A)
    {
        int j,k,aux;
        boolean f= false;
        String pasada="";
        for ( k = 0; k < A.length; k++) 
        {
            for (j = 1;  j< A.length; j++) {
                if (A[j]<A[j-1])
                {
                    aux=A[j];
                    A[j]=A[j-1];
                    A[j-1]=aux;
                    System.out.println("A[j]="+A[j]+"A[j-1]"+A[j-1]+"Aux="+aux);
                    for (int i = 0; i < A.length; i++)
                    {
                      pasada+=""+Integer.toString(A[i]);
                    }
                    System.out.println("ArregloA={"+pasada+"}");
                    pasada="";
                }
                
            }
        }
    }
    }
