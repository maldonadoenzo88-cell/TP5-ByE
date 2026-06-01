package tp5_ej10ad;

import java.util.Random;
import java.util.Scanner;

public class TP5_EJ10aD {

    public static void main(String[] args) {
            int[][] matriz = new int[5][7];

        llenarMatriz(matriz);

        mostrarMatriz(matriz);

        temperaturaSemana(matriz);

        promedioSemana(matriz);

        temperaturaMayorMes(matriz);
    }

   
    public static void llenarMatriz(int[][] matriz) {

        Random random = new Random();

        int dia = 1;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 7; j++) {

                if (dia <= 31) {
                    matriz[i][j] = random.nextInt(32) + 7;
                    dia++;
                }
            }
        }
    }

   
    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("Temperaturas del mes:");

        for (int i = 0; i < 7; i++) {
            System.out.print(dias[i] + "\t");
        }

        System.out.println();

        int dia = 1;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 7; j++) {

                if (dia <= 31) {
                    System.out.print(matriz[i][j] + "\t");
                    dia++;
                }
            }

            System.out.println();
        }
    }

    
    public static void temperaturaSemana(int[][] matriz) {

        for (int i = 0; i < 5; i++) {

            int mayor = matriz[i][0];
            int menor = matriz[i][0];

            int diaMayor = 0;
            int diaMenor = 0;

            for (int j = 0; j < 7; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    diaMayor = j;
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    diaMenor = j;
                }
            }

            System.out.println("\nSemana " + (i + 1));
            System.out.println("Mayor: " + mayor + "° - " + dias[diaMayor]);
            System.out.println("Menor: " + menor + "° - " + dias[diaMenor]);
        }
    }

   
    public static void promedioSemana(int[][] matriz) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIngrese semana para calcular promedio (1-5): ");
        int semana = teclado.nextInt();

        int suma = 0;

        for (int j = 0; j < 7; j++) {
            suma += matriz[semana - 1][j];
        }

        double promedio = (double) suma / 7;

        System.out.println("Promedio semana " + semana + ": " + promedio);
    }

    
    public static void temperaturaMayorMes(int[][] matriz) {

        int mayor = matriz[0][0];
        int semanaMayor = 0;
        int diaMayor = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 7; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    semanaMayor = i;
                    diaMayor = j;
                }
            }
        }

        System.out.println("\nTemperatura más alta del mes: " + mayor + "°");
        System.out.println("Semana: " + (semanaMayor + 1));
        System.out.println("Día: " + dias[diaMayor]);

    }
    
}
