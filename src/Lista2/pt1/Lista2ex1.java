package Lista2.pt1;
import java.util.Scanner;

public class Lista2ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, diferenca;

        System.out.print("Qual o numero que voce deseja? ");
        num1 = teclado.nextInt();

        System.out.print("Qual o seu segundo numero? ");
        num2 = teclado.nextInt();

        diferenca = Math.abs(num1 - num2); // valor absoluto da diferença

        System.out.println("A diferença é igual a " + diferenca);
    }
}
