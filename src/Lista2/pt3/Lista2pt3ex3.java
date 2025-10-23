package Lista2.pt3;

import java.util.Scanner;

public class Lista2pt3ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = 0;

        System.out.println("Digite um numero ");
        idade = teclado.nextInt();

        if (idade >= 0 && idade < 10) {
            System.out.println("Ola criança");
        } else if (idade >= 11 && idade < 14) {
            System.out.println("Ola pre-adolescente");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Parabens voce ja pode ser um eleitor");
        } else if (idade >= 19 && idade < 21) {
            System.out.println("Hmmmm voce ja e um adulto");
        } else {
            System.out.println("Bem, ja esta na hora de vc seguir sua vida");
        }
        teclado.close();
    }
}
