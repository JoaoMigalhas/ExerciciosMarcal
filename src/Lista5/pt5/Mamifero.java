public class Mamifero extends Animal {
    private String tipo; // gato, cachorro, etc.
    private String cor;
    private String alimentacao; // Carnívoro, Herbívoro

    public Mamifero(int codigo, String nome, double peso, int idade, String sexo,
                    String dataEntrada, String motivoAtendimento,
                    String nomeResponsavel, String cpfResponsavel, String telefoneContato,
                    String tipo, String cor, String alimentacao) {

        super(codigo, nome, peso, idade, sexo, dataEntrada, motivoAtendimento,
                nomeResponsavel, cpfResponsavel, telefoneContato);

        this.tipo = tipo;
        this.cor = cor;
        this.alimentacao = alimentacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Alimentação: " + alimentacao);
        System.out.println("------------------------------");
    }
}
