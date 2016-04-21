
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roling Espinoza
 */
public class clasedejava {
    public static void main(String[] args) {
      /*  double  a=1;
        char c=9;
        int n=12;
        System.out.println(n+a);
        System.out.println(a-n);
        System.out.println("El valor numérico de c es:"+(int )c+"  y eso fue todo "  );
        */
        
      //*  int A,B,C,D;
        /*A=12;
        B=13;
        C=14;
        D=15;
        
        System.out.println("el valor de A es:"+C);
         System.out.println("el valor de B es:"+A);
          System.out.println("el valor de C es:"+D);
           System.out.println("el valor de D es:"+B);
           
           
           int n=3;
           n+=77;
           System.out.println("el valor de N es :"+n);
           n-=3;
           System.out.println("el nuevo valor de N es:"+n);
           n*=2;
           System.out.println("el nuevo valor de N es:"+n);
           */
      /*  int Q=127;
        if( Q >=0)
        {
        System.out.println(Q+"    es positivo");
        }
        else
        {
                System.out.println(Q+"     es  negativo");
                }
        
   */
        
        /*
        int b =0;
        int lim=20;
        Random r= new Random();
        b=r.nextInt(lim);
        System.out.println(b+(b>=0 ? "  es positivo":"   es negativo"));
             System.out.println(b+(b%2==0 ? "  es par":"  es impar"));
                  System.out.println(b+(b%5==0 ? "   es multiplo de cinco":"  no es multiplo de cinco"));
                       System.out.println(b+(b%10==0 ? "    es multiplo de diez":"   No es multiplo de diez"));
                        System.out.println(b+(b>100 ? "    es mayor que cien":"   No es mayor que cien"));
                        
                 Scanner d= new Scanner (System.in);
                 int n1,n2;
                 System.out.println("introduce un numero:");
                 n1=d.nextInt();
                 System.out.println("introduce el segundo numero:");
                 n2=d.nextInt();
                 
                 System.out.println("el primer número es:"+n1);
                 System.out.println("el segundo número es:"+n2);
                 */
          Scanner d= new Scanner (System.in);
          String cadena;
          System.out.println("introduce un nombre :");
          cadena=d.nextLine();
          System.out.println("buenas tardes:"+cadena);
          
          int k;
          System.out.println("ingresa un numero:");
          k=d.nextInt();
          System.out.println("el numero introducido es:"+k);
          System.out.println("el doble de "+k+"->"+2*k);
                System.out.println("el triple de "+k+"->"+3*k);
                double gradoscent;
                double grafaren;
               System.out.println("ingresa una cantidad en grados centigrados:");
               gradoscent=d.nextDouble();
               
               grafaren=32+(9*gradoscent/5);
               System.out.println(gradoscent+"°C="+grafaren+"°F");
    }
}
