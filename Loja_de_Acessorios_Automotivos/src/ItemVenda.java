// Conceito: HERANÇA (Classe Abstrata - Pai)
// Conceito: POLIMORFISMO (Método Abstrato)
public abstract class ItemVenda implements Imprimivel {
    // Conceito: ENCAPSULAMENTO - Atributos privados
    private String nome;
    private double precoBase;
    
    // Construtor
    public ItemVenda(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    
    // Conceito: ENCAPSULAMENTO - Métodos get e set
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoBase() {
        return precoBase;
    }
    
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
    
    // Conceito: POLIMORFISMO - Método abstrato que será sobrescrito
    // Cada classe filha implementa de forma diferente
    public abstract double calcularPrecoFinal();
    
    // Conceito: INTERFACE - Implementação do método da interface
    @Override
    public void mostrarDados() {
        System.out.println("Item: " + nome);
        System.out.println("Preco Base: R$ " + precoBase);
        System.out.println("Preco Final: R$ " + calcularPrecoFinal());
    }
}
