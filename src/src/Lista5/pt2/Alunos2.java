package Lista5.pt2;

public class Alunos2 {
     // Atributos privados
    private String ra;
    private String nome;
    private double mensalidade;
    private EControleAtivacao2 situacao;

    // Construtor padrão
    public Alunos2() {}

    // Construtor com parâmetros (opcional)
    public Alunos2(String ra, String nome, double mensalidade, EControleAtivacao2 situacao) {
        setRa(ra);
        setNome(nome);
        setMensalidade(mensalidade);
        setSituacao(situacao);
    }

    // Métodos Get e Set com consistência (validações)
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 10) {
            System.out.println("Erro: o nome deve conter pelo menos 10 caracteres e não pode ser nulo.");
        } else {
            this.nome = nome;
        }
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        if (mensalidade <= 0) {
            System.out.println("Erro: a mensalidade deve ser maior que zero.");
        } else {
            this.mensalidade = mensalidade;
        }
    }

    public EControleAtivacao2 getSituacao() {
        return situacao;
    }

    public void setSituacao(EControleAtivacao2 situacao) {
        this.situacao = situacao;
    }

    // Método para imprimir relatório
    public void ImprimirRelatorio(EControleRelatorio2 pFormatoRelatorio) {
        if (pFormatoRelatorio == EControleRelatorio2.crSintetico) {
            System.out.println("=== Relatório Sintético ===");
            System.out.println("Nome: " + nome);
            System.out.println("RA: " + ra);
        } else if (pFormatoRelatorio == EControleRelatorio2.crAtivo) {
            System.out.println("=== Relatório Analítico ===");
            System.out.println("Nome: " + nome);
            System.out.println("RA: " + ra);
            System.out.println("Mensalidade: R$ " + mensalidade);
            
            // Tratamento do enumerador (situação)
            if (situacao == EControleAtivacao2.caAtivo) {
                System.out.println("Situação: Ativo");
            } else if (situacao == EControleAtivacao2.caDesativado) {
                System.out.println("Situação: Desativado");
            } else if (situacao == EControleAtivacao2.caPendente) {
                System.out.println("Situação: Pendente");
            }
        }
        System.out.println("============================\n");
    }
}
