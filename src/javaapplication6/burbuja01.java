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
public class burbuja01 {
    public static void main(String[] args) {
        double [] Notas= {16,14,20,15,10};
        double Temp=0;
        for (int i=0;i<=4;i++)
        {
            for (int j=0;j<4;j++)
            {
                if (Notas[i]>Notas[j])
                {
                    Temp=Notas[i];
                    Notas[i]=Notas[j];
                    Notas[j]=Temp;
                }
            }
        }
        for (int k=0; k<4;k++)
        {
            System.out.println(Notas[k]+"");
        }
    }
    
}
