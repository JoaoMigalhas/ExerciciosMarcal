package Lista5;

import java.util.Scanner;

public class Lista5ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[100];
        int contador = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU PRODUTOS =====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Pesquisar Produto (por código)");
            System.out.println("3 - Remover Produto (por código)");
            System.out.println("4 - Imprimir todos os produtos");
            System.out.println("5 - Limpar base de dados");
            System.out.println("6 - Contar produtos cadastrados");
            System.out.println("7 - Exibir produto com maior preço de venda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < 100) {
                        System.out.print("Código: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Descrição: ");
                        String descricao = sc.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        int qtd = sc.nextInt();
                        System.out.print("Preço de custo: ");
                        double custo = sc.nextDouble();
                        System.out.print("Margem de lucro (%): ");
                        double lucro = sc.nextDouble();

                        produtos[contador] = new Produto(codigo, nome, descricao, qtd, custo, lucro);
                        contador++;
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de produtos atingido!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o código do produto: ");
                    int codigoBusca = sc.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < contador; i++) {
                        if (produtos[i].getCodigo() == codigoBusca) {
                            System.out.println("\nProduto encontrado:\n" + produtos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) System.out.println("Produto não encontrado!");
                    break;

                case 3:
                    System.out.print("Digite o código do produto a remover: ");
                    int codigoRemover = sc.nextInt();
                    boolean removido = false;
                    for (int i = 0; i < contador; i++) {
                        if (produtos[i].getCodigo() == codigoRemover) {
                            produtos[i] = produtos[contador - 1];
                            produtos[contador - 1] = null;
                            contador--;
                            removido = true;
                            System.out.println("Produto removido com sucesso!");
                            break;
                        }
                    }
                    if (!removido) System.out.println("Produto não encontrado!");
                    break;

                case 4:
                    if (contador == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n=== LISTA DE PRODUTOS ===");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(produtos[i]);
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < contador; i++) {
                        produtos[i] = null;
                    }
                    contador = 0;
                    System.out.println("Base de dados limpa!");
                    break;

                case 6:
                    System.out.println("Número de produtos cadastrados: " + contador);
                    break;

                case 7:
                    if (contador == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        Produto maior = produtos[0];
                        for (int i = 1; i < contador; i++) {
                            if (produtos[i].getPrecoVenda() > maior.getPrecoVenda()) {
                                maior = produtos[i];
                            }
                        }
                        System.out.println("\nProduto com MAIOR preço de venda:\n" + maior);
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
