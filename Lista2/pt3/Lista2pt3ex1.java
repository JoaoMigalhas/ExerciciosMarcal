package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex1 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3, maior, menor, meio = 0;

        System.out.println("Digite um numero: ");
        numero1 = teclado.nextInt();
        maior = numero1;
        menor = numero1;
        meio = numero1;

        System.out.println("Digite outro numero: ");
        numero2 = teclado.nextInt();
        if (numero2 > maior) maior = numero2;
        if (numero2 < menor) menor = numero2;
        if (numero2 > menor && numero2 < maior) meio = numero2;

        System.out.println("Digite algum outro numero: ");
        numero3 = teclado.nextInt();
        if (numero3 > maior) maior = numero3;
        if (numero3 < menor) menor = numero3;
        if (numero3 > menor && numero3 < maior) meio = numero3;

        System.out.println("Seus numeros em ordem crescente sao: " + menor + ", " + meio + " e " + maior);
        teclado.close();
    }
}
