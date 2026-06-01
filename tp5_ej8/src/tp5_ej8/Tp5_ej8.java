package tp5_ej8;

import java.util.Scanner;

public class Tp5_ej8 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese una frase: ");
        String frase = teclado.nextLine();

       
        String[] palabras = frase.split(" ");

       
        System.out.println("\nPalabra\tCantidad de letras");

        for (String palabra : palabras) {
            System.out.println(palabra + "\t" + palabra.length());
        }

    }
    
}