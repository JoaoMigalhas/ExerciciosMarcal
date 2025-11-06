import java.util.Scanner;

public class Lista5ex1pt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();
        int opcao;

        do {
            System.out.println("\n--- CLÍNICA VETERINÁRIA ---");
            System.out.println("1. Cadastrar Mamífero");
            System.out.println("2. Cadastrar Réptil");
            System.out.println("3. Pesquisar por código");
            System.out.println("4. Excluir por código");
            System.out.println("5. Listar todos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> clinica.cadastrarMamifero(sc);
                case 2 -> clinica.cadastrarReptil(sc);
                case 3 -> {
                    System.out.print("Informe o código: ");
                    int cod = sc.nextInt();
                    clinica.pesquisar(cod);
                }
                case 4 -> {
                    System.out.print("Informe o código: ");
                    int cod = sc.nextInt();
                    clinica.excluir(cod);
                }
                case 5 -> clinica.listar();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
