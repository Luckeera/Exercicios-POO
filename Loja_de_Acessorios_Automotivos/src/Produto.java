// Conceito: HERANÇA - Produto herda de ItemVenda
public class Produto extends ItemVenda {
    // Conceito: ENCAPSULAMENTO - Atributos privados específicos de Produto
    private String marca;
    private int estoque;
    private static final double TAXA_IMPOSTO = 0.15; // 15% de imposto
    
    // Construtor
    public Produto(String nome, double precoBase, String marca, int estoque) {
        super(nome, precoBase); // Chama o construtor da classe pai
        this.marca = marca;
        this.estoque = estoque;
    }
    
    // Conceito: ENCAPSULAMENTO - Métodos get e set
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    // Conceito: POLIMORFISMO - Sobrescrita do método abstrato da classe pai
    // Produto calcula o preço final somando a taxa de imposto
    @Override
    public double calcularPrecoFinal() {
        double imposto = getPrecoBase() * TAXA_IMPOSTO;
        return getPrecoBase() + imposto;
    }
    
    // Conceito: POLIMORFISMO - Sobrescrita do método da interface
    @Override
    public void mostrarDados() {
        System.out.println("--- PRODUTO ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Marca: " + marca);
        System.out.println("Preco Base: R$ " + getPrecoBase());
        System.out.println("Taxa de Imposto: " + (TAXA_IMPOSTO * 100) + "%");
        System.out.println("Preco Final: R$ " + calcularPrecoFinal());
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
