package Lista3.pt3;
import java.util.Scanner;

public class Lista3pt3ex8 {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU INTERATIVO ---");
            System.out.println("1. Contar pares");
            System.out.println("2. Contar ímpares");
            System.out.println("3. Produto pares");
            System.out.println("4. Produto ímpares");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Informe um número inteiro: ");
                int n = teclado.nextInt();

                switch (opcao) {
                    case 1: // contar pares
                        int contPares = 0;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) contPares++;
                        }
                        System.out.println("Quantidade de pares entre 1 e " + n + " = " + contPares);
                        break;

                    case 2: // contar ímpares
                        int contImpares = 0;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 != 0) contImpares++;
                        }
                        System.out.println("Quantidade de ímpares entre 1 e " + n + " = " + contImpares);
                        break;

                    case 3: // produto pares
                        long prodPares = 1;
                        boolean temPar = false;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                prodPares *= i;
                                temPar = true;
                            }
                        }
                        if (temPar)
                            System.out.println("Produto dos pares até " + n + " = " + prodPares);
                        else
                            System.out.println("Não há números pares até " + n);
                        break;

                    case 4: // produto ímpares
                        long prodImpares = 1;
                        boolean temImpar = false;
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 != 0) {
                                prodImpares *= i;
                                temImpar = true;
                            }
                        }
                        if (temImpar)
                            System.out.println("Produto dos ímpares até " + n + " = " + prodImpares);
                        else
                            System.out.println("Não há números ímpares até " + n);
                        break;
                }
            } else if (opcao != 9) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 9);

        System.out.println("Encerrando o programa...");
    }
    
}
