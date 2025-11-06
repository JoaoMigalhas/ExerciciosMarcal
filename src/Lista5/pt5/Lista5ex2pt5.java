import java.util.Scanner;

public class Lista5ex2pt5 {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== SISTEMA FOLHA DE PAGAMENTO ===");
            System.out.println("1. Inserir Engenheiro");
            System.out.println("2. Inserir Diretor");
            System.out.println("3. Inserir Geral");
            System.out.println("4. Alterar Salário");
            System.out.println("5. Excluir");
            System.out.println("6. Pesquisar por Código");
            System.out.println("7. Pesquisar por Nome");
            System.out.println("8. Relatório");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Nome: "); String nome = sc.nextLine();
                        System.out.print("CPF (somente números): "); String cpf = sc.nextLine();
                        System.out.print("Data de admissão: "); String data = sc.nextLine();
                        System.out.print("Salário: "); double salario = sc.nextDouble(); sc.nextLine();
                        System.out.print("Tipo (Civil, Ambiental...): "); String tipo = sc.nextLine();
                        System.out.print("Nível (Estagiário, Junior...): "); String nivel = sc.nextLine();

                        sistema.inserir(new Engenheiro(nome, cpf, data, salario, tipo, nivel));
                    }
                    case 2 -> {
                        System.out.print("Nome: "); String nome = sc.nextLine();
                        System.out.print("CPF: "); String cpf = sc.nextLine();
                        System.out.print("Data de admissão: "); String data = sc.nextLine();
                        System.out.print("Salário: "); double salario = sc.nextDouble(); sc.nextLine();
                        System.out.print("Área: "); String area = sc.nextLine();
                        System.out.print("Data da posse: "); String posse = sc.nextLine();

                        sistema.inserir(new Diretor(nome, cpf, data, salario, area, posse));
                    }
                    case 3 -> {
                        System.out.print("Nome: "); String nome = sc.nextLine();
                        System.out.print("CPF: "); String cpf = sc.nextLine();
                        System.out.print("Data de admissão: "); String data = sc.nextLine();
                        System.out.print("Salário: "); double salario = sc.nextDouble(); sc.nextLine();
                        System.out.print("Cargo: "); String cargo = sc.nextLine();
                        System.out.print("Área: "); String area = sc.nextLine();

                        sistema.inserir(new Geral(nome, cpf, data, salario, cargo, area));
                    }
                    case 4 -> {
                        System.out.print("Código: "); String codigo = sc.nextLine();
                        System.out.print("Novo salário: "); double novoSalario = sc.nextDouble();
                        sistema.alterar(codigo, novoSalario);
                    }
                    case 5 -> {
                        System.out.print("Código: "); String codigo = sc.nextLine();
                        sistema.excluir(codigo);
                    }
                    case 6 -> {
                        System.out.print("Código: "); String codigo = sc.nextLine();
                        sistema.pesquisarPorCodigo(codigo);
                    }
                    case 7 -> {
                        System.out.print("Parte do nome: "); String nome = sc.nextLine();
                        sistema.pesquisarPorNome(nome);
                    }
                    case 8 -> sistema.relatorio();
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 0);

        sc.close();
    }
}
