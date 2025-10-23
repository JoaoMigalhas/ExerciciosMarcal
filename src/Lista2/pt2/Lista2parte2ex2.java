package Lista2.pt2;

import java.util.Scanner;

public class Lista2parte2ex2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " é impar");
        }
        teclado.close();
    }
}
