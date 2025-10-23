package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 0;

        System.out.print("Digite um numero ");
        a = teclado.nextInt();

        if (a >= 1 && a <= 5) {
            System.out.print("O valor está na faixa permitida");
        } else {
            System.out.print("O valor não está na faixa permitida");
        }
        teclado.close();
    }
}
