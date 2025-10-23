import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        Random random = new Random();

        // Preenche a matriz A com valores aleatórios de 1 a 99
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = random.nextInt(99) + 1;
            }
        }

        System.out.println("Matriz original:");
        exibirMatriz(A);

        // a) Trocar linha 2 com linha 8 (índices 1 e 7)
        for (int j = 0; j < 10; j++) {
            int temp = A[1][j];
            A[1][j] = A[7][j];
            A[7][j] = temp;
        }

        // b) Trocar coluna 4 com coluna 10 (índices 3 e 9)
        for (int i = 0; i < 10; i++) {
            int temp = A[i][3];
            A[i][3] = A[i][9];
            A[i][9] = temp;
        }

        // c) Trocar diagonal principal com a secundária
        for (int i = 0; i < 10; i++) {
            int temp = A[i][i];
            A[i][i] = A[i][9 - i];
            A[i][9 - i] = temp;
        }

        // d) Trocar linha 5 com coluna 10 (índices 4 e 9)
        for (int i = 0; i < 10; i++) {
            int temp = A[4][i];
            A[4][i] = A[i][9];
            A[i][9] = temp;
        }

        System.out.println("\nMatriz atualizada:");
        exibirMatriz(A);
    }

    // Método para exibir a matriz formatada
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}
