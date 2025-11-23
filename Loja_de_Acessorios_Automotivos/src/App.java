/*
 * PROJETO FINAL - LOJA DE ACESSÓRIOS AUTOMOTIVOS
 * 
 * Este projeto demonstra os conceitos fundamentais de POO:
 * 1. ENCAPSULAMENTO - Atributos privados com gets e sets
 * 2. HERANÇA - ItemVenda (pai) -> Produto e Servico (filhos)
 * 3. POLIMORFISMO - Sobrescrita do método calcularPrecoFinal()
 * 4. INTERFACE - Imprimivel com método mostrarDados()
 * 5. SOBRECARGA - Dois métodos adicionarItem() com assinaturas diferentes
 * 6. AGREGAÇÃO - Cliente existe independente da Venda
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("=== SISTEMA DE VENDAS - LOJA DE ACESSORIOS AUTOMOTIVOS ===\n");
        
        // Conceito: AGREGACAO - Cliente e criado independentemente da venda
        // Ele pode existir antes e depois da venda
        System.out.println("1. Criando Cliente...");
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "(91) 98765-4321");
        System.out.println("Cliente criado: " + cliente1.getNome() + "\n");
        
        // Criando produtos - demonstra HERANÇA de ItemVenda
        System.out.println("2. Criando Produtos...");
        Produto produto1 = new Produto("Pneu Pirelli Aro 15", 350.00, "Pirelli", 50);
        System.out.println("Produto criado: " + produto1.getNome());
        
        Produto produto2 = new Produto("Som Automotivo Pioneer", 580.00, "Pioneer", 30);
        System.out.println("Produto criado: " + produto2.getNome() + "\n");
        
        // Criando servico - demonstra HERANCA de ItemVenda
        System.out.println("3. Criando Servico...");
        Servico servico1 = new Servico("Instalacao de Som", 120.00, 90, "Carlos Mecanico");
        System.out.println("Servico criado: " + servico1.getNome() + "\n");
        
        // Conceito: AGREGACAO - A venda recebe o cliente ja criado
        // O cliente nao e criado dentro da venda, ele e passado como parametro
        System.out.println("4. Criando Venda...");
        Venda venda1 = new Venda(cliente1, "22/11/2025", 1001);
        System.out.println("Venda No " + venda1.getNumeroVenda() + " criada para " + venda1.getCliente().getNome() + "\n");
        
        // Conceito: SOBRECARGA DE MÉTODOS
        // Método 1: adicionarItem(ItemVenda item) - adiciona 1 unidade
        System.out.println("5. Adicionando itens à venda (testando SOBRECARGA)...");
        venda1.adicionarItem(produto1, 4); // Usando sobrecarga - adiciona 4 unidades
        
        // Método 2: adicionarItem(ItemVenda item, int quantidade) - adiciona quantidade específica
        venda1.adicionarItem(produto2); // Usando sobrecarga - adiciona 1 unidade (padrão)
        
        venda1.adicionarItem(servico1); // Adiciona 1 serviço
        System.out.println();
        
        // Conceito: POLIMORFISMO - Cada tipo de item calcula o preco de forma diferente
        // Produto: preco base + taxa de imposto (15%)
        // Servico: preco base + taxa de mao de obra (30%)
        System.out.println("6. Imprimindo Cupom Fiscal (demonstra POLIMORFISMO)...");
        venda1.imprimirCupom();
        
        // Demonstrando POLIMORFISMO
        System.out.println("\n=== DEMONSTRACAO EXTRA: POLIMORFISMO ===");
        System.out.println("Mostrando como cada item calcula seu preco de forma diferente:\n");
        
        // Mostra os dados de cada item usando o método da interface
        produto1.mostrarDados();
        System.out.println();
        
        produto2.mostrarDados();
        System.out.println();
        
        servico1.mostrarDados();
        
        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}

