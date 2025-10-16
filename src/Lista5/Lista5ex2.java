package Lista5;

import java.util.Scanner;

public class Lista5ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno2[] alunos = new Aluno2[100]; // vetor de alunos
        int qtd = 0; // contador
        int opcao;

        do {
            System.out.println("\n===== MENU DE ALUNOS =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Exibir Todos");
            System.out.println("3 - Localizar Aluno (RA)");
            System.out.println("4 - Remover Aluno (RA)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    if (qtd < alunos.length) {
                        Aluno2 novo = new Aluno2();

                        System.out.print("RA: ");
                        novo.setRa(sc.nextLine());

                        System.out.print("Nome: ");
                        novo.setNome(sc.nextLine());

                        System.out.print("Idade: ");
                        novo.setIdade(sc.nextInt());
                        sc.nextLine();

                        System.out.print("CPF: ");
                        novo.setCpf(sc.nextLine());

                        System.out.print("Sexo: ");
                        novo.setSexo(sc.nextLine());

                        System.out.print("E-mail: ");
                        novo.setEmail(sc.nextLine());

                        System.out.print("Telefone: ");
                        novo.setTelefone(sc.nextLine());

                        alunos[qtd] = novo;
                        qtd++;

                        System.out.println("\nAluno cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de alunos atingido!");
                    }
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("\nNenhum aluno cadastrado.");
                    } else {
                        System.out.println("\n=== LISTA DE ALUNOS ===");
                        for (int i = 0; i < qtd; i++) {
                            alunos[i].exibirDados();
                        }
                    }
                    break;

                case 3:
                    System.out.print("\nInforme o RA para localizar: ");
                    String raBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (alunos[i].getRa().equalsIgnoreCase(raBusca)) {
                            alunos[i].exibirDados();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("\nInforme o RA para remover: ");
                    String raRemover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < qtd; i++) {
                        if (alunos[i].getRa().equalsIgnoreCase(raRemover)) {
                            for (int j = i; j < qtd - 1; j++) {
                                alunos[j] = alunos[j + 1];
                            }
                            alunos[qtd - 1] = null;
                            qtd--;
                            removido = true;
                            System.out.println("Aluno removido com sucesso!");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 0:
                    System.out.println("\nEncerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

