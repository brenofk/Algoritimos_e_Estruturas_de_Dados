import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhas = 7;
        int colunas = 6;
        int[][] A = new int[linhas][colunas];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz A(7x6):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        // Soma dos elementos da linha 5 (índice 4)
        int somaLinha5 = 0;
        for (int j = 0; j < colunas; j++) {
            somaLinha5 += A[4][j];
        }

        // Soma dos elementos da coluna 3 (índice 2)
        int somaColuna3 = 0;
        for (int i = 0; i < linhas; i++) {
            somaColuna3 += A[i][2];
        }

        // Exibe os resultados
        System.out.println("\nSoma dos elementos da linha 5: " + somaLinha5);
        System.out.println("Soma dos elementos da coluna 3: " + somaColuna3);
        System.out.println("Soma total (linha 5 + coluna 3): " + (somaLinha5 + somaColuna3));

        sc.close();
    }
}
