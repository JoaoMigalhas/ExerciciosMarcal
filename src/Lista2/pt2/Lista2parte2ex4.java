package Lista2.pt2;

import java.util.Scanner;

public class Lista2parte2ex4 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero ");
        numero = teclado.nextInt();

        if (numero > 3) {
            System.out.println(numero + " é maior que 3");
        } else {
            System.out.println(numero + " não é maior que 3");
        }
        teclado.close();
    }
}
