 
package tp5_beej3;

import java.util.Scanner;

 
public class TP5_BEEJ3 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

      
        int[][] matriz = new int[filas][columnas];

               System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

             System.out.println("\nLa matriz ingresada es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}
