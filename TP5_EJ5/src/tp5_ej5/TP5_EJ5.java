package tp5_ej5;

public class TP5_EJ5 {

    public static void main(String[] args) {
             
        String[][] matriz = {
                {"Juan", "10", "Pedro"},
                {"20", "Ana", "30"},
                {"Luis", "40", "Maria"}
        };

        
        System.out.println("Matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }

        
        System.out.println("\nNombres:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

               
                if (!matriz[i][j].matches("[0-9]+")) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

        System.out.println("\nNumeros:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                
                if (matriz[i][j].matches("[0-9]+")) {
                    System.out.println(matriz[i][j]);
                }
            }
        }

    }
    
}
