package Lista5.pt3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ProdutosBanco banco = new ProdutosBanco();
        int opcao;

        do {
            System.out.println("\n=== MENU PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar margem de lucro");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1 -> {
                    Produto p = new Produto();

                    System.out.print("Código EAN: ");
                    p.setCodigoEAN(entrada.nextLong());
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    p.setNome(entrada.nextLine());

                    System.out.print("Descrição: ");
                    p.setDescricao(entrada.nextLine());

                    System.out.print("Preço de Custo: ");
                    p.setPrecoCusto(entrada.nextDouble());

                    System.out.print("Margem de Lucro (%): ");
                    p.setMargemLucro(entrada.nextDouble());

                    System.out.print("Saldo em Estoque: ");
                    p.setSaldoEstoque(entrada.nextDouble());
                    entrada.nextLine();

                    System.out.println("Situação do produto:");
                    System.out.println("1 - Ativo");
                    System.out.println("2 - Desativado");
                    System.out.println("3 - Cancelado");
                    System.out.print("Opção: ");
                    int situacao = entrada.nextInt();
                    entrada.nextLine();

                    switch (situacao) {
                        case 1 -> p.setAtivo(EnumAtivo.Ativo);
                        case 2 -> p.setAtivo(EnumAtivo.Desativado);
                        case 3 -> p.setAtivo(EnumAtivo.Cancelado);
                        default -> p.setAtivo(EnumAtivo.Cancelado);
                    }

                    banco.adicionarProduto(p);
                }
                case 2 -> banco.listarProdutos();

                case 3 -> {
                    System.out.print("Informe o percentual de aumento de margem: ");
                    double perc = entrada.nextDouble();
                    banco.AtualizarMargemLucroEm(perc);
                }

                case 4 -> {
                    System.out.print("Informe o código EAN do produto a remover: ");
                    long codigo = entrada.nextLong();
                    banco.removerProduto(codigo);
                }

                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        entrada.close();
    }
}

