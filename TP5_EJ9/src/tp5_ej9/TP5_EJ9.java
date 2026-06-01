package tp5_ej9;

public class TP5_EJ9 {

    public static void main(String[] args) {
       
        int[][] matriz = {
                {4, 5, 0},
                {2, 7, 0},
                {10, 3, 0},
                {6, 8, 0}
        };

       
        for (int[] matriz1 : matriz) {
            matriz1[2] = matriz1[0] + matriz1[1];
        }

       
        System.out.println("Numero 1\tNumero 2\tResultado");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[j] + "\t\t");
            }
            System.out.println();
        }

    }
    
}
