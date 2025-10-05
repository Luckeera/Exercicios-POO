class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    
    public Pilha(int capacidadeMaxima) {
        if (capacidadeMaxima <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser um número positivo.");
        }
        this.capacidade = capacidadeMaxima;
        this.elementos = new int[capacidadeMaxima];
        this.topo = -1; // Inicialmente, a pilha está vazia
    }

    
    public void push(int valor) {
        if (topo == capacidade - 1) {
            // A pilha está cheia
            System.out.println("ERRO: Pilha cheia. Não foi possível inserir o valor " + valor);
            return;
        }
        topo++;
        elementos[topo] = valor;
        System.out.println("PUSH: Inserido " + valor);
    }

    
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("ERRO: Pilha vazia. Não é possível remover.");
        }
        int valor = elementos[topo];
        topo--;
        return valor;
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("ERRO: Pilha vazia. Não há elemento para consultar.");
        }
        return elementos[topo];
    }

    
    public boolean isEmpty() {
        return topo == -1;
    }
    
    /**
     * Método auxiliar para verificar se a pilha está cheia.
     * @return true se a pilha estiver cheia.
     */
    public boolean isFull() {
        return topo == capacidade - 1;
    }
}