package Lista3.pt3;
import java.util.Scanner;
public class Lista3pt3ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o limite de numeros");
        int p = teclado.nextInt();
        System.out.println("Digite o passo de contagem");
        int n = teclado.nextInt();

        for (int i = 0; i <= p; i+= n) {
            System.out.println(i);
        }
        teclado.close();
    }
}
