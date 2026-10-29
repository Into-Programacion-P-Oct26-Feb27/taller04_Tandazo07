/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String Titular;
        String Direccion;
        double CostoPorMinuto;
        double MinutosConsumidos;
        double Valor_Pagar;
        
        System.out.println("Ingrese nombre del Titular");
        Titular = entrada.nextLine();
        
         System.out.println("Ingrese nombre de la Direccion");
        Direccion = entrada.nextLine();
        
        System.out.println("Ingrese Costo por Minuto");
        CostoPorMinuto = entrada.nextDouble();
        
         System.out.println("Ingrese Minutos consumidos");
         MinutosConsumidos = entrada.nextDouble();
         
         Valor_Pagar = CostoPorMinuto * MinutosConsumidos;
         
         System.out.printf("\n======\nPLANILLA DE SERVICIO TELEFONICO\n======"
                 + "Titular: %s\n Direccion: %s\n------\nCostoPorMinuto:$%.2f\n"
                 + "MinutosConsumidos: $%.0f\n-------\nValor Total a Pagar:$%.2f\n"
                 + "========\n",
        
                Titular,
                Direccion,
                CostoPorMinuto,
                MinutosConsumidos,
                Valor_Pagar);
                  
    }
    
}
