/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Roling Espinoza
 */
public class ejercioacertarnumero {
    public static void main(String[] args) throws IOException {
        int numero;
        int n;
           String respuesta="";
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
            
        JOptionPane.showMessageDialog(null, "Atrevete a jugar este interesante juego ¿Aceptas el desafio?");
         String respuest = JOptionPane.showInputDialog("Escribe tu nombre","adksodsjdsdsds");
        

        System.out.println("ACIERTA EL NUMERO :");
        System.out.println("--------------------------------------------------------------------");
        Random r= new Random();
         numero= r.nextInt(100);
       System.out.println(numero);
             

        do
        { 
        System.out.print("ingresa el numero que piensas que es el correcto:");
         n=Integer.parseInt(br.readLine());
        if (n==numero)
        {
             JOptionPane.showMessageDialog(null, " ACERTASTE!!! \n ¡Felicitaciones!!!  \n TIENES UN GRAN POTENCIAL!! ");
            System.out.println("ACERTASTE!!! \n ¡Felicitaciones!!!  \n TIENES UN GRAN POTENCIAL!!");
        }
        else if(numero>n)
            {
                System.out.println("el numero es mayor que el ingresado");
            }
            else 
            if(numero<n)
            {
                    System.out.println("el numero es menor que el ingresado");
            }
        System.out.print("quieres continuar?  s/n:");
        respuesta =br.readLine();
        
        } while( respuesta.equals("s") && n!=numero);
       
    }


   
    
}
