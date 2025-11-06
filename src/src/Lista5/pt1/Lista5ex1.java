package Lista5.pt1;

import java.util.Scanner;

public class Lista5ex1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = null; // objeto começa nulo
        int opcao;

        do {
            System.out.println("\n===== MENU ALUNO =====");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Exibir Aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    aluno = new Aluno();

                    System.out.print("RA: ");
                    aluno.setRa(sc.nextLine());

                    System.out.print("Nome: ");
                    aluno.setNome(sc.nextLine());

                    System.out.print("Idade: ");
                    aluno.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.print("CPF: ");
                    aluno.setCpf(sc.nextLine());

                    System.out.print("Sexo: ");
                    aluno.setSexo(sc.nextLine());

                    System.out.print("Email: ");
                    aluno.setEmail(sc.nextLine());

                    System.out.print("Telefone: ");
                    aluno.setTelefone(sc.nextLine());

                    System.out.println("\nAluno cadastrado com sucesso!");
                    break;

                case 2:
                    if (aluno != null) {
                        aluno.exibirDados();
                    } else {
                        System.out.println("\nNenhum aluno cadastrado ainda!");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
