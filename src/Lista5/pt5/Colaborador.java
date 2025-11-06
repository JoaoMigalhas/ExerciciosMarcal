import java.time.LocalDate;
import java.util.Random;

public class Colaborador {
    protected String codigoInterno;
    protected String nome;
    protected String cpf;
    protected String dataAdmissao;
    protected double salario;

    public Colaborador(String nome, String cpf, String dataAdmissao, double salario) {
        if (!validarNome(nome)) {
            throw new IllegalArgumentException("Nome deve conter mais de 10 caracteres!");
        }
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF deve conter apenas números e ter 11 dígitos!");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero!");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.codigoInterno = gerarCodigo();
    }

    private String gerarCodigo() {
        LocalDate hoje = LocalDate.now();
        String yy = String.format("%02d", hoje.getYear() % 100);
        String mm = String.format("%02d", hoje.getMonthValue());
        int sss = new Random().nextInt(900) + 100; // de 100 a 999
        return yy + mm + sss;
    }

    private boolean validarCPF(String cpf) {
        return cpf.matches("\\d{11}");
    }

    private boolean validarNome(String nome) {
        return nome != null && nome.trim().length() > 10;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("Salário inválido!");
        } else {
            this.salario = salario;
        }
    }

    public void exibirDados() {
        System.out.println("Código: " + codigoInterno);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Salário: R$ " + salario);
    }
}
