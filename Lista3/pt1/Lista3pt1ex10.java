package Lista3.pt1;

import java.util.Scanner;

public class Lista3pt1ex10 {
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        long soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("digite o " + i + " número: ");
            int numero = teclado.nextInt();
            long fatorial = 1;

            if (numero < 0) {
                System.out.println("fatorial negativo");
                continue;
            } else if (numero == 0) {
                fatorial = 1;
            } else {
                for (int n = 1; n <= numero; n++) {
                    fatorial *= n;
                }
            }

            soma += fatorial;
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }
             System.out.println("A soma total de todos os fatoriais é: " + soma);
             teclado.close();
    }
}
