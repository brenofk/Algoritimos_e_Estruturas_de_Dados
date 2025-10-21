import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[][] A = new int[n][n];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz A(6x6):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        // A diagonal secundária é formada pelos elementos onde i + j == n - 1
        int menor = A[0][n - 1]; // começa com o primeiro elemento da diagonal secundária

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i; // posição da coluna na diagonal secundária
            if (A[i][j] < menor) {
                menor = A[i][j];
            }
        }

        // Exibe o menor elemento da diagonal secundária
        System.out.println("\nO menor elemento da diagonal secundária é: " + menor);

        sc.close();
    }
}
