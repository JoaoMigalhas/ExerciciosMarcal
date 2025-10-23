package Lista4;
import java.util.Scanner;

public class Lista4ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] mensalidades = new double[10];
        int opcao;
        double soma;

        // Inicializa vetor com zeros
        for (int i = 0; i < 10; i++) {
            mensalidades[i] = 0;
        }

        do {
            System.out.println("\n..:: MENSALIDADES ::..");
            System.out.println("1. Zerar");
            System.out.println("2. Carregar");
            System.out.println("3. Imprimir");
            System.out.println("4. Somar");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1: // Zerar
                    for (int i = 0; i < 10; i++) {
                        mensalidades[i] = 0;
                    }
                    System.out.println("Todas as mensalidades foram zeradas!");
                    break;

                case 2: // Carregar
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Digite o valor da mensalidade " + (i + 1) + ": ");
                        mensalidades[i] = teclado.nextDouble();
                    }
                    break;

                case 3: // Imprimir
                    System.out.println("\n--- Mensalidades armazenadas ---");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Posição " + i + ": " + mensalidades[i]);
                    }
                    break;

                case 4: // Somar
                    soma = 0;
                    for (int i = 0; i < 10; i++) {
                        soma += mensalidades[i];
                    }
                    System.out.println("Soma de todas as mensalidades = " + soma);
                    break;

                case 9: // Sair
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 9);
        teclado.close();
    }
}
