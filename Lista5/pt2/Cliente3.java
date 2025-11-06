package Lista5.pt2;

public class Cliente3 {
    // Atributos privados
    private int codigo;
    private String nome;
    private EnumSexo3 sexo;  // apenas o construtor define
    private int idade;

    // Construtor que define o sexo
    public Cliente3(EnumSexo3 sexo) {
        this.sexo = sexo;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Adiciona "Sr." ou "Sra." conforme o sexo definido no construtor
        if (sexo == EnumSexo3.Masc) {
            this.nome = "Sr. " + nome;
        } else if (sexo == EnumSexo3.Fem) {
            this.nome = "Sra. " + nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 21) {
            System.out.println("Idade inválida! O cliente deve ter 21 anos ou mais.");
        } else {
            this.idade = idade;
        }
    }

    // Método para imprimir os dados do cliente
    public void ImprimirFicha() {
        System.out.println("\n=== Ficha do Cliente ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + (sexo == EnumSexo3.Masc ? "Masculino" : "Feminino"));
        System.out.println("Idade: " + idade);
        System.out.println("========================");
    }
}

