import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] M = new double[6][6];
        double[] V = new double[36];
        double A;
        int pos = 0;

        // Leitura da matriz M
        System.out.println("Digite os elementos da matriz M (6x6):");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = input.nextDouble();
            }
        }

        // Leitura do valor A
        System.out.print("\nDigite o valor de A: ");
        A = input.nextDouble();

        // Multiplica cada elemento da matriz por A e armazena no vetor V
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                V[pos] = M[i][j] * A;
                pos++;
            }
        }

        // Exibe o vetor V
        System.out.println("\nVetor V (M * A):");
        for (int i = 0; i < V.length; i++) {
            System.out.printf("V[%d] = %.2f\n", i, V[i]);
        }

        input.close();
    }
}
