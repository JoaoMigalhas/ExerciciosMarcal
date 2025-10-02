package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 0;

        System.out.print("Digite um numero ");
        a = teclado.nextInt();

        if (a % 2 == 0) {
            System.out.print(a + " é um numero par");
        } else {
            System.out.print(a + " não é um numero par");
        }
    }
}
