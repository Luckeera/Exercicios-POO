import java.util.ArrayList;

// Classe que representa uma venda na loja
public class Venda {
    // Conceito: AGREGAÇÃO - Cliente existe independente da Venda
    // O cliente é criado fora e passado para a venda
    private Cliente cliente;
    
    // Lista de itens da venda (pode conter Produtos e Serviços)
    private ArrayList<ItemVenda> itens;
    
    // Lista de quantidades correspondentes a cada item
    private ArrayList<Integer> quantidades;
    
    private String dataVenda;
    private int numeroVenda;
    
    // Construtor - recebe um cliente já existente (AGREGAÇÃO)
    public Venda(Cliente cliente, String dataVenda, int numeroVenda) {
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.numeroVenda = numeroVenda;
        this.itens = new ArrayList<ItemVenda>();
        this.quantidades = new ArrayList<Integer>();
    }
    
    // Conceito: SOBRECARGA DE MÉTODOS - Método 1
    // Adiciona 1 unidade do item
    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        quantidades.add(1); // Quantidade padrão é 1
        System.out.println("Item adicionado: " + item.getNome() + " (Quantidade: 1)");
    }
    
    // Conceito: SOBRECARGA DE MÉTODOS - Método 2
    // Adiciona várias unidades do item de uma vez
    public void adicionarItem(ItemVenda item, int quantidade) {
        itens.add(item);
        quantidades.add(quantidade);
        System.out.println("Item adicionado: " + item.getNome() + " (Quantidade: " + quantidade + ")");
    }
    
    // Calcula o total da venda
    public double calcularTotal() {
        double total = 0.0;
        
        // For tradicional percorrendo a lista
        for (int i = 0; i < itens.size(); i++) {
            ItemVenda item = itens.get(i);
            int quantidade = quantidades.get(i);
            
            // Conceito: POLIMORFISMO - cada item calcula seu preço de forma diferente
            total += item.calcularPrecoFinal() * quantidade;
        }
        
        return total;
    }
    
    // Imprime o cupom fiscal da venda
    public void imprimirCupom() {
        System.out.println("\n========================================");
        System.out.println("    LOJA DE ACESSORIOS AUTOMOTIVOS");
        System.out.println("========================================");
        System.out.println("Venda No: " + numeroVenda);
        System.out.println("Data: " + dataVenda);
        System.out.println("----------------------------------------");
        System.out.println("CLIENTE:");
        cliente.mostrarDados();
        System.out.println("----------------------------------------");
        System.out.println("ITENS DA VENDA:");
        System.out.println("----------------------------------------");
        
        // For tradicional percorrendo todos os itens
        for (int i = 0; i < itens.size(); i++) {
            ItemVenda item = itens.get(i);
            int quantidade = quantidades.get(i);
            
            System.out.println("\nItem " + (i + 1) + ":");
            // Conceito: POLIMORFISMO - cada tipo de item mostra dados de forma diferente
            item.mostrarDados();
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Subtotal: R$ " + (item.calcularPrecoFinal() * quantidade));
        }
        
        System.out.println("\n========================================");
        System.out.println("TOTAL DA VENDA: R$ " + calcularTotal());
        System.out.println("========================================\n");
    }
    
    // Métodos get e set
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getDataVenda() {
        return dataVenda;
    }
    
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public int getNumeroVenda() {
        return numeroVenda;
    }
    
    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }
}
