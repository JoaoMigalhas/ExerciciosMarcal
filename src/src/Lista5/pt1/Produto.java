package Lista5.pt1;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidadeEstoque;
    private double precoCusto;
    private double margemLucro; // em porcentagem (ex: 20 para 20%)

    public Produto(int codigo, String nome, String descricao, int quantidadeEstoque, double precoCusto, double margemLucro) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    // Preço de venda calculado (apenas leitura)
    public double getPrecoVenda() {
        return precoCusto + (precoCusto * (margemLucro / 100));
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nNome: " + nome +
                "\nDescrição: " + descricao +
                "\nQuantidade em estoque: " + quantidadeEstoque +
                "\nPreço de custo: R$ " + precoCusto +
                "\nMargem de lucro: " + margemLucro + "%" +
                "\nPreço de venda: R$ " + getPrecoVenda() + "\n";
    }
}

