public class Diretor extends Colaborador {
    private String area;
    private String dataPosse;

    public Diretor(String nome, String cpf, String dataAdmissao, double salario,
                   String area, String dataPosse) {
        super(nome, cpf, dataAdmissao, salario);
        this.area = area;
        this.dataPosse = dataPosse;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Área: " + area);
        System.out.println("Data da Posse: " + dataPosse);
        System.out.println("-----------------------------");
    }
}
