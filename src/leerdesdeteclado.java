
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
public class leerdesdeteclado {
    public static void main(String[] args) throws IOException {
        
    
    BufferedReader br = new  BufferedReader  (new InputStreamReader(System.in));
    String toor= br.readLine();
   System.out.println("El valor de toor  es :"+toor);
    }
}
