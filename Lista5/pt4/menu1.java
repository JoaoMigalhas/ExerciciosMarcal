package Lista5.pt4;

import java.util.Scanner;

public class menu1 {
    public static void exibir() {
        
    
    Scanner teclado = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("Menu de calculos");
        System.out.println("1. Somar 2 valores doubles");
        System.out.println("2. Somar 2 valores inteiros com um double");
        System.out.println("3. Somar valores de um vetor");
        System.out.println("4. Maior numero entre inteiro e double");
        System.out.println("5. Maior numero em um vetor");
        System.out.println("0. Sair");
        System.out.println("Digite a sua opção: ");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Digite o valor de A:");
            double a1 = teclado.nextDouble();

            System.out.println("Digite o valor de B:");
            double b1 = teclado.nextDouble();

            System.out.println("Resultado: " + Calculo.Somar(a1, b1));
            break;
        
            case 2:
            System.out.println("Digite o valor de A:");
            int a2 = teclado.nextInt();

            System.out.println("Digite o valor de B:");
            int b2 = teclado.nextInt();

            System.out.println("Digite o valor de C:");
            double c1 = teclado.nextDouble();

            System.out.println("Resultado: " + Calculo.Somar(a2, b2, c1));
            break;

            case 3:
            System.out.println("Quantidade de valores:");
            int numerosSomar = teclado.nextInt();
            double [] vetorSoma = new double[numerosSomar];

            for (int i =0; i < numerosSomar; i++){
                System.out.println("Valor " + (i+1) + ": ");
                vetorSoma[i] = teclado.nextDouble();
            }
            System.out.println("Resultado da soma: " + Calculo.Somar(vetorSoma));
            break;

            case 4:
            System.out.println("Digite o valor de A (int): ");
            int a4 = teclado.nextInt();

            System.out.println("Digite o valor de B (double)");
            double b4 = teclado.nextDouble();

            System.out.println("Maior valor: " + Calculo.Maior(a4, b4));
            break;

            case 5:
            System.out.println("Quantidade de valores: ");
            int numerosMaior = teclado.nextInt();
            double [] vetorMaior = new double[numerosMaior];

            for (int i = 0; i < numerosMaior; i++){
                System.out.println("Valor " + (i + 1) + ": ");
                vetorMaior[i] = teclado.nextDouble();
            }
            System.out.println("Maior valor: " + Calculo.Maior(vetorMaior));
            break;

            case 0:
            System.out.println("Progama encerrado!!");
            break;

            default:
            System.out.println("Opção invalida! Tente novamente");
            break;

        }
//teste
        teclado.close();
    } while (opcao != 0);
}
}



