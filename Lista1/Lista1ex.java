package Lista1;
import java.util.Scanner;
public class Lista1ex {
    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
        double p1, p2, p3, media = 0.00;

        System.out.println("Quanto voce tirou p1?");
        p1 = teclado.nextDouble();

        System.out.println("Quanto voce tirou na p2?");
        p2 = teclado.nextDouble();

        System.out.println("Quanto voce tirou na p3?");
        p3 = teclado.nextDouble();

        media = ((p1 + p2 + p3) / 3);

        System.out.println("Sua media foi igual a " + media);
teclado.close();
    }
}
