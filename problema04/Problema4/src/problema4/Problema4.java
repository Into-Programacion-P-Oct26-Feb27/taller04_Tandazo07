/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
         String NombresCliente;
         double CPU;
         double Teclado;
         double Raton;
         double Pantalla;
         double CostoBase;
         double CostoAdicional;
         double CostoFinal;
         
         System.out.println("Nombres del Cliente:");
        NombresCliente = entrada.nextLine();
        
         System.out.println("Ingrese costo de CPU/Torre:");
         CPU = entrada.nextDouble();
        
        System.out.println("Ingrese costo de Teclado");
        Teclado = entrada.nextDouble();
        
         System.out.println("Ingrese costo de Raton");
         Raton = entrada.nextDouble();
         
         System.out.println("Ingrese costo de Pantalla");
         Pantalla = entrada.nextDouble();
    
         CostoBase = CPU + Teclado + Raton + Pantalla;
         CostoAdicional = CostoBase * 0.15;
         CostoFinal = CostoBase + CostoAdicional;
         
         
         System.out.printf("\nReporte: \nNombres del Cliente: %s\n"
                 + "Valores iniciales: \nCPU: $%.1f\nTeclado: $%.1f\n"
                 + "Raton: $%.1f\nPantalla: $%.1f\n\nCosto base: $%.0f\n"
                 + "Costo adicional del 15%%: %.2f\n"
                 + "Costo final: $%.2f\n",
                 NombresCliente,
                 CPU,
                 Teclado,
                 Raton,
                 Pantalla,
                 CostoBase,
                 CostoAdicional,
                 CostoFinal);
             
         
         
    }
    
}
