package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Lista4ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         Random rand = new Random();
        int[] valores = new int[60];
        int opcao;

        // Inicializa vetor com -1
        for (int i = 0; i < 60; i++) {
            valores[i] = -1;
        }

        do {
            System.out.println("\n..:: SORTEIO ::..");
            System.out.println("1. Zerar");
            System.out.println("2. Carregar aleatório");
            System.out.println("3. Imprimir");
            System.out.println("4. Somar");
            System.out.println("5. Relatório valores ímpares");
            System.out.println("6. Maiores que");
            System.out.println("7. Quantos existem/repetidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch(opcao) {
                case 1: // Zerar
                    for (int i = 0; i < 60; i++) {
                        valores[i] = -1;
                    }
                    System.out.println("Todos os valores foram zerados (-1).");
                    break;

                case 2: // Carregar aleatório
                    for (int i = 0; i < 60; i++) {
                        valores[i] = rand.nextInt(60) + 1; // 1 a 60
                    }
                    System.out.println("Vetor carregado com valores aleatórios entre 1 e 60.");
                    break;

                case 3: // Imprimir
                    System.out.println("Valores armazenados:");
                    for (int i = 0; i < 60; i++) {
                        System.out.println("Posição " + i + ": " + valores[i]);
                    }
                    break;

                case 4: // Somar
                    int soma = 0;
                    for (int i = 0; i < 60; i++) {
                        soma += valores[i];
                    }
                    System.out.println("Soma de todos os valores = " + soma);
                    break;

                case 5: // Relatório valores ímpares
                    int somaImpares = 0;
                    int contImpares = 0;
                    for (int i = 0; i < 60; i++) {
                        if (valores[i] % 2 != 0) {
                            somaImpares += valores[i];
                            contImpares++;
                        }
                    }
                    System.out.println("Quantidade de valores ímpares = " + contImpares);
                    System.out.println("Soma dos valores ímpares = " + somaImpares);
                    break;

                case 6: // Maiores que
                    System.out.print("Digite um valor entre 1 e 60: ");
                    int limite = teclado.nextInt();
                    System.out.println("Valores maiores que " + limite + ":");
                    for (int i = 0; i < 60; i++) {
                        if (valores[i] > limite) {
                            System.out.print(valores[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 7: // Quantos existem/repetidos
                    System.out.print("Digite um valor entre 1 e 60: ");
                    int valor = teclado.nextInt();
                    int cont = 0;
                    for (int i = 0; i < 60; i++) {
                        if (valores[i] == valor) cont++;
                    }
                    System.out.println("O valor " + valor + " aparece " + cont + " vezes no vetor.");
                    break;

                case 0: // Sair
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);
    }
}
