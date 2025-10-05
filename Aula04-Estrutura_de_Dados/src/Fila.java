class Fila {
        private int[] elementosFila;
        private int inicio;
        private int fim;
        private int total;
        private int capacidadeFila;

        public Fila(int capacidade) {
            this.capacidadeFila = capacidade;
            this.elementosFila = new int[capacidade];
            this.inicio = 0;
            this.fim = -1;
            this.total = 0;
        }

        public void enqueue(int valor) {
            if (total == capacidadeFila) {
                System.out.println("ERRO: Fila cheia. Nao foi possivel inserir " + valor);
                return;
            }
            fim++;
            elementosFila[fim] = valor;
            total++;
            System.out.println("FILA ENQUEUE: Inserido " + valor);
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new RuntimeException("ERRO: Fila vazia. Nao e possivel remover.");
            }
            int valor = elementosFila[inicio];
            inicio++;
            total--;

            if (total == 0) {
                inicio = 0;
                fim = -1;
            }
            return valor;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("ERRO: Fila vazia. Nao ha elemento para consultar.");
            }
            return elementosFila[inicio];
        }

        public boolean isEmpty() {
            return total == 0;
        }
    }