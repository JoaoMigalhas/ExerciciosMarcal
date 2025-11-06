public class Geral extends Colaborador {
    private String cargo; // Limpeza, Secretaria, etc.
    private String area;  // Fiscal, Comercial, Financeira...

    public Geral(String nome, String cpf, String dataAdmissao, double salario,
                 String cargo, String area) {
        super(nome, cpf, dataAdmissao, salario);
        this.cargo = cargo;
        this.area = area;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: " + cargo);
        System.out.println("Área: " + area);
        System.out.println("-----------------------------");
    }
}
