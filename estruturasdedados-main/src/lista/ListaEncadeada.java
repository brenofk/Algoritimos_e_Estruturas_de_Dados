package lista;

public class ListaEncadeada<T> {
    private No<T> inicio = null;
    private No<T> fim = null;
    private int tamanho = 0;

    // adiciona um elemento
    public void adiciona(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            this.inicio = novoNo;
        } else {
            this.fim.setProximo(novoNo);
        }
        this.fim = novoNo;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<T>(elemento);
        if (tamanho == 0) {
            this.fim = novoNo;

        } else {
            novoNo.setProximo(inicio);
        }
        this.inicio = novoNo;
        this.tamanho++;
    }


    public No<T> busca(int posicao){
        No<T> noAtual = this.inicio;
        for(int i =0;i<posicao;i++){
            noAtual=noAtual.getProximo();
        }
        return noAtual;
    }

    public void adiciona(int posicao, T elemento){
        if (posicao==0){
            this.adicionaInicio(elemento);
        }else{
            if(posicao == tamanho){
                this.adiciona(elemento);
            }else{
                No<T> noAnterior = busca(posicao-1);
                No<T> proximoNo = noAnterior.getProximo(); //ou busca(posicao);
                No<T> novoNo = new No<T>(elemento);
                noAnterior.setProximo(novoNo);
                novoNo.setProximo(proximoNo);
                this.tamanho++;
            }
        }
    }

    // Quantiade de No
    public int tamanho () {
        return this.tamanho;
    }

    // Percorre a lista
    public void percorre() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getElemento() + " => ");
            atual = atual.getProximo();
        }
        System.out.println("vazio");
    }

    // Pesquisa um nó por valor
    public No<T> buscaElemento(T elemento) {
        No<T> atual = inicio;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return atual;
            }
            atual = atual.getProximo();
        }
        return null;
    }

    // Remove o inicio
    public void removeInicio() {
        if (tamanho == 0) return;
        inicio = inicio.getProximo();
        tamanho--;
        if (tamanho == 0) fim = null;
    }

    // Remove o final;
    public void removeFinal() {
        if (tamanho == 0) return;
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            No<T> penultimo = busca(tamanho - 2);
            penultimo.setProximo(null);
            fim = penultimo;
        }
        tamanho--;
    }

    // Remove qualquer posicao
    public void remove(int posicao) {
        if (posicao == 0) {
            removeInicio();
        } else if (posicao == tamanho - 1) {
            removeFinal();
        } else {
            No<T> anterior = busca(posicao - 1);
            No<T> atual = anterior.getProximo();
            anterior.setProximo(atual.getProximo());
            tamanho--;
        }
    }

    // Acessar elemento pela posicao
    public T get(int posicao) {
        return busca(posicao).getElemento();
    }

    // Busca um elemento pelo valor
    public boolean contem(T elemento) {
        return buscaElemento(elemento) != null;
    }


    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + "]";
    }

}
