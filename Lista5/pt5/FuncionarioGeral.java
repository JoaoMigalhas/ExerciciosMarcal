import java.time.LocalDate;

public class FuncionarioGeral extends Colaborador {
    // D. Atributos Específicos
    private String cargo; // Limpeza, Secretaria, Controle acesso, Segurança, outro
    private String areaGeral; // Fiscal, Comercial, Financeira, Vendas, outra

    public FuncionarioGeral(String nome, String cpf, LocalDate dataAdmissao, double salario, 
                            String cargo, String areaGeral) {
        super(nome, cpf, dataAdmissao, salario);
        this.cargo = cargo;
        this.areaGeral = areaGeral;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Funcionário Geral ---");
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
        System.out.println("Área Geral: " + areaGeral);
    }
}