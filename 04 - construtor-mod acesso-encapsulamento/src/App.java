public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 1. Classe Pessoa (Construtor e Atributos Públicos)
        // • Crie uma classe Pessoa com os atributos:
        // ◦ nome (String)
        // ◦ idade (int)
        // • Crie um construtor que receba os valores dos atributos.
        // • No main, crie dois objetos Pessoa e imprima os valores. 
        
        // CODIGO COMENTADO
        // Pessoa p1 = new Pessoa("Ana", 30);
        // Pessoa p2 = new Pessoa("Lucas", 25);
        // p1.getDados();
        // p2.getDados();
        // Ta comentado, pq eu alterei a classe Pessoa nos proximos exercicios.
        
        // 2. Classe Carro (Atributos Privados e Getters)
        // • Crie a classe Carro com atributos privados:
        // ◦ marca (String)
        // ◦ ano (int)
        // • Crie métodos get para acessar cada atributo.
        // • No main, crie um carro e exiba suas informações.     
        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ano: " + c1.getAno());
        
        
        // 3. Classe ContaBancaria (Encapsulamento + Métodos Públicos)
        // • Crie a classe ContaBancaria com atributos privados:
        // ◦ numeroConta (int)
        // ◦ saldo (double)
        // • Crie um construtor que inicializa o número da conta e saldo inicial.
        // • Implemente métodos públicos:
        // ◦ depositar(double valor) → soma ao saldo
        // ◦ sacar(double valor) → subtrai do saldo se houver saldo suficiente
        // ◦ getSaldo() → retorna o saldo atual
        // • No main, crie uma conta e faça depósitos e saques.
        ContaBancaria conta1 = new ContaBancaria(123456789, 1000.0);
        System.out.println("Saldo inicial: R$" + conta1.getSaldo());
        conta1.depositar(500.0);
        conta1.sacar(200.0);
        System.out.println("Saldo final: R$" + conta1.getSaldo());

        
        // 4. Classe Produto (Setters com Validação)
        // • Crie a classe Produto com atributos privados:
        // ◦ nome (String)
        // ◦ preco (double)
        // • Crie getters e setters, mas o setPreco() deve validar:
        // ◦ não permitir precos negativos.
        // • No main, teste criando produtos e tentando atribuir valores
        // inválidos.        
        Produto prod1 = new Produto("Notebook", 3500.0);
        System.out.println("Produto: " + prod1.getNome() + ", Preco: R$" + prod1.getPreco());
        prod1.setPreco(3000.0);
        System.out.println("Produto: " + prod1.getNome() + ", Preco: R$" + prod1.getPreco());
        prod1.setPreco(-500.0); // Teste de preco inválido
        System.out.println("Produto: " + prod1.getNome() + ", Preco: R$" + prod1.getPreco());
        prod1.setPreco(500.0);
        System.out.println("Produto: " + prod1.getNome() + ", Preco: R$" + prod1.getPreco());


        // 5. Crie a classe Pessoa com:
        // • Atributos privados: nome (String),
        // idade (int)
        // • Um construtor que receba nome e idade
        // • Métodos getNome() e getIdade()
        // Crie a classe Endereco com:
        // • Atributos privados: rua (String),
        // numero (int)
        // • Um construtor que receba rua e número
        // • Métodos getRua() e getNumero()        
        // Associe as classes:
        // • Adicione na classe Pessoa um atributo do
        // tipo Endereco chamado endereco
        // • Altere o construtor de Pessoa para também
        // receber um Endereco
        // • Crie um método mostrarDados() que
        // exiba o nome, idade e o endereço da pessoa
        // No main:
        // • Crie dois objetos Endereco
        // • Crie duas pessoas, cada uma com seu
        // endereço
        // • Mostre os dados de cada pessoa
        Endereco end1 = new Endereco("Rua A", 100);
        Endereco end2 = new Endereco("Rua B", 200);
        Pessoa pessoa1 = new Pessoa("Carlos", 40, end1);
        Pessoa pessoa2 = new Pessoa("Mariana", 35, end2);
        pessoa1.getDados();
        pessoa2.getDados();

        // 6. Crie a classe Livro com:
        // • Atributos privados: titulo (String), autor
        // (String), disponivel (boolean).
        // • O atributo disponivel deve iniciar como true.
        // • Construtor que receba titulo e autor.
        // • Métodos públicos:
        // ◦ getTitulo()
        // ◦ isDisponivel()
        // ◦emprestar() → deve alterar o estado para
        // não disponível, caso esteja disponível.
        // ◦devolver() → deve alterar o estado para
        // disponível novamente.
        // Crie a classe Biblioteca com:
        // • Um vetor de Livro com tamanho definido no construtor.
        // • Um contador para controlar quantos livros foram adicionados.
        // • Métodos públicos:
        // ◦adicionarLivro(Livro livro) → adiciona no vetor, se houver espaço.
        // ◦emprestarLivro(String titulo) → procura no vetor e empresta o
        // livro correspondente.
        // ◦devolverLivro(String titulo) → procura no vetor e devolve o livro
        // correspondente.
        // ◦mostrarLivros() → exibe todos os livros e informa se estão
        // disponíveis ou emprestados.
        // No método main:
        // • Crie uma biblioteca com capacidade para 5 livros.
        // • Adicione pelo menos 3 livros.
        // • Mostre os livros cadastrados.
        // • Realize um empréstimo de um dos livros.
        // • Realize a devolução do mesmo livro.
        // • Mostre novamente o estado de todos os livros.
        Biblioteca biblioteca = new Biblioteca(5);

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.mostrarLivros();

        System.out.println("\nRealizando emprestimo...");
        biblioteca.emprestarLivro("1984");

        biblioteca.mostrarLivros();

        System.out.println("\nRealizando devolucao...");
        biblioteca.devolverLivro("1984");

        biblioteca.mostrarLivros();
    }
}
