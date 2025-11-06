public class Animal {
    protected int codigo;
    protected String nome;
    protected double peso;
    protected int idade;
    protected String sexo;
    protected String dataEntrada;
    protected String motivoAtendimento;
    protected String nomeResponsavel;
    protected String cpfResponsavel;
    protected String telefoneContato;

    public Animal(int codigo, String nome, double peso, int idade, String sexo,
                  String dataEntrada, String motivoAtendimento,
                  String nomeResponsavel, String cpfResponsavel, String telefoneContato) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        this.dataEntrada = dataEntrada;
        this.motivoAtendimento = motivoAtendimento;
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
        this.telefoneContato = telefoneContato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data Entrada: " + dataEntrada);
        System.out.println("Motivo Atendimento: " + motivoAtendimento);
        System.out.println("Responsável: " + nomeResponsavel + " | CPF: " + cpfResponsavel);
        System.out.println("Telefone: " + telefoneContato);
    }
}
