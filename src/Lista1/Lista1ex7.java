package Lista1;
import java.util.Scanner;

public class Lista1ex7
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dolar, real, euro, taxadolar, taxaeur = 0;

        System.out.print("Quantas reais voce quer converter? ");
        real = teclado.nextDouble();

        System.out.print("Qual a cotação do dolar atual? ");
        taxadolar = teclado.nextDouble();

        System.out.print("Qual a cotação do euro atual? ");
        taxaeur = teclado.nextDouble();

        dolar = (real * taxadolar);
        euro = (real * taxaeur);

        System.out.print("Voce tem " + real + " reais que convertido em dolar é igual a " 
            + dolar + " dolares que convertido em euro é igual a " + euro + " euros");
    }
}