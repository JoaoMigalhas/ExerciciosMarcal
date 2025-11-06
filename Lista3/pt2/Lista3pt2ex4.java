package Lista3.pt2;

import java.util.Scanner;

public class Lista3pt2ex4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        long soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("digite o " + i + " número: ");
            int numero = teclado.nextInt();
            long fatorial = 1;

            for (int n = 1; n <= numero; n++) {
                    fatorial *= n;
                }
            soma += fatorial;
        }
     System.out.println("A soma total de todos os fatoriais é: " + soma);
     teclado.close();
    }
}

