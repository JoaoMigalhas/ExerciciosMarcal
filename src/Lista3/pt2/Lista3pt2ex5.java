package Lista3.pt2;

import java.util.Scanner;

public class Lista3pt2ex5 {
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 

    double soma = 0;

    for (int i = 1; i <= 6; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            double valor = teclado.nextDouble();
            soma += valor;
        }

        double media = soma / 6;

        System.out.println("\nSoma dos valores = " + soma);
        System.out.println("Média dos valores = " + media);
    }
}
