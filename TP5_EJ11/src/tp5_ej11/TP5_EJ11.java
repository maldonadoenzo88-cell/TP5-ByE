 
package tp5_ej11;

import java.util.Scanner;

 
public class TP5_EJ11 {

     
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        
        System.out.print("Ingrese tamaño de la matriz N x N: ");
        int n = teclado.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

       
        System.out.println("\nSeleccione una opción:");
        System.out.println("1 - Sumar matrices");
        System.out.println("2 - Restar matrices");
        System.out.println("3 - Multiplicar matrices");

        int opcion = teclado.nextInt();

        
        System.out.println("\nIngrese valores de la Matriz 1");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz1[i][j] = teclado.nextInt();
            }
        }


        System.out.println("\nIngrese valores de la Matriz 2");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz2[i][j] = teclado.nextInt();
            }
        }

        
        switch (opcion) {

            case 1 -> {
              
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }

                System.out.println("\nResultado de la suma:");
            }

            case 2 -> {
               
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        resultado[i][j] = matriz1[i][j] - matriz2[i][j];
                    }
                }

                System.out.println("\nResultado de la resta:");
            }

            case 3 -> {
               
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        resultado[i][j] = 0;

                        for (int k = 0; k < n; k++) {

                            resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                        }
                    }
                }

                System.out.println("\nResultado de la multiplicación:");
            }

            default -> {
                System.out.println("Opción incorrecta.");
                return;
            }
        }

         
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(resultado[i][j] + "\t");
            }

            System.out.println();
        }

    }
    
}
