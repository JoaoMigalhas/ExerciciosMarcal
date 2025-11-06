import java.time.LocalDate;

public class Litsa5ex1pt5 {
    public static void main(String[] args) {
        SistemaVeterinario sistema = new SistemaVeterinario();

        System.out.println("--- INSERÇÃO DE DADOS MOCKADOS ---");
        
        // 1. Exemplo de Mamifero
        Mamifero rex = new Mamifero("Rex", 30.0, 5, "Macho", LocalDate.of(2025, 11, 1), 
                                      "Vacina", "Ana", "000.111.222-33", "98765-4321", 
                                      "Cachorro", "Marrom", "Carnívoro");
        
        // CORRIGIDO: Usa o método público adicionarAnimal()
        sistema.adicionarAnimal(rex); 
        System.out.println("Cachorro cadastrado (Código: " + rex.getCodigo() + ")");
        
        // 2. Exemplo de Réptil
        Reptil snaky = new Reptil("Snaky", 1.2, 2, "Fêmea", LocalDate.of(2025, 11, 5), 
                                   "Lesão na Cauda", "Pedro", "333.222.111-00", "12345-6789", 
                                   "Escamados", "Ovípara", "Terreo");
        
        // CORRIGIDO: Usa o método público adicionarAnimal()
        sistema.adicionarAnimal(snaky);
        System.out.println("Réptil cadastrado (Código: " + snaky.getCodigo() + ")");

        // 3. Relatório
        sistema.imprimirRelatorio();

        // 4. Pesquisa
        sistema.pesquisarAnimal(rex.getCodigo());

        // 5. Exclusão
        sistema.excluirAnimal(rex.getCodigo());

        // 6. Relatório Final
        sistema.imprimirRelatorio();
    }
}