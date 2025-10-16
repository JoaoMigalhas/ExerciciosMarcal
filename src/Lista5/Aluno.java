package Lista5;

//referente ao exercicio 1 da lista 5
public class Aluno {
    // Atributos privados
    private String ra;
    private String nome;
    private int idade;
    private String cpf;
    private String sexo;
    private String email;
    private String telefone;

    // Construtor vazio
    public Aluno() {}

    // Getters e Setters (propriedades públicas)
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para exibir informações do aluno
    public void exibirDados() {
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("===========================\n");
    }
}
