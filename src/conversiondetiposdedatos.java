/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roling Espinoza
 */
public class conversiondetiposdedatos {
    public static void main(String[] args) {
        int a=12;
        int b=123;
        double c=0.4;
        c=a; // implicita 
        a=(int)c; // explicita o casting
        
        String r="123";
        
        b=Integer.parseInt(r);
        c=Double.parseDouble(r);
        System.out.println("");
    }
}
