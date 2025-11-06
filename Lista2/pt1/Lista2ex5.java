package Lista2.pt1;

import java.util.Scanner;

public class Lista2ex5 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, nota3, media = 0;

        System.out.println("Digite a sua nota da avaliação 1");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a sua nota da avaliação 2");
        nota2 = teclado.nextDouble();

        System.out.println("Digite a sua nota de trabalho");
        nota3 = teclado.nextDouble();

        media = ((0.30 * nota1) + (0.40 * nota2) + (0.30 * nota3));

        if (media <= 4.99) {
            System.out.println("Aluno reprovado");
        } else if (media >= 5 && media < 7.49) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno aprovado com excelencia");
        }
        teclado.close();
    }
}
