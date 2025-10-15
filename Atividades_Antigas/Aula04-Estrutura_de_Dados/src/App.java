
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicios Estrutura de Dados - Pilha e Fila\n");
        
        System.out.println("\n--- Exercicio 1 ---");
        System.out.println("Um aplicativo de edicao de texto que tenha a funcao de ctrl + z, ou seja desfazer a ultima acao feita. Qual estrutura de dados e a mais indicada ? ");
        System.out.println("A pilha é a mais indicada para este caso, pois a operação de desfazer a última ação feita é a principal a acao da pilha, alterar sempre o topo da pilha.");
        
        
        System.out.println("\n--- Exercicio 2 ---");
        System.out.println("Estrutura: Pilha. \nPor quê?: Porque a pilha é LIFO (Last-In, First-Out). Se o exame mais novo (o último a entrar) tem que ser o primeiro a sair/imprimir, a pilha faz isso automaticamente. \nImplementação: Lista Encadeada. \nPor quê?: Para não ter limite de tamanho. Um array pode encher, mas a lista cresce à vontade, o que é mais seguro para um hospital que pode ter muitos exames.");
        
        System.out.println("\n--- Exercicio 3 ---");
        System.out.println("Ordem de Execução Final: \nPilha (Tarefas Prioritárias)\nFila (Tarefas Comuns)\nJustificativa:\nO sistema resolve a Pilha primeiro porque é a fila de prioridades.\nPrioritárias (Pilha): Saem em ordem LIFO. A última prioridade que entrou é a primeira a ser feita.\nComuns (Fila): Só depois que a pilha zera, as tarefas comuns são resolvidas em FIFO (First-In, First-Out), ou seja, a tarefa mais antiga é feita primeiro.");
        System.out.println("\n--- Exercicio 4 ---");
        final int CAPACIDADE = 5;
        Pilha p = new Pilha(CAPACIDADE);
        
        System.out.println("\n--- Inserindo 3 Valores na Pilha ---");
        p.push(11);
        p.push(22);
        p.push(33);

        System.out.println("\n--- Consultando o Topo da Pilha (Peek) ---");
        try {
            System.out.println("PILHA PEEK: Elemento no topo: " + p.peek());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Removendo Todos os Elementos da Pilha (Pop) ---");
        int contadorPilha = 1;
        while (!p.isEmpty()) {
            try {
                int elementoRemovido = p.pop();
                System.out.println("PILHA POP " + contadorPilha + ": Removido " + elementoRemovido);
                contadorPilha++;
            } catch (RuntimeException e) {
                break;
            }
        }
        System.out.println("PILHA: Apos remocoes, esta vazia? " + p.isEmpty());


        
        System.out.println("\n--- Exercicio 5 ---");
        Fila f = new Fila(CAPACIDADE);
        
        System.out.println("\n--- Inserindo 3 Valores na Fila ---");
        f.enqueue(100);
        f.enqueue(200);
        f.enqueue(300);

        System.out.println("\n--- Consultando o Inicio da Fila (Peek) ---");
        try {
            System.out.println("FILA PEEK: Primeiro elemento: " + f.peek());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Removendo Todos os Elementos da Fila (Dequeue) ---");
        int contadorFila = 1;
        while (!f.isEmpty()) {
            try {
                int elementoRemovido = f.dequeue();
                System.out.println("FILA DEQUEUE " + contadorFila + ": Removido " + elementoRemovido);
                contadorFila++;
            } catch (RuntimeException e) {
                break;
            }
        }
        System.out.println("FILA: Apos remocoes, esta vazia? " + f.isEmpty());
    }
}
