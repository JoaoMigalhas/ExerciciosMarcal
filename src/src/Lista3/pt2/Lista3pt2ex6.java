package Lista3.pt2;

import java.util.Scanner;

public class Lista3pt2ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite um valor positivo (ou um negativo para parar): ");
            double valor = teclado.nextDouble();

            if (valor < 0) {
                break; 
            }

            soma += valor;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("\nTotal de valores somados: " + quantidade);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("\nNenhum valor positivo foi informado.");
        }
        teclado.close();
    }
}
