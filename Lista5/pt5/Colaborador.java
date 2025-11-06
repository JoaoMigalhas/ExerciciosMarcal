import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Colaborador {
    // A. Dados comuns
    private String codigoInterno; // YYMMSSS
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salario;

    // Construtor
    public Colaborador(String nome, String cpf, LocalDate dataAdmissao, double salario) {
        // A.iii. Gera o código antes de qualquer validação
        this.codigoInterno = gerarCodigoInterno(dataAdmissao);
        
        // Aplica as validações usando os setters
        setNome(nome);          // A.ii
        setCpf(cpf);            // A.iv
        setSalario(salario);    // A.i
        
        this.dataAdmissao = dataAdmissao;
    }

    // A.iii. Geração do código (yyMMsss)
    private String gerarCodigoInterno(LocalDate dataAdmissao) {
        DateTimeFormatter yearMonthFormatter = DateTimeFormatter.ofPattern("yyMM");
        String yyMM = dataAdmissao.format(yearMonthFormatter);
        
        // Gera sss (código randomico de 3 dígitos, entre 100 e 999)
        Random random = new Random();
        int sss = random.nextInt(900) + 100; 
        
        return yyMM + sss;
    }

    // =================================
    // Getters e Setters com Validação
    // =================================

    // A.i. Validação do Salário
    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Erro: O salário deve ser positivo.");
        }
        this.salario = salario;
    }

    // A.ii. Validação do Nome
    public void setNome(String nome) {
        if (nome == null || nome.length() <= 10) {
            throw new IllegalArgumentException("Erro: O nome deve conter mais que 10 caracteres.");
        }
        this.nome = nome;
    }

    // A.iv. Validação do CPF
    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) { // Regex: 11 dígitos, só números
            throw new IllegalArgumentException("Erro: O CPF deve conter exatamente 11 dígitos e apenas números.");
        }
        this.cpf = cpf;
    }

    // Getters (para visualização dos dados)
    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getNome() {
        return nome;
    }
    
    // ... (Incluir outros getters)

    // Método para exibir informações (Será sobrescrito)
    public void exibirInformacoes() {
        System.out.println("Código: " + codigoInterno);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Admissão: " + dataAdmissao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
    }
}