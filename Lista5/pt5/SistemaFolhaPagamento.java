import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SistemaFolhaPagamento {
    private List<Colaborador> colaboradores;

    public SistemaFolhaPagamento() {
        this.colaboradores = new ArrayList<>();
    }
    
    // E.i. Inserir (Valor) - Insere um novo registro (Utilizado para testes)
    public void inserir(Colaborador c) {
        try {
            colaboradores.add(c);
            System.out.println("✅ Colaborador " + c.getNome() + " inserido com código: " + c.getCodigoInterno());
        } catch (IllegalArgumentException e) {
            System.err.println("❌ Erro ao inserir colaborador: " + e.getMessage());
        }
    }
    
    // Método auxiliar para localizar um colaborador pelo código
    private Colaborador localizarPorCodigo(String codigo) {
        for (Colaborador c : colaboradores) {
            if (c.getCodigoInterno().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    // E.ii. Alterar (Codigo, NovoValor)
    public void alterar(String codigo, double novoSalario, String novoNome) {
        Colaborador c = localizarPorCodigo(codigo);
        if (c != null) {
            try {
                c.setSalario(novoSalario);
                c.setNome(novoNome);
                System.out.println("✏️ Colaborador código " + codigo + " alterado com sucesso.");
            } catch (IllegalArgumentException e) {
                System.err.println("❌ Erro ao alterar colaborador: " + e.getMessage());
            }
        } else {
            System.out.println("❌ Colaborador código " + codigo + " não encontrado.");
        }
    }

    // E.iii. Excluir (Codigo)
    public void excluir(String codigo) {
        Colaborador c = localizarPorCodigo(codigo);
        if (c != null) {
            colaboradores.remove(c);
            System.out.println("🗑️ Colaborador código " + codigo + " (" + c.getNome() + ") removido.");
        } else {
            System.out.println("❌ Colaborador código " + codigo + " não encontrado para exclusão.");
        }
    }

    // E.iv. Pesquisar (Codigo)
    public void pesquisarPorCodigo(String codigo) {
        Colaborador c = localizarPorCodigo(codigo);
        if (c != null) {
            System.out.println("\n--- Pesquisa por Código ---");
            c.exibirInformacoes(); // Polimorfismo
            System.out.println("---------------------------");
        } else {
            System.out.println("❌ Colaborador código " + codigo + " não encontrado.");
        }
    }

    // E.v. Pesquisar (NomeParcial)
    public List<Colaborador> pesquisarPorNomeParcial(String nomeParcial) {
        List<Colaborador> encontrados = new ArrayList<>();
        String busca = nomeParcial.toLowerCase();
        
        System.out.println("\n--- Pesquisa por Nome Parcial ('" + nomeParcial + "') ---");
        
        for (Colaborador c : colaboradores) {
            // Localizar um texto dentro de outro (ignorando case)
            if (c.getNome().toLowerCase().contains(busca)) {
                c.exibirInformacoes();
                System.out.println("---------------------------");
                encontrados.add(c);
            }
        }
        if (encontrados.isEmpty()) {
            System.out.println("Nenhum colaborador encontrado com o nome parcial: " + nomeParcial);
        }
        return encontrados;
    }

    // E.vi. Relatório
    public void imprimirRelatorio() {
        System.out.println("\n=============================================");
        System.out.println("📝 RELATÓRIO COMPLETO DE COLABORADORES (" + colaboradores.size() + ")");
        System.out.println("=============================================");

        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        for (Colaborador c : colaboradores) {
            c.exibirInformacoes(); // Polimorfismo: chama o método correto
            System.out.println("---------------------------------------------");
        }
    }
}