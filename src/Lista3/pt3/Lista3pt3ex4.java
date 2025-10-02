package Lista3.pt3;
import java.util.Scanner;

public class Lista3pt3ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero da primeira contagem");
        int p1 = teclado.nextInt();
        System.out.println("Digite o numero da segunda contagem");
        int p2 = teclado.nextInt();
        System.out.println("Digite o numero da terceira contagem");
        int p3 = teclado.nextInt();

        System.out.println("Sistema de contagem do valor " + p1);
        for (int i = p1; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Sistema de contagem do valor " + p2);
        for (int i = p2; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Sistema de contagem do valor " + p3);
        for (int i = p3; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
