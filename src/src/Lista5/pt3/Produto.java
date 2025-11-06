package Lista5.pt3;

public class Produto {
    // Atributos privados
    private long codigoEAN;
    private String nome;
    private String descricao;
    private double precoCusto;
    private double margemLucro;
    private double precoVenda;
    private double saldoEstoque;
    private EnumAtivo ativo;

    // Construtor padrão
    public Produto() {}

    // Getters e Setters com validações
    public long getCodigoEAN() {
        return codigoEAN;
    }

    public void setCodigoEAN(long codigoEAN) {
        if (codigoEAN < 0) {
            System.out.println("Erro: o código EAN não pode ser negativo!");
        } else {
            this.codigoEAN = codigoEAN;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome do produto não pode estar vazio!");
        } else {
            this.nome = nome;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        if (precoCusto <= 0) {
            System.out.println("Erro: o preço de custo deve ser maior que zero!");
        } else {
            this.precoCusto = precoCusto;
            calcularPrecoVenda();
        }
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        if (margemLucro < 0) {
            System.out.println("Erro: margem de lucro não pode ser negativa!");
        } else {
            this.margemLucro = margemLucro;
            calcularPrecoVenda();
        }
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    // Preço de venda calculado automaticamente
    private void calcularPrecoVenda() {
        this.precoVenda = this.precoCusto + (this.precoCusto * this.margemLucro / 100);
    }

    public double getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(double saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    public EnumAtivo getAtivo() {
        return ativo;
    }

    public void setAtivo(EnumAtivo ativo) {
        this.ativo = ativo;
    }

    // Método para exibir informações
    public void ImprimirFicha() {
        System.out.println("\n=== Ficha do Produto ===");
        System.out.println("Código EAN: " + codigoEAN);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço de Custo: R$ " + precoCusto);
        System.out.println("Margem de Lucro: " + margemLucro + "%");
        System.out.println("Preço de Venda: R$ " + precoVenda);
        System.out.println("Saldo em Estoque: " + saldoEstoque);
        System.out.println("Situação: " + ativo);
        System.out.println("========================");
    }
}
