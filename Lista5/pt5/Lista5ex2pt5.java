import java.time.LocalDate;

public class Lista5ex2pt5 {
    public static void main(String[] args) {
        SistemaFolhaPagamento sistema = new SistemaFolhaPagamento();

        System.out.println("--- TESTE DE INSERÇÃO E VALIDAÇÕES ---");

        // 1. Inserção VÁLIDA (Engenheiro)
        Engenheiro eng1 = new Engenheiro("Fulano de Tal Engenheiro", "11122233344", 
                                        LocalDate.of(2024, 11, 6), 5500.00, 
                                        "Civil", "Junior");
        sistema.inserir(eng1);
        
        // 2. Inserção VÁLIDA (Diretor)
        Diretor dir1 = new Diretor("Beltrano Ferreira da Silva Junior", "55566677788", 
                                   LocalDate.of(2020, 10, 15), 15000.00, 
                                   "Financeiro", LocalDate.of(2023, 1, 1));
        sistema.inserir(dir1);

        // 3. Inserção VÁLIDA (Funcionário Geral)
        FuncionarioGeral func1 = new FuncionarioGeral("Maria Jose dos Santos Almeida", "99988877766", 
                                                    LocalDate.of(2025, 1, 1), 2100.00, 
                                                    "Secretaria", "Administrativo");
        sistema.inserir(func1);

        // 4. Teste de Validação de Salário (DEVE FALHAR)
        try {
            Colaborador invalido = new Engenheiro("Nome Com Mais De Dez", "11122233344", LocalDate.now(), 0, "Civil", "Junior");
            sistema.inserir(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Validação de Salário funcionou: " + e.getMessage());
        }

        System.out.println("\n--- TESTE DE OPERAÇÕES ---");
        
        // 5. Relatório Completo
        sistema.imprimirRelatorio();

        // 6. Pesquisa por Código
        sistema.pesquisarPorCodigo(eng1.getCodigoInterno());

        // 7. Pesquisa por Nome Parcial
        sistema.pesquisarPorNomeParcial("Silva"); // Deve encontrar o Diretor

        // 8. Alterar (Salário e Nome)
        sistema.alterar(dir1.getCodigoInterno(), 18000.00, "Beltrano Silva Diretor Senior");

        // 9. Exclusão
        sistema.excluir(func1.getCodigoInterno());

        // 10. Relatório Final
        sistema.imprimirRelatorio();
    }
}