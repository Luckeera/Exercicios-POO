class ListaDupla {
    private static class No {
        int valor;
        No anterior;
        No proximo;
        No(int valor) { this.valor = valor; }
    }

    private No head;
    private No tail;
    private int tamanho;

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = head;
        if (head != null) {
            head.anterior = novo;
        } else {
            tail = novo;
        }
        head = novo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (tail == null) {
            head = tail = novo;
        } else {
            novo.anterior = tail;
            tail.proximo = novo;
            tail = novo;
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
        if (pos == tamanho) {
            inserirNoFinal(valor);
            return;
        }
        No atual = getNodeAt(pos);
        No novo = new No(valor);
        novo.anterior = atual.anterior;
        novo.proximo = atual;
        atual.anterior.proximo = novo;
        atual.anterior = novo;
        tamanho++;
    }

    public void removerNoInicio() {
        if (head == null) return;
        head = head.proximo;
        if (head != null) head.anterior = null; else tail = null;
        tamanho--;
    }

    public void removerNoFinal() {
        if (tail == null) return;
        tail = tail.anterior;
        if (tail != null) tail.proximo = null; else head = null;
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
        if (pos == tamanho - 1) {
            removerNoFinal();
            return;
        }
        No atual = getNodeAt(pos);
        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        System.out.print("ListaDupla: ");
        No atual = head;
        while (atual != null) {
            System.out.print(atual.valor);
            if (atual.proximo != null) System.out.print(" <-> ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    private No getNodeAt(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida: " + pos);
        }
        if (pos <= tamanho / 2) {
            No atual = head;
            for (int i = 0; i < pos; i++) atual = atual.proximo;
            return atual;
        } else {
            No atual = tail;
            for (int i = tamanho - 1; i > pos; i--) atual = atual.anterior;
            return atual;
        }
    }
}