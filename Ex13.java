import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[10][10];
        int soma = 0;

        // Entrada dos elementos da matriz
        System.out.println("Digite os elementos da matriz A(10x10):");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("A[%d][%d] = ", i + 1, j + 1);
                A[i][j] = input.nextInt();
            }
        }

        // Soma dos elementos acima da diagonal principal
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) { // acima da diagonal: j > i
                soma += A[i][j];
            }
        }

        // Exibe o resultado
        System.out.println("\nSoma dos elementos acima da diagonal principal: " + soma);

        input.close();
    }
}
