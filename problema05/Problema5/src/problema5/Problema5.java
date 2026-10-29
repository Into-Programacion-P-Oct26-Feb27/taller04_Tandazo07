/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       String nombreCliente;
        double precioNetflix;
        double precioYoutube;
        double precioDropbox;
        double precioSpotify;
        double descuentoNetflix;
        double descuentoYoutube;
        double descuentoDropbox;
        double descuentoSpotify;
        double finalNetflix;
        double finalYoutube;
        double finalDropbox;
        double finalSpotify;
        double totalSinDescuento;
        double ahorroTotal;
        double totalAPagar;
 
        System.out.print("Ingrese el nombre del cliente: ");
        nombreCliente = entrada.nextLine();
 
        System.out.print("Ingrese el precio de Netflix: ");
        precioNetflix = entrada.nextDouble();
 
        System.out.print("Ingrese el precio de YouTube Premium: ");
        precioYoutube = entrada.nextDouble();
 
        System.out.print("Ingrese el precio de Dropbox: ");
        precioDropbox = entrada.nextDouble();
 
        System.out.print("Ingrese el precio de Spotify: ");
        precioSpotify = entrada.nextDouble();
 
        descuentoNetflix = precioNetflix * 0.23;
        descuentoYoutube = precioYoutube * 0.23;
        descuentoDropbox = precioDropbox * 0.45;
        descuentoSpotify = 0;
 
        finalNetflix = precioNetflix - descuentoNetflix;
        finalYoutube = precioYoutube - descuentoYoutube;
        finalDropbox = precioDropbox - descuentoDropbox;
        finalSpotify = precioSpotify - descuentoSpotify;
 
        totalSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        ahorroTotal = descuentoNetflix + descuentoYoutube + descuentoDropbox + descuentoSpotify;
        totalAPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;
 
         System.out.printf("\nReporte: \nNombre del Cliente: %s\n"
                + "\nPrecios originales: \nNetflix: $%.2f\nYouTube Premium: $%.2f\n"
                + "Dropbox: $%.2f\nSpotify: $%.2f\n"
                + "\nDescuentos: \nNetflix (23%%): $%.2f\nYouTube Premium (23%%): $%.2f\n"
                + "Dropbox (45%%): $%.2f\nSpotify (0%%): $%.2f\n"
                + "\nPrecios finales: \nNetflix: $%.2f\nYouTube Premium: $%.2f\n"
                + "Dropbox: $%.2f\nSpotify: $%.2f\n"
                + "\nCosto mensual total sin descuentos: $%.2f\n"
                + "Ahorro mensual total: $%.2f\n"
                + "Total a pagar mensualmente: $%.2f\n",
                nombreCliente,
                precioNetflix,
                precioYoutube,
                precioDropbox,
                precioSpotify,
                descuentoNetflix,
                descuentoYoutube,
                descuentoDropbox,
                descuentoSpotify,
                finalNetflix,
                finalYoutube,
                finalDropbox,
                finalSpotify,
                totalSinDescuento,
                ahorroTotal,
                totalAPagar);
      
        
    }
    
}
