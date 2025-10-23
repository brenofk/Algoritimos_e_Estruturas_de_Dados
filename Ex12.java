import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] A = new double[12][12];
        double soma = 0;
        int contador = 0;

        // Entrada dos elementos da matriz
        System.out.println("Digite os elementos da matriz A(12x12):");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("A[%d][%d] = ", i + 1, j + 1);
                A[i][j] = input.nextDouble();
            }
        }

        // Soma dos elementos abaixo da diagonal principal
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < i; j++) { // elementos abaixo da diagonal principal
                soma += A[i][j];
                contador++;
            }
        }

        // Calcula a média
        double media = soma / contador;

        // Exibe o resultado
        System.out.println("\nMédia aritmética dos elementos abaixo da diagonal principal: " + media);

        input.close();
    }
}
