public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Questão 1 – Lista Encadeada Simples\n");
        ListaSimples listaS = new ListaSimples();

        System.out.println("Usando ListaSimples:");
        listaS.inserirNoInicio(10); // [10]
        listaS.inserirNoFinal(30);  // [10 -> 30]
        listaS.inserirNaPosicao(1, 20); // [10 -> 20 -> 30]
        listaS.exibir();
        System.out.println("Tamanho: " + listaS.tamanho());

        listaS.removerNoInicio(); // [20 -> 30]
        listaS.exibir();
        System.out.println("Tamanho: " + listaS.tamanho());

        listaS.removerNoFinal(); // [20]
        listaS.exibir();
        System.out.println("Tamanho: " + listaS.tamanho());

        listaS.inserirNoFinal(40); // [20 -> 40]
        listaS.inserirNoFinal(50); // [20 -> 40 -> 50]
        listaS.exibir();
        listaS.removerNaPosicao(1); // [20 -> 50]
        listaS.exibir();
        System.out.println("Tamanho: " + listaS.tamanho());

        System.out.println("\nQuestão 2 – Lista Duplamente Encadeada\n");
        ListaDupla listaD = new ListaDupla();

        System.out.println("Usando ListaDupla:");
        listaD.inserirNoInicio(10); // [10]
        listaD.inserirNoFinal(30);  // [10 <-> 30]
        listaD.inserirNaPosicao(1, 20); // [10 <-> 20 <-> 30]
        listaD.exibir();
        System.out.println("Tamanho: " + listaD.tamanho());

        listaD.removerNoInicio(); // [20 <-> 30]
        listaD.exibir();
        System.out.println("Tamanho: " + listaD.tamanho());

        listaD.removerNoFinal(); // [20]
        listaD.exibir();
        System.out.println("Tamanho: " + listaD.tamanho());

        listaD.inserirNoFinal(40); // [20 <-> 40]
        listaD.inserirNoFinal(50); // [20 <-> 40 <-> 50]
        listaD.exibir();
        listaD.removerNaPosicao(1); // [20 <-> 50]
        listaD.exibir();
        System.out.println("Tamanho: " + listaD.tamanho());
    }
}
