package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex4 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaFinal, notaExame, mediaFinalComExame;

        System.out.print("Qual foi a sua primeira nota ? ");
        nota1 = teclado.nextDouble();

        System.out.print("Qual foi a sua segunda nota ? ");
        nota2 = teclado.nextDouble();

        System.out.print("Qual foi a sua terceira nota ? ");
        nota3 = teclado.nextDouble();

        System.out.print("Qual foi a sua quarta nota ? ");
        nota4 = teclado.nextDouble();

        mediaFinal = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (mediaFinal >= 7) {
            System.out.print("Aluno aprovado com " + mediaFinal + " de media.");
        } else if (mediaFinal >= 5 && mediaFinal < 7) {
            System.out.print("Aluno em exame. Por favor, digite a nota do exame: ");
            notaExame = teclado.nextDouble();

            mediaFinalComExame = (mediaFinal + notaExame) / 2;

            if (mediaFinalComExame >= 5) {
                System.out.print("Aluno aprovado no exame com " + mediaFinalComExame + " de media final.");
            } else {
                System.out.print("Aluno reprovado no exame com " + mediaFinalComExame + " de media final.");
            }
        } else {
            System.out.print("Aluno reprovado com " + mediaFinal + " de media.");
        }
    }
}
