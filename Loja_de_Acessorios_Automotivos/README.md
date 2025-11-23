# 🚗 Loja de Acessórios Automotivos

## 📋 Descrição do Projeto
Sistema de vendas para uma loja de acessórios automotivos desenvolvido em Java, criado como projeto final de semestre para demonstrar os principais conceitos de Programação Orientada a Objetos (POO).

## ✅ Conceitos de POO Implementados

### 1️⃣ **Encapsulamento**
- Todos os atributos das classes são `private`
- Acesso controlado através de métodos `get` e `set`
- Exemplos: Classes `Cliente`, `ItemVenda`, `Produto`, `Servico`, `Venda`

### 2️⃣ **Interface**
- Interface `Imprimivel` com método `mostrarDados()`
- Implementada pelas classes de produtos e serviços
- Garante que todos os itens podem exibir suas informações

### 3️⃣ **Herança**
- Classe abstrata `ItemVenda` (Pai)
- Classes concretas `Produto` e `Servico` (Filhos)
- Reutilização de código através da hierarquia de classes

### 4️⃣ **Polimorfismo (Sobrescrita)**
- Método abstrato `calcularPrecoFinal()` em `ItemVenda`
- `Produto`: calcula com taxa de imposto (15%)
- `Servico`: calcula com taxa de mão de obra (30%)
- Cada classe implementa o cálculo de forma diferente

### 5️⃣ **Sobrecarga de Métodos**
- Classe `Venda` possui dois métodos `adicionarItem`:
  - `adicionarItem(ItemVenda item)` → adiciona 1 unidade
  - `adicionarItem(ItemVenda item, int quantidade)` → adiciona várias unidades

### 6️⃣ **Agregação**
- `Venda` possui um atributo do tipo `Cliente`
- O cliente é criado independentemente e passado para a venda
- Demonstra que o cliente existe antes e depois da venda

## 📂 Estrutura do Projeto

```
Loja_de_Acessorios_Automotivos/
│
├── src/
│   ├── App.java           # Classe principal com exemplos
│   ├── Imprimivel.java    # Interface (Conceito: Interface)
│   ├── ItemVenda.java     # Classe abstrata pai (Conceito: Herança/Polimorfismo)
│   ├── Produto.java       # Classe filha (Conceito: Herança/Polimorfismo)
│   ├── Servico.java       # Classe filha (Conceito: Herança/Polimorfismo)
│   ├── Cliente.java       # Classe para agregação
│   └── Venda.java         # Classe principal (Conceito: Agregação/Sobrecarga)
│
├── bin/                   # Arquivos compilados (.class)
└── lib/                   # Dependências (se necessário)
```

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 11 ou superior
- VS Code com Extension Pack for Java (ou qualquer IDE Java)

### Passos
1. Abra o projeto no VS Code
2. Navegue até `src/App.java`
3. Clique em "Run" ou pressione `F5`

### Executar via terminal:
```bash
# Compilar
javac -d bin src/*.java

# Executar
java -cp bin App
```

## 💡 Funcionalidades

- ✅ Cadastro de clientes
- ✅ Registro de produtos (Pneus, Som, etc.)
- ✅ Registro de serviços (Instalação, Alinhamento, etc.)
- ✅ Criação de vendas
- ✅ Cálculo automático de preços com impostos/taxas
- ✅ Geração de cupom fiscal detalhado

## 📊 Exemplo de Saída

```
=== SISTEMA DE VENDAS - LOJA DE ACESSÓRIOS AUTOMOTIVOS ===

1. Criando Cliente...
Cliente criado: João Silva

2. Criando Produtos...
Produto criado: Pneu Pirelli Aro 15
Produto criado: Som Automotivo Pioneer

3. Criando Serviço...
Serviço criado: Instalação de Som

4. Criando Venda...
Venda Nº 1001 criada para João Silva

5. Adicionando itens à venda (testando SOBRECARGA)...
Item adicionado: Pneu Pirelli Aro 15 (Quantidade: 4)
Item adicionado: Som Automotivo Pioneer (Quantidade: 1)
Item adicionado: Instalação de Som (Quantidade: 1)

========================================
    LOJA DE ACESSÓRIOS AUTOMOTIVOS
========================================
Venda Nº: 1001
Data: 22/11/2025
----------------------------------------
CLIENTE:
Nome: João Silva
CPF: 123.456.789-00
Telefone: (91) 98765-4321
----------------------------------------
ITENS DA VENDA:
...
========================================
TOTAL DA VENDA: R$ 2322.0
========================================
```

## 🎓 Observações Acadêmicas

Este projeto foi desenvolvido com foco didático para demonstração em ambiente acadêmico:
- Uso apenas de recursos básicos do Java (ArrayList, for tradicional)
- Comentários explicativos em cada conceito de POO
- Código simples e legível para alunos iniciantes
- Sem uso de Streams, Lambdas ou recursos avançados

## 👨‍💻 Autor

Desenvolvido como projeto final de POO - Curso de Ciência da Computação

---

**Nota**: Este é um projeto educacional focado em demonstrar conceitos de Programação Orientada a Objetos.
