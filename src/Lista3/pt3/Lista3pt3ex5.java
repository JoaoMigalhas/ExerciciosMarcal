package Lista3.pt3;

import java.util.Scanner;

public class Lista3pt3ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = teclado.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = teclado.nextInt();

        // Fórmula da soma de 1 até n: n * (n + 1) / 2
        int somaA = a * (a + 1) / 2;
        int somaB = b * (b + 1) / 2;
        int somaC = c * (c + 1) / 2;

        // Mostrar resultados individuais
        System.out.println("Soma do intervalo até " + a + " = " + somaA);
        System.out.println("Soma do intervalo até " + b + " = " + somaB);
        System.out.println("Soma do intervalo até " + c + " = " + somaC);

        // Menor e maior soma
        int menor = somaA;
        if (somaB < menor) menor = somaB;
        if (somaC < menor) menor = somaC;

        int maior = somaA;
        if (somaB > maior) maior = somaB;
        if (somaC > maior) maior = somaC;

        System.out.println("Menor soma = " + menor);
        System.out.println("Maior soma = " + maior);

        // Ordenação sem array (apenas ifs)
        System.out.println("Valores ordenados do menor para o maior:");

        if (somaA <= somaB && somaA <= somaC) {
            System.out.print(somaA + " ");
            if (somaB <= somaC) {
                System.out.print(somaB + " " + somaC);
            } else {
                System.out.print(somaC + " " + somaB);
            }
        } else if (somaB <= somaA && somaB <= somaC) {
            System.out.print(somaB + " ");
            if (somaA <= somaC) {
                System.out.print(somaA + " " + somaC);
            } else {
                System.out.print(somaC + " " + somaA);
            }
        } else {
            System.out.print(somaC + " ");
            if (somaA <= somaB) {
                System.out.print(somaA + " " + somaB);
            } else {
                System.out.print(somaB + " " + somaA);
            }
        }
        teclado.close();
    }
}
