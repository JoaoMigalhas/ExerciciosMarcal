package Lista1;
import java.util.Scanner;

public class Lista1ex5
{
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        double raio, altura, volume = 0;

        System.out.print("Qual o raio da sua lata? ");
        raio = teclado.nextDouble();

        System.out.print("Qual a altura da lata? ");
        altura = teclado.nextDouble();

        volume = (3.14149 * Math.pow(raio, 2) * altura);

        System.out.print("O volume da sua lata é igual a " + volume);
    }
}