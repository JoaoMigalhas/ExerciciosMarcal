package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, maior, menor, meio = 0;

        System.out.println("Digite um numero: ");
        num1 = teclado.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = teclado.nextInt();

        System.out.println("Digite um ultimo numero: ");
        num3 = teclado.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Numeros iguais não são permitidos!");
        } else {

                if (num1 > num2 && num1 > num3) {
                    maior = num1;
                if (num2 > num3) {
                    meio = num2;
                    menor = num3;
                } else {
                    meio = num3;
                    menor = num2;
                }
                } else if (num2 > num1 && num2 > num3) {
                    maior = num2;
                if (num1 > num3) {
                    meio = num1;
                    menor = num3;
                    } else {
                    meio = num3;
                    menor = num1;
                    }
                }   else {
                    maior = num3;
                if (num1 > num2) {
                    meio = num1;
                    menor = num2;
                    }  else {
                    meio = num2;
                    menor = num1;
                }
            }

    
         System.out.println("Seus numero: " + menor + ", " + meio + " e " + maior);
       
        } 
        teclado.close();
    }
}
