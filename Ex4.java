import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas = 7;
        int colunas = 6;
        int[][] matriz = new int[linhas][colunas];
        
        System.out.println("Digite os elementos da matriz 7x6:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int somaLinha5 = 0;
        for (int j = 0; j < colunas; j++) {
            somaLinha5 += matriz[5][j];
        }
        
        int somaColuna3 = 0;
        for (int i = 0; i < linhas; i++) {
            somaColuna3 += matriz[i][3];
        }
        
        System.out.println("Soma dos elementos da linha 5: " + somaLinha5);
        System.out.println("Soma dos elementos da coluna 3: " + somaColuna3);
        
        scanner.close();
    }
}
