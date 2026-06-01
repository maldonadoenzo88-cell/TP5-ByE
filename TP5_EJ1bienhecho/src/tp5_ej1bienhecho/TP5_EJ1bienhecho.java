package tp5_ej1bienhecho;

public class TP5_EJ1bienhecho {

    public static void main(String[] args) {
        int[][] matriz = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

int fila = 0;

while (fila < 3) {
int columna = 0;

while (columna < 3) {
System.out.print(matriz[fila][columna] + " ");
columna++;
}

System.out.println();
fila++;
}

    }
    
}
