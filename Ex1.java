public class Ex1 {
    public static void main(String[] args) {
        
        int matriz [][] = new int [5][5];
        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++ ) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[linha][coluna] = 1;
                
                soma += matriz[linha][coluna];

                System.out.print(matriz[linha][coluna] + " ");
               
            }
            System.out.println(soma); 
        }

        System.out.println("A soma total da matriz é: " + soma);

    }
}