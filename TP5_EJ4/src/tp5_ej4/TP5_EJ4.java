package tp5_ej4;

import java.util.Scanner;

public class TP5_EJ4 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

             System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = teclado.nextInt();

        teclado.nextLine(); 

       
        String[][] matriz = new String[filas][columnas];

        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i == 0) {
                    
                    System.out.print("Ingrese un nombre para [" + i + "][" + j + "]: ");
                    matriz[i][j] = teclado.nextLine();
                } else {
             
                    System.out.print("Ingrese un número para [" + i + "][" + j + "]: ");
                    matriz[i][j] = teclado.nextLine();
                }
            }
        }

  
        System.out.println("\nMatriz cargada:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

    }
    
}
