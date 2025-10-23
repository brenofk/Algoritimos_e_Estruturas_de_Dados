import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[6][6];

        // Entrada dos elementos da matriz A
        System.out.println("Digite os elementos da matriz A(6x6):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("A[%d][%d] = ", i + 1, j + 1);
                A[i][j] = input.nextInt();
            }
        }

        // Multiplica cada linha pelo elemento da diagonal principal correspondente
        for (int i = 0; i < 6; i++) {
            int multiplicador = A[i][i]; // elemento da diagonal principal
            for (int j = 0; j < 6; j++) {
                A[i][j] *= multiplicador;
            }
        }

        // Exibe a matriz alterada
        System.out.println("\nMatriz A alterada:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%6d", A[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
