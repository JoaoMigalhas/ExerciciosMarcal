package Lista1;
import java.util.Scanner;

public class Lista1ex8
{
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        double notafinal, notap1, notap2, atv, ead, av1, av2, pluri = 0;

        System.out.print("Quanto voce tirou nas atividades? ");
        atv = teclado.nextDouble();

        System.out.print("Quanto voce tirou na disciplina EAD? ");
        ead = teclado.nextDouble();

        System.out.print("Qual foi a sua nota da p1? ");
        av1 = teclado.nextDouble();

        System.out.print("Qual foi a sua nota da p2? ");
        av2 = teclado.nextDouble();

        System.out.print("Quanto voce tirou na PLURI? ");
        pluri = teclado.nextDouble();

        notap1 = ((atv * 0.20) + (ead * 0.20) + (av1 * 0.60));
        notap2 = ((atv * 0.20) + (ead * 0.20) + (pluri * 0.20) + (av2 * 0.40));

        notafinal = ((notap1 * 0.40) + (notap2 * 0.60));

        System.out.println("Sua N1 é igual a " + notap1);
        System.out.println("Sua N2 é igual a " + notap2);
        System.out.println("Sua media final portanto é igual a " + notafinal);
    }
}