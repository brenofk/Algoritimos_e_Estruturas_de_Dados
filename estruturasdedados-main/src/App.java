import lista.ListaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {

        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        lista.adiciona(1);
        lista.adiciona(5);
        lista.adiciona(2);
        System.out.println(lista.toString());

        ListaEncadeada<Integer> lista2 = new ListaEncadeada<Integer>();
        lista2.adicionaInicio(1);
        lista2.adicionaInicio(5);
        lista2.adicionaInicio(2);
        System.out.println(lista2.toString());
        
        System.out.println("\nPercorrendo lista2:");
        lista2.percorre();

        // Mostrar tamanho
        System.out.println("\nTamanho da lista2: " + lista2.tamanho());

        // Buscar nó por valor
        System.out.println("\nBuscando elemento 5:");
        System.out.println(lista2.buscaElemento(5));

        // Remover do início
        System.out.println("\nRemovendo do início:");
        lista2.removeInicio();
        lista2.percorre();

        // Remover do final
        System.out.println("\nRemovendo do final:");
        lista2.removeFinal();
        lista2.percorre();

        // Adiciona mais elementos para testar remoção por posição
        lista2.adiciona(10);
        lista2.adiciona(20);
        lista2.adiciona(30);
        System.out.println("\nApós adicionar mais elementos:");
        lista2.percorre();

        // Remover da posição 1 (segunda posição)
        System.out.println("\nRemovendo da posição 1:");
        lista2.remove(1);
        lista2.percorre();







    }
}
