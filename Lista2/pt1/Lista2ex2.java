package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, numeropositivo;

        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();

        if (numero < 0) {
            numeropositivo = numero * -1; // transforma em positivo
            System.out.println("Seu numero positivo é igual a " + numeropositivo);
        } else {
            System.out.println("Seu numero positivo é igual a " + numero);
        }
        teclado.close();
    }
}
