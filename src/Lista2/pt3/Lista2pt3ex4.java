package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc = 0;

        System.out.println("Digite o seu peso ");
        peso = teclado.nextDouble();

        System.out.println("Digite a sua altura ");
        altura = teclado.nextDouble();

        imc = peso / (Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 39.9) {
            System.out.println("Obesidade com grau 2");
        } else {
            System.out.println("Obesidade grave com grau de obesidade igual a 3");
        }
    }
}
