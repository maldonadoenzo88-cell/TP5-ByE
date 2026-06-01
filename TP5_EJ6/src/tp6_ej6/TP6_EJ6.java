package tp6_ej6;

import java.util.Scanner;

public class TP6_EJ6 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        
        int empleados = 3;

        
        String[][] matriz = new String[empleados][3];

        
        for (int i = 0; i < empleados; i++) {

            System.out.println("Empleado " + (i + 1));

            System.out.print("Ingrese nombre: ");
            matriz[i][0] = teclado.nextLine();

            System.out.print("Ingrese edad: ");
            matriz[i][1] = teclado.nextLine();

            System.out.print("Ingrese sueldo: ");
            matriz[i][2] = teclado.nextLine();

            System.out.println();
        }

        
        System.out.println("Nombre\tEdad\tSueldo");

        for (int i = 0; i < empleados; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}
