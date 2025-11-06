package Lista1;
import java.util.Scanner;

public class Lista1ex3
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, pi, area = 0.00;

        System.out.println("Quanto de raio tem a sua circunferencia? ");
        raio = teclado.nextDouble();

        pi = 3.14;

        area = (pi * Math.pow(raio, 2));

        System.out.println("A area da sua circunferencia é igual a " + area);
        teclado.close();
        
    }
}