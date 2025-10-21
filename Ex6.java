import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] A = new double[8][8];
        double[][] B = new double[8][8];
        double maiorDiagonal = Double.NEGATIVE_INFINITY;

        // Leitura da matriz A
        System.out.println("Digite os elementos da matriz A (8x8):");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextDouble();
                // Verifica se o elemento está na diagonal principal
                if (i == j && A[i][j] > maiorDiagonal) {
                    maiorDiagonal = A[i][j];
                }
            }
        }

        // Exibe o maior elemento da diagonal principal
        System.out.println("\nMaior elemento da diagonal principal: " + maiorDiagonal);

        // Criação da matriz B dividindo todos os elementos por 'maiorDiagonal'
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                B[i][j] = A[i][j] / maiorDiagonal;
            }
        }

        // Exibe a matriz B
        System.out.println("\nMatriz B (A dividida pelo maior da diagonal principal):");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.printf("%.2f\t", B[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
