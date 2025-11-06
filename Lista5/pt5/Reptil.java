import java.time.LocalDate;

public class Reptil extends Animal {
    // C. Atributos Específicos de Répteis
    private String classificacao; // Escamados, Crocodilianos, Lacertílios
    private String tipoReproducao; // Ovípara, Fecundação
    private String tipoHabitate; // Aquático, Terreo

    // Construtor
    public Reptil(String nome, double peso, int idade, String sexo, LocalDate dataEntrada, 
                  String motivoAtendimento, String nomeResponsavel, String cpfResponsavel, 
                  String telefoneContatoResponsavel, String classificacao, String tipoReproducao, 
                  String tipoHabitate) {
        
        // Chama o construtor da superclasse Animal
        super(nome, peso, idade, sexo, dataEntrada, motivoAtendimento, nomeResponsavel, 
              cpfResponsavel, telefoneContatoResponsavel); 
        
        this.classificacao = classificacao;
        this.tipoReproducao = tipoReproducao;
        this.tipoHabitate = tipoHabitate;
    }

    // Sobrescrita do método para incluir dados específicos
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe Animal
        System.out.println("-- Dados do Réptil --");
        System.out.println("Classificação: " + classificacao);
        System.out.println("Tipo Reprodução: " + tipoReproducao);
        System.out.println("Tipo Habitate: " + tipoHabitate);
    }
    
    // Getters e Setters específicos (Opcionais, mas boas práticas)
}