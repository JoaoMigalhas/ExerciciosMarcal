package Lista5.pt4;

public class Lista5ex3pt4 {

    private int codigo;
    private String nome;
    private int idade;
    private double salario;
    private String cpf;
    private String rg;
    private Enum3 situacao;
//teste
    // Construtor para módulo Orçamento teste 
    // Apenas nome e situação automaticamente = ORCAMENTO
    public Lista5ex3pt4(String nome) {
        this.nome = nome;
        this.situacao = Enum3.ORCAMENTO;
    }

    // Construtor para módulo Cliente (todos os dados)
    // Situação automaticamente = CLIENTE
    public Lista5ex3pt4(int codigo, String nome, int idade, double salario, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
        this.rg = rg;
        this.situacao = Enum3.CLIENTE;
    }

    // Construtor para módulo Pedido
    // Código, Nome, CPF e situação = PEDIDO
    public Lista5ex3pt4(int codigo, String nome, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.situacao = Enum3.PEDIDO;
    }

    // Getters e Setters
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {this.salario = salario;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}

    public Enum3 getSituacao() {return situacao;}
    public void setSituacao(Enum3 situacao) {this.situacao = situacao;}
}

