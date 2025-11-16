/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_for_piramides;
import java.util.Scanner;
/**
 *
 * @author Rafae
 */
public class Ejercicio_for_piramides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pedimos el numero de pisos
        Scanner scan=new Scanner(System.in);
        System.out.println("Por favor introduce un numero de pisos para una piramide: \n");
        
        int pisos= scan.nextInt();
        int contador=pisos;
        
        System.out.println("Piramide recta: \n");
        for(int i = 0; i<=pisos; i++){ 
            System.out.print(" ");
            //escribimos las estrellas necesarias en cada fila
             for(int j = 0; j<i; j++){
            System.out.print("* ");
             }
             System.out.print(" \n ");
        }
        
        System.out.println("Ahora hacemos una piramide como en Egypto: \n");
        
         for(int i = 0; i<=pisos; i++){ 
             for(int h=contador;h>0;h--){ 
                 //creamos los espacios para centrar la piramide
            System.out.print(" ");
             }
             contador--;
             for(int j = 0; j<i; j++){
            System.out.print("* ");
             }
             System.out.print(" \n ");
        } 
         
             System.out.println("Piramide alreves\n");
           for(int i = 0; i<=pisos; i++){ 
            //escribimos las estrellas necesarias en cada fila
             for(int j = pisos; j>i; j--){
            System.out.print("* ");
             }
             System.out.print("\n");
        }
           
           contador=0;
           System.out.println("Piramide alreves como Egipto\n");
            for(int i = 0; i<=pisos; i++){ 
                //escribimos los espacios
                for(int h=0;h<contador;h++){
                System.out.print(" ");
                }
            //escribimos las estrellas necesarias en cada fila
             for(int j = pisos; j>i; j--){
            System.out.print("* ");
             }
             contador++;
             System.out.print("\n");
        }
    }
    
}
