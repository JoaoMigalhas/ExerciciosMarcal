package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2 = 0;

        System.out.println("Digite um numero ");
        numero1 = teclado.nextInt();
        System.out.println("Digite algum outro numero ");
        numero2 = teclado.nextInt();

        if (numero1 == numero2) {
            System.out.println("Valores iguais não são permitidos ");
        } else if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que o " + numero2);
        } else {
            System.out.println(numero2 + " é maior que o " + numero1);
        }
    }
}
