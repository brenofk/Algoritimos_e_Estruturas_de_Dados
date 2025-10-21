import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        
        System.out.println("Digite os elementos da matriz 6x6:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 6; i++) {
            somaDiagonalSecundaria += matriz[i][5 - i];
        }
        
        System.out.println("Soma dos elementos da diagonal secundária: " + somaDiagonalSecundaria);
        
        scanner.close();
    }
}
