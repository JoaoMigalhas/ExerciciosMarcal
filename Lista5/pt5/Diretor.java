import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Diretor extends Colaborador {
    // C. Atributos Específicos
    private String area; // Administrativo, Comercial, Markting, Financeiro, ...
    private LocalDate dataPosse; // Data que tomou posse

    public Diretor(String nome, String cpf, LocalDate dataAdmissao, double salario, 
                   String area, LocalDate dataPosse) {
        super(nome, cpf, dataAdmissao, salario);
        this.area = area;
        this.dataPosse = dataPosse;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Diretor ---");
        super.exibirInformacoes();
        System.out.println("Área: " + area);
        System.out.println("Data Posse: " + dataPosse.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}