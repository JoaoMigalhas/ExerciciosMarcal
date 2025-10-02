package Lista4;
import java.util.Scanner;
public class Lista4ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] idades = new int[10];

        // Carregar idades
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = teclado.nextInt();
        }

        // Imprimir idades com posição
        System.out.println("\n--- Idades informadas ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posição " + i + ": " + idades[i]);
        }

    }
}
