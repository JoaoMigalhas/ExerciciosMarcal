public class Engenheiro extends Colaborador {
    private String tipo;  // Civil, Ambiental, Produção, Outro
    private String nivel; // Estagiário, Junior, Pleno, Senior

    public Engenheiro(String nome, String cpf, String dataAdmissao, double salario,
                      String tipo, String nivel) {
        super(nome, cpf, dataAdmissao, salario);
        this.tipo = tipo;
        this.nivel = nivel;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo: " + tipo);
        System.out.println("Nível: " + nivel);
        System.out.println("-----------------------------");
    }
}
