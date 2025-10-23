package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex3 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Qual foi a sua primeira nota ? ");
        nota1 = teclado.nextDouble();

        System.out.print("Qual foi a sua segunda nota ? ");
        nota2 = teclado.nextDouble();

        System.out.print("Qual foi a sua terceira nota ? ");
        nota3 = teclado.nextDouble();

        System.out.print("Qual foi a sua quarta nota ? ");
        nota4 = teclado.nextDouble();

        media = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (media >= 5) {
            System.out.print("Aluno aprovado com " + media + " de média");
        } else {
            System.out.print("Aluno reprovado com " + media + " de média");
        }
        teclado.close();
    }
}
