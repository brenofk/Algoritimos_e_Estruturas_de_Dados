import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] B = new int[9][9];
        int soma = 0;

        // Entrada dos valores da matriz
        System.out.println("Digite os elementos da matriz B(9x9):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("B[%d][%d] = ", i + 1, j + 1);
                B[i][j] = input.nextInt();
            }
        }

        // Soma dos elementos das linhas pares (considerando 1ª linha = linha 1)
        for (int i = 0; i < 9; i++) {
            if ((i + 1) % 2 == 0) { // linha par
                for (int j = 0; j < 9; j++) {
                    soma += B[i][j];
                }
            }
        }

        System.out.println("\nSoma dos elementos das linhas pares: " + soma);
        input.close();
    }
}
