package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Lista4ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int[] vetor = new int[60];
        int opcao;

        // Inicializa vetor com -1
        for (int i = 0; i < 60; i++) {
            vetor[i] = -1;
        }

        do {
            System.out.println("\n..:: SORTEIO 2 ::..");
            System.out.println("1. Zerar");
            System.out.println("2. Carregar aleatório");
            System.out.println("3. Imprimir");
            System.out.println("4. Entre valores");
            System.out.println("5. Exibir repetidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch(opcao) {
                case 1: // Zerar
                    for (int i = 0; i < 60; i++) {
                        vetor[i] = -1;
                    }
                    System.out.println("Todos os valores foram zerados (-1).");
                    break;

                case 2: // Carregar aleatório
                    for (int i = 0; i < 60; i++) {
                        vetor[i] = rand.nextInt(60) + 1; // 1 a 60
                    }
                    System.out.println("Vetor carregado com valores aleatórios entre 1 e 60.");
                    break;

                case 3: // Imprimir
                    System.out.println("Valores armazenados:");
                    for (int i = 0; i < 60; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4: // Entre valores
                    System.out.print("Digite o primeiro valor (1 a 60): ");
                    int val1 = teclado.nextInt();
                    System.out.print("Digite o segundo valor (1 a 60): ");
                    int val2 = teclado.nextInt();
                    int min = Math.min(val1, val2);
                    int max = Math.max(val1, val2);
                    System.out.println("Valores entre " + min + " e " + max + ":");
                    for (int i = 0; i < 60; i++) {
                        if (vetor[i] >= min && vetor[i] <= max) {
                            System.out.print(vetor[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5: // Exibir repetidos
                    System.out.println("Valores repetidos e suas quantidades:");
                    for (int i = 0; i < 60; i++) {
                        int cont = 0;
                        for (int j = 0; j < 60; j++) {
                            if (vetor[i] == vetor[j]) {
                                cont++;
                            }
                        }
                        if (cont > 1) {
                            System.out.println(vetor[i] + " = " + cont);
                        }
                    }
                    break;

                case 0: // Sair
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);
        teclado.close();
    }
}
