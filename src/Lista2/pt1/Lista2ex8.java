package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3, numero4, numero5, maior, menor = 0;

        System.out.println("Digite o primeiro numero:");
        numero1 = teclado.nextInt();
        maior = numero1;
        menor = numero1;

        System.out.println("Digite o segundo numero:");
        numero2 = teclado.nextInt();
        if (numero2 > maior) maior = numero2;
        if (numero2 < menor) menor = numero2;

        System.out.println("Digite o terceiro numero:");
        numero3 = teclado.nextInt();
        if (numero3 > maior) maior = numero3;
        if (numero3 < menor) menor = numero3;

        System.out.println("Digite o quarto numero:");
        numero4 = teclado.nextInt();
        if (numero4 > maior) maior = numero4;
        if (numero4 < menor) menor = numero4;

        System.out.println("Digite o quinto numero:");
        numero5 = teclado.nextInt();
        if (numero5 > maior) maior = numero5;
        if (numero5 < menor) menor = numero5;

        System.out.println("O maior numero que você digitou foi: " + maior + " e o menor foi: " + menor);
    }
}
