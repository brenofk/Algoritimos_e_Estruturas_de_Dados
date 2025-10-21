import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhasA = 4, colunasA = 6;
        int linhasB = 6, colunasB = 4;
        double[][] A = new double[linhasA][colunasA];
        double[][] B = new double[linhasB][colunasB];
        double[][] C = new double[linhasA][colunasB]; // Resultado 4x4

        // Leitura da matriz A
        System.out.println("Digite os elementos da matriz A (4x6):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextDouble();
            }
        }

        // Leitura da matriz B
        System.out.println("\nDigite os elementos da matriz B (6x4):");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextDouble();
            }
        }

        // Cálculo do produto matricial C = A * B
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colunasA; k++) { // ou linhasB, que são iguais (6)
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibição da matriz C
        System.out.println("\nMatriz C (resultado do produto A x B):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("%.2f\t", C[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
