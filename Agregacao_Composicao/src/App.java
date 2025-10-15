import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Q1 - Exemplos de agregação e composição
        System.out.print(
            "Q1 - Exemplos (2 agregação, 2 composição):\n" +
            "Agregação: Turma-Professor; Pedido-ItemPedido.\n" +
            "Composição: Casa-Quarto; Livro-Página.\n"
        );

        // Q2 - Conceitos de final em classe e atributo
        System.out.print(
            "Q2 - Classe final: não pode ser herdada.\n" +
            "Atributo final: não pode ser reatribuído após inicialização; " +
            "se for referência, o objeto pode mudar estado, mas a referência não.\n"
        );

        // Q3 - Vantagens de métodos estáticos
        System.out.print(
            "Q3 - Método estático: pode ser usado sem instanciar, " +
            "ideal para utilitários e operações sem estado.\n"
        );

        // Q4 - Métodos da classe Object
        System.out.print(
            "Q4 - Métodos da classe Object: equals(Object), hashCode(), toString(), getClass().\n"
        );

        // Q5 - Calculadora Simples com Dialogs
        calculadoraSimples();

        // Q6 - Agregação Professor/Turma
        Professor prof1 = new Professor("Ana");
        Turma turma = new Turma("ADS-001");
        turma.setProfessor(prof1);
        turma.resumo();
        Professor prof2 = new Professor("Bruno");
        turma.setProfessor(prof2);
        turma.resumo();

        // Q7 - Sistema de Pedido
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);
        double total = pedido.valorTotal();
        System.out.printf("Q7 - Valor total do pedido: R$ %.2f%n", total);
    }

    // Q5 - Calculadora com JOptionPane
    static void calculadoraSimples() {
        try {
            String n1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
            if (n1 == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
            String n2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");
            if (n2 == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            double a = Double.parseDouble(n1.trim().replace(",", "."));
            double b = Double.parseDouble(n2.trim().replace(",", "."));

            String[] ops = {"+", "−", "×", "÷"};
            int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha a operação:",
                "Calculadora",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                ops,
                ops[0]
            );

            if (escolha == -1) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            double resultado;
            switch (escolha) {
                case 0: resultado = a + b; break;
                case 1: resultado = a - b; break;
                case 2: resultado = a * b; break;
                case 3:
                    if (b == 0) {
                        JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                        return;
                    }
                    resultado = a / b;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operação inválida.");
                    return;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite números válidos.");
        }
    }
}

// Q6 - Agregação Professor/Turma
class Professor {
    private final String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Turma {
    private final String codigo;
    private Professor professor;

    public Turma(String codigo) {
        this.codigo = codigo;
    }

    public void setProfessor(Professor p) {
        this.professor = p;
    }

    public void resumo() {
        String profNome = (professor != null) ? professor.getNome() : "(sem professor)";
        System.out.println("Turma " + codigo + " - Professor: " + profNome);
    }
}

// Q7 - Pedido e ItemPedido
class Pedido {
    private final List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(nomeProduto, quantidade, precoUnitario));
    }

    public double valorTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }

    static class ItemPedido {
        private final String nomeProduto;
        private final int quantidade;
        private final double precoUnitario;

        ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        double subtotal() {
            return quantidade * precoUnitario;
        }
    }
}
