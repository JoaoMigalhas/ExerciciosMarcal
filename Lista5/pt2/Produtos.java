package Lista5.pt2;

public class Produtos {
    // Atributos privados
    private double codigoEAN;
    private String descricao;
    private double precoCusto;
    private double margemLucro;
    private double precoVenda;
    private double saldoEstoque;

    // Getters e Setters
    public double getCodigoEAN() {return codigoEAN;}
    public void setCodigoEAN(double codigoEAN) {this.codigoEAN = codigoEAN;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public double getPrecoCusto() {return precoCusto;}
    public void setPrecoCusto(double precoCusto) {this.precoCusto = precoCusto;}

    public double getMargemLucro() {return margemLucro;}
    public void setMargemLucro(double margemLucro) {this.margemLucro = margemLucro;}

    public double getPrecoVenda() {return precoVenda;}
    public void setPrecoVenda(double precoVenda) {this.precoVenda = precoVenda;}

    public double getSaldoEstoque() {return saldoEstoque;}
    public void setSaldoEstoque(double saldoEstoque) {this.saldoEstoque = saldoEstoque;}

    // Método para imprimir os dados
    public void ImprimirFicha() {
        System.out.println("\n===== Ficha do Produto =====");
        System.out.println("Código EAN: " + codigoEAN);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço de Custo: R$ " + precoCusto);
        System.out.println("Margem de Lucro: " + margemLucro + "%");
        System.out.println("Preço de Venda: R$ " + precoVenda);
        System.out.println("Saldo em Estoque: " + saldoEstoque);
        System.out.println("============================");
    }
}

