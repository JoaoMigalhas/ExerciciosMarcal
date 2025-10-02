package Lista1;
import java.util.Scanner;

public class Lista1ex6
{
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        double prestacao, valortotal, taxa, tempo = 0;

        System.out.print("Qual é o valor do seu produto? ");
        valortotal = teclado.nextDouble();

        System.out.print("Qual a taxa das prestações? ");
        taxa = teclado.nextDouble();

        System.out.print("Quantas tempo de atraso? ");
        tempo = teclado.nextDouble();

        prestacao = (valortotal * (taxa / 100) * tempo);

        System.out.print("Voce ira pagar " + prestacao + " reais de prestacao");
    }
}