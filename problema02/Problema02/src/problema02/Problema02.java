/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //Declarar variables
       
         double Base;
         double Altura;
         double Area;
         
          System.out.println("Ingrese Base Del Triangulo");
          Base = entrada.nextDouble();
        
         System.out.println("Ingrese Altura Del Triangulo");
         Altura = entrada.nextDouble();
         
         Area = (Base * Altura) / 2;
         
         System.out.printf("\n======\nCALCULO DEL AREA DEL TRIANGULO\n======\n"
                 + "Base: %.2f\nAltura: %.2f\n------\nAREA DEL TRIANGULO:%.2f\n"
                 + "=========\n", 
                   Base,
                   Altura,
                   Area);
                 
         
    }
    
}
