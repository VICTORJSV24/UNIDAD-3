/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parimpar;
import java.util.Scanner;
/**
 *
 * @author Sala
 */
public class Parimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner e =new Scanner(System.in);
        System.out.println("ingresa el numero");
        numero=e.nextInt();
        
        if (numero%2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }
    
}
