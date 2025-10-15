class ListaSimples {
    private static class No {
        int valor;
        No proximo;
        No(int valor) { this.valor = valor; }
    }

    private No head;
    private int tamanho;

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = head;
        head = novo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (head == null) {
            head = novo;
        } else {
            No atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + pos);
        }
        if (pos == 0) {
            inserirNoInicio(valor);
            return;
        }
        No novo = new No(valor);
        No atual = head;
        for (int i = 0; i < pos - 1; i++) {
            atual = atual.proximo;
        }
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
    }

    public void removerNoInicio() {
        if (head == null) return;
        head = head.proximo;
        tamanho--;
    }

    public void removerNoFinal() {
        if (head == null) return;
        if (head.proximo == null) {
            head = null;
            tamanho = 0;
            return;
        }
        No atual = head;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = null;
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + pos);
        }
        if (pos == 0) {
            removerNoInicio();
            return;
        }
        No atual = head;
        for (int i = 0; i < pos - 1; i++) {
            atual = atual.proximo;
        }
        atual.proximo = atual.proximo.proximo;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        System.out.print("ListaSimples: ");
        No atual = head;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) System.out.print(" -> ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}