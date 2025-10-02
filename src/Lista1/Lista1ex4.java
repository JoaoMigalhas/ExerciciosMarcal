package Lista1;
import java.util.Scanner;

public class Lista1ex4
{
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        double celsius, far = 0;

        System.out.print("Quantos graus celsius voce quer converter em fahrenheit? ");
        celsius = teclado.nextDouble();

        far = ((celsius * 1.8) + 32);

        System.out.print(far + " graus em fahrenheit");
    }
}