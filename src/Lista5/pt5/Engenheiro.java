import java.time.LocalDate;

public class Engenheiro extends Colaborador {
    // B. Atributos Específicos
    private String tipo; // Civil, Ambiental, Produção, Outro
    private String nivel; // Estagiário, Junior, Pleno, Senior

    public Engenheiro(String nome, String cpf, LocalDate dataAdmissao, double salario, 
                      String tipo, String nivel) {
        super(nome, cpf, dataAdmissao, salario);
        this.tipo = tipo;
        this.nivel = nivel;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Engenheiro ---");
        super.exibirInformacoes();
        System.out.println("Tipo: " + tipo);
        System.out.println("Nível: " + nivel);
    }
}