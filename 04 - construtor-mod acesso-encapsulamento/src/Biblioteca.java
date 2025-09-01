class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado com sucesso!");
        } else {
            System.out.println("Biblioteca cheia! Nao foi possível adicionar o livro '" + livro.getTitulo() + "'.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (livros[i].isDisponivel()) {
                    livros[i].emprestar();
                    System.out.println("Livro '" + titulo + "' foi emprestado com sucesso!");
                } else {
                    System.out.println("Livro '" + titulo + "' já está emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' nao encontrado na biblioteca!");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (!livros[i].isDisponivel()) {
                    livros[i].devolver();
                    System.out.println("Livro '" + titulo + "' foi devolvido com sucesso!");
                } else {
                    System.out.println("Livro '" + titulo + "' já esta na biblioteca!");
                }
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' naso encontrado na biblioteca!");
    }

    public void mostrarLivros() {
        System.out.println("\nLista de Livros na Biblioteca:");
        if (contador == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(livros[i].toString());
            }
        }
    }
}