package Lista2.pt2;

import java.util.Scanner;

public class Lista2parte2ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero de 1 a 9 ");
        numero = teclado.nextInt();

        if (numero >= 1 && numero <= 9) {
            System.out.println(numero + " esta na faixa permitida");
        } else {
            System.out.println(numero + " não esta na faixa permitida");
        }
        teclado.close();
    }
}
