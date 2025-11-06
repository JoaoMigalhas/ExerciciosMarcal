import java.time.LocalDate;

public class Mamifero extends Animal {
    // B. Atributos Específicos de Mamíferos
    private String tipo; // gato, cachorro, porco, coelho, outro
    private String cor;
    private String alimentacao; // Carnivoro, Herbivoro

    // Construtor
    public Mamifero(String nome, double peso, int idade, String sexo, LocalDate dataEntrada, 
                    String motivoAtendimento, String nomeResponsavel, String cpfResponsavel, 
                    String telefoneContatoResponsavel, String tipo, String cor, String alimentacao) {
        
        // Chama o construtor da superclasse Animal
        super(nome, peso, idade, sexo, dataEntrada, motivoAtendimento, nomeResponsavel, 
              cpfResponsavel, telefoneContatoResponsavel); 
        
        this.tipo = tipo;
        this.cor = cor;
        this.alimentacao = alimentacao;
    }

    // Sobrescrita do método para incluir dados específicos
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe Animal
        System.out.println("-- Dados do Mamífero --");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Alimentação: " + alimentacao);
    }

    // Getters e Setters específicos (Opcionais, mas boas práticas)
}