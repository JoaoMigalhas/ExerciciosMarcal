package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, num5= 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite um numero: ");
        num1 = teclado.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = teclado.nextInt();

        System.out.println("Digite um terceiro numero: ");
        num3 = teclado.nextInt();

        System.out.println("Digite algum outro numero: ");
        num4 = teclado.nextInt();

        System.out.println("Digite um ultimo numero: ");
        num5 = teclado.nextInt();

        if (num1 % 2 == 0){
            pares++;
        } else {
            impares++;
        }
        if (num2 % 2 == 0){
            pares++;
        } else {
            impares++;
        }
        if (num3 % 2 == 0){
            pares++;
        } else {
            impares++;
        }
        if (num4 % 2 == 0){
            pares++;
        } else {
            impares++;
        }
        if (num5 % 2 == 0){
            pares++;
        } else {
            impares++;
        }

        if (pares > impares){
            System.out.println("O numero que mais apareceu foi os numeros pares" );
        } else if (impares > pares){
            System.out.println("O numero que mais apareceu foi os numeros impares");
        } else {
            System.out.println("A quantidade de numeros pares e impares foram iguais");
        }
        System.out.println(("A quantidade de numeros pares foi igual a " + pares + " e de numeros impares foi igual a " + impares));
        
    }
}
