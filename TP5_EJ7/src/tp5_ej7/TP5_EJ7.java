package tp5_ej7;

import java.util.Scanner;

public class TP5_EJ7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       
        System.out.print("Ingrese cantidad de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese cantidad de columnas: ");
        int columnas = teclado.nextInt();

       
        int[][] matriz = new int[filas][columnas];

        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        int suma = 0;
        int contador = 0;

     
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] > 0 && matriz[i][j] % 2 != 0) {
                    suma = suma + matriz[i][j];
                    contador++;
                }
            }
        }

      
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No hay números positivos impares.");
        }

    }
    
}
