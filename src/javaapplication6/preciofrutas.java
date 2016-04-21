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
public class preciofrutas {
     public static Scanner leer=new Scanner (System.in);
    public static String [] LeerFrutas (int n)
    {
        String aFrutas []=new String [n];
        for (int i=0;i<=n-1;i=i+1)
        {
            System.out.println("ingrese el nombre de la fruta:");
            aFrutas[i]=leer.next();
           
        }
        return aFrutas;
        
    }
    public static double[] Leeprecio (int n, String[] aFrutas)
    {
        double aPrecio[]=new double [n];
        for (int i=0;i<=n-1;i=i+1)
        {
            System.out.println("ingrese el precio por Kg de:"+"   " +aFrutas[i]);
            aPrecio[i]=leer.nextDouble();
        }
        return aPrecio;
    }
    public static double [] LeeKilogramo(int n, String[] aFrutas)
    {
        double aKilogramo[]=new double [n];
        for (int i=0;i<=n-1;i=i+1)
        {
            System.out.println("ingrese cuantos kilogramos se tiene de:" + "  "+ aFrutas[i]);
            aKilogramo[i]=leer.nextDouble();
        }
        return aKilogramo;
    }
    public static double [] Calcula(int n, double [] aPrecio, double [] aKilogramo)
    {
        double aCalculo[]=new double [n];
        for(int i=0;i<n-1;i=i+1)
        {
            aCalculo[i]=aPrecio[i]*aKilogramo[i];
        }
        return aCalculo;
    }
    public static String [] Imprimir (int n, String [] aFruta, double [] aKilogramo, double [] aPrecio,double [] aCalculo)
    { 
        System.out.println("Tipo de Fruta"+ "      " + "Kg " +"    " +"Precio por Kg " +"   "+ "Total ");
        for (int j=0;j<=n-1;j=j+1)
        {
        System.out.println("======================================================================================");
        System.out.println(aFruta[j]    + "              " + aKilogramo[j]+ "          " + aPrecio[j] + "         " +aCalculo[j]);
        
        }
        return null;
    }
    public static void main(String[] args) 
    {
        System.out.println("ingrese la cantidad de elementos");
        int n=leer.nextInt();
        String[] F=LeerFrutas(n);
        double[] P=Leeprecio(n,F);
        double [] K=LeeKilogramo(n,F);
        double [] C=Calcula (n,P,K);
        String [] I=Imprimir (n,F,P,K,C);
    }
    
    
}
