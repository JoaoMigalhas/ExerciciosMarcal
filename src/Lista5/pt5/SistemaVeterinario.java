import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class SistemaVeterinario {
    // D. Base de dados (Continua PRIVATE - Encapsulamento)
    private List<Animal> animaisCadastrados;
    private Scanner scanner;

    public SistemaVeterinario() {
        this.animaisCadastrados = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    // NOVO MÉTODO PÚBLICO PARA FACILITAR TESTES/INSERÇÃO EXTERNA
    /**
     * Adiciona um objeto Animal (Mamifero ou Reptil) à lista.
     * @param animal O objeto Animal a ser adicionado.
     */
    public void adicionarAnimal(Animal animal) {
        this.animaisCadastrados.add(animal);
    }
    // FIM DO NOVO MÉTODO
    

    // --- Métodos de CRUD (Restante dos métodos omitidos por brevidade, mas devem estar aqui) ---
    // (inserirAnimal(), pesquisarAnimal(), excluirAnimal(), imprimirRelatorio())
    
    // ... (Coloque os métodos inserirAnimal, pesquisarAnimal, excluirAnimal e imprimirRelatorio aqui)

    /**
     * Relatório: Imprime todos os animais cadastrados.
     */
    public void imprimirRelatorio() {
        System.out.println("\n==================================");
        System.out.println("📊 RELATÓRIO DE ANIMAIS CADASTRADOS");
        System.out.println("Total: " + animaisCadastrados.size() + " animais");
        System.out.println("==================================");

        if (animaisCadastrados.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        for (Animal animal : animaisCadastrados) {
            animal.exibirInformacoes(); 
            System.out.println("----------------------------------");
        }
    }
    
    public void pesquisarAnimal(int codigo) {
        System.out.println("\n--- Pesquisa de Animal (Código: " + codigo + ") ---");
        for (Animal animal : animaisCadastrados) {
            if (animal.getCodigo() == codigo) {
                animal.exibirInformacoes(); 
                return;
            }
        }
        System.out.println("❌ Animal com código " + codigo + " não encontrado.");
    }

    public void excluirAnimal(int codigo) {
        System.out.println("\n--- Exclusão de Animal (Código: " + codigo + ") ---");
        for (int i = 0; i < animaisCadastrados.size(); i++) {
            if (animaisCadastrados.get(i).getCodigo() == codigo) {
                String nomeAnimal = animaisCadastrados.get(i).getNome();
                animaisCadastrados.remove(i);
                System.out.println("🗑️ Animal " + nomeAnimal + " (Código: " + codigo + ") excluído com sucesso.");
                return;
            }
        }
        System.out.println("❌ Animal com código " + codigo + " não encontrado para exclusão.");
    }
}