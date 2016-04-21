
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roling Espinoza
 */
public class opearcionesconrealesyenteros {
    private static Object integer;
    public static void main(String[] args) throws IOException {
        int a,b;
        double x,y;
        
        BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
        System.out.println("escribe un numero entero:");
        a=Integer.parseInt(br.readLine());
         System.out.println("escribe un segundo  numero entero:");
        b=Integer.parseInt(br.readLine());
         System.out.println("escribe un numero real:");
        x=Double.parseDouble(br.readLine());
         System.out.println("escribe otro  numero real:");
        y=Double.parseDouble(br.readLine());
        
              System.out.println("NUMEROS ENTEROS");
        System.out.println("a+b="+(a+b));
              System.out.println("a-b="+(a-b));    
              System.out.println("a*b="+(a*b));
              System.out.println("a/b="+(a/b));
              System.out.println("a%b="+(a%b));
              System.out.println("NUMEROS REALES");
              System.out.println("x+y="+(x+y));
                  System.out.println("x-y="+(x-y));
                      System.out.println("x*y="+(x*y));
                          System.out.println("x/y="+(x/y));
                              System.out.println("x%y="+(x%y));
                              
                            
                              System.out.println("NUMERO ENTERO Y NUMERO REAL");  
                              System.out.println("a+x="+(a+x));
                              System.out.println("a-x="+(a-x));
                              System.out.println("a*x="+(a*x));
                              System.out.println("a/x="+(a/x));
                              System.out.println("a%x="+(a%x));
                              
                              System.out.println("b+x="+(b+x));
                              System.out.println("b-x="+(b-x));
                              System.out.println("b*x="+(b*x));
                              System.out.println("b/x="+(b/x));
                              System.out.println("b%x="+(b%x));
                              
                              System.out.println("b+y="+(b+y));
                              System.out.println("b-y="+(b-y));
                              System.out.println("b*y="+(b*y));
                              System.out.println("b/y="+(b/y));
                              System.out.println("b%y="+(b%y));
                                                         
                               System.out.println("a+y="+(a+y));
                              System.out.println("a-y="+(a-y));
                              System.out.println("a*y="+(a*y));
                              System.out.println("a/y="+(a/y));
                              System.out.println(a+"+"+y+"="+(a+y));
                                                         
                                            
                              
    }
}
