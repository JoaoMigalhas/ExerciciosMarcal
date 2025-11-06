public class Reptil extends Animal {
    private String classificacao; // Escamados, Crocodilianos, etc.
    private String tipoReproducao; // Ovípara, Fecundação
    private String habitat; // Aquático, Terrestre

    public Reptil(int codigo, String nome, double peso, int idade, String sexo,
                  String dataEntrada, String motivoAtendimento,
                  String nomeResponsavel, String cpfResponsavel, String telefoneContato,
                  String classificacao, String tipoReproducao, String habitat) {

        super(codigo, nome, peso, idade, sexo, dataEntrada, motivoAtendimento,
                nomeResponsavel, cpfResponsavel, telefoneContato);

        this.classificacao = classificacao;
        this.tipoReproducao = tipoReproducao;
        this.habitat = habitat;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Classificação: " + classificacao);
        System.out.println("Reprodução: " + tipoReproducao);
        System.out.println("Habitat: " + habitat);
        System.out.println("------------------------------");
    }
}
