/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2;
import java.util.Scanner;
/**
 *
 * @author Sala
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        int num = leer.nextInt();
        
        int c1 = 0;
        int c2 = 1;
        
        for (int i = 0; i < num; i++) {
            
            
            int sum = c1 + c2;
            c1 = c2;
            c2 = sum;
            
            System.out.println("La suma es "+sum);
        }
    }
    
}
