/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatic;
import java.util.Scanner;
public class CAJEROAUTOMATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cajero = new Scanner(System.in);
        System.out.println("Bienvenido a su cajero automatico");
        System.out.println("Seleccione una de las opciones");
        System.out.println("1° Consultar saldo");
        System.out.println("2° Depositar dinero");
        System.out.println("3° Retirar dinero");
        int opciones = cajero.nextInt();
        
        double sal = 14537.83;
      
        
        switch (opciones){
            case 1:
                sal = sal;
                    System.out.println("Su saldo es " +sal);
                break;
            case 2:
                System.out.println("Cual es la cantidad a depositar");
                double depos = cajero.nextDouble();
                sal += depos;
            System.out.println("El saldo es " +sal);
                break;
            case 3:
                System.out.println("Cual es la cantidad a retirar");
                double retiro = cajero.nextDouble();
                sal -= retiro;
                if (retiro <=(14537.83)){
                    System.out.println("El retiro fue existoso");
                }else{
                    System.out.println("Fondos insuficientes");
                }
            break;
            default: 
                System.out.println("Por favor selecciona una opcion valida");
                break;
        }
    }
    
}
