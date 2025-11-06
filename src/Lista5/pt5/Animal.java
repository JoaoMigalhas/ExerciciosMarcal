import java.time.LocalDate;
import java.util.Random;

public abstract class Animal {
    // A. Atributos Comuns a todos os animais
    private int codigo;
    private String nome;
    private double peso;
    private int idade;
    private String sexo;
    private LocalDate dataEntrada;
    private String motivoAtendimento;
    private String nomeResponsavel;
    private String cpfResponsavel;
    private String telefoneContatoResponsavel;

    // Construtor
    public Animal(String nome, double peso, int idade, String sexo, LocalDate dataEntrada, 
                  String motivoAtendimento, String nomeResponsavel, String cpfResponsavel, 
                  String telefoneContatoResponsavel) {
        // Gera um código simples (simulando um código único)
        this.codigo = new Random().nextInt(9000) + 1000; 
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        this.dataEntrada = dataEntrada;
        this.motivoAtendimento = motivoAtendimento;
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
        this.telefoneContatoResponsavel = telefoneContatoResponsavel;
    }

    // Método para exibir informações (Será sobrescrito nas subclasses)
    public void exibirInformacoes() {
        System.out.println("\n--- Dados do Animal ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Sexo: " + sexo);
        System.out.println("Data Entrada: " + dataEntrada);
        System.out.println("Motivo: " + motivoAtendimento);
        System.out.println("-- Responsável --");
        System.out.println("Nome: " + nomeResponsavel);
        System.out.println("CPF: " + cpfResponsavel);
        System.out.println("Telefone: " + telefoneContatoResponsavel);
    }
    
    // Getters e Setters (Essenciais para acesso aos atributos 'private')

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    // ... (Incluir todos os outros getters e setters, omitidos aqui por brevidade)
}