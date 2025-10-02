package Lista4;

import java.util.Scanner;

public class Lista4ex3 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        int[] idades = new int[8];
        int opcao;

        // Inicializa vetor com zeros
        for (int i = 0; i < 8; i++) {
            idades[i] = 0;
        }

        do {
            System.out.println("\n..:: IDADES ::..");
            System.out.println("1. Zerar");
            System.out.println("2. Carregar");
            System.out.println("3. Imprimir");
            System.out.println("4. Somar");
            System.out.println("5. Pares");
            System.out.println("6. Contar pares");
            System.out.println("7. Somar pares");
            System.out.println("8. Menores idade");
            System.out.println("9. Contar maiores idade");
            System.out.println("10. Somar maiores idade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch(opcao) {
                case 1: // Zerar
                    for (int i = 0; i < 8; i++) {
                        idades[i] = 0;
                    }
                    System.out.println("Todas as idades foram zeradas!");
                    break;

                case 2: // Carregar
                    for (int i = 0; i < 8; i++) {
                        System.out.print("Digite a idade " + (i+1) + ": ");
                        idades[i] = teclado.nextInt();
                    }
                    break;

                case 3: // Imprimir
                    System.out.println("Idades armazenadas:");
                    for (int i = 0; i < 8; i++) {
                        System.out.println("Posição " + i + ": " + idades[i]);
                    }
                    break;

                case 4: // Somar
                    int soma = 0;
                    for (int i = 0; i < 8; i++) {
                        soma += idades[i];
                    }
                    System.out.println("Soma das idades = " + soma);
                    break;

                case 5: // Pares
                    System.out.println("Idades pares:");
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] % 2 == 0) {
                            System.out.print(idades[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 6: // Contar pares
                    int contPares = 0;
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] % 2 == 0) contPares++;
                    }
                    System.out.println("Quantidade de idades pares = " + contPares);
                    break;

                case 7: // Somar pares
                    int somaPares = 0;
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] % 2 == 0) somaPares += idades[i];
                    }
                    System.out.println("Soma das idades pares = " + somaPares);
                    break;

                case 8: // Menores idade
                    System.out.println("Idades menores que 18:");
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] < 18) {
                            System.out.print(idades[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 9: // Contar maiores idade
                    int contMaiores = 0;
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] >= 18) contMaiores++;
                    }
                    System.out.println("Quantidade de idades maiores ou iguais a 18 = " + contMaiores);
                    break;

                case 10: // Somar maiores idade
                    int somaMaiores = 0;
                    for (int i = 0; i < 8; i++) {
                        if (idades[i] >= 18) somaMaiores += idades[i];
                    }
                    System.out.println("Soma das idades maiores ou iguais a 18 = " + somaMaiores);
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

