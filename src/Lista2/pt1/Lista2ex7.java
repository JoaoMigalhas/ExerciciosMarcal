package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex7 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3, numero4 = 0;

        System.out.print("Digite um numero: ");
        numero1 = teclado.nextInt();

        System.out.print("Digite outro numero: ");
        numero2 = teclado.nextInt();

        System.out.print("Digite um terceiro numero: ");
        numero3 = teclado.nextInt();

        System.out.print("Digite um ultimo numero: ");
        numero4 = teclado.nextInt();

        if (numero1 % 2 == 0) {
            System.out.print(numero1 + " é divisivel por 2");
        } else if (numero1 % 3 == 0) {
            System.out.print(numero1 + " é divisivel por 3");
        } else {
            System.out.print(numero1 + " não é divisivel por 2 nem por 3");
        }

        if (numero2 % 2 == 0) {
            System.out.print(numero2 + " é divisivel por 2");
        } else if (numero2 % 3 == 0) {
            System.out.print(numero2 + " é divisivel por 3");
        } else {
            System.out.print(numero2 + " não é divisivel por 2 nem por 3");
        }

        if (numero3 % 2 == 0) {
            System.out.print(numero3 + " é divisivel por 2");
        } else if (numero3 % 3 == 0) {
            System.out.print(numero3 + " é divisivel por 3");
        } else {
            System.out.print(numero3 + " não é divisivel por 2 nem por 3");
        }

        if (numero4 % 2 == 0) {
            System.out.print(numero4 + " é divisivel por 2");
        } else if (numero4 % 3 == 0) {
            System.out.print(numero4 + " é divisivel por 3");
        } else {
            System.out.print(numero4 + " não é divisivel por 2 nem por 3");
        }
    }
}
