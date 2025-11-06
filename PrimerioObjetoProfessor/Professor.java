package PrimerioObjetoProfessor;

public class Professor {
    
    //atributos
    private int codigo;
    private String nome;
    private double salario;
    private String email;

    //propriedades
    public void setCodigo (int codigo) {this.codigo = codigo;}
    public int getCodigo () {return this.codigo;}

    public void setNome (String nome) {this.nome = nome;}
    public String getNome () {return this.nome;}

    public void setSalario (double salario) {this.salario = salario;}
    public double getSalario () {return this.salario;}

    public void setEmail (String email) {this.email = email;}
    public String getEmail () {return this.email;}


}
