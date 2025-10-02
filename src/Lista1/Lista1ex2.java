package Lista1;
import java.util.Scanner;

public class Lista1ex2
{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double aulas, salariobruto, desconto, ir, inss, salarioliquido, beneficio, salariomensal = 0.00;

        System.out.println("Quantas aulas voce da por semana?");
        aulas = teclado.nextDouble();

        salariobruto = (25 * aulas * 4);
        beneficio = (salariobruto * 0.10);
        salariomensal = (salariobruto + beneficio);

        ir = (salariomensal * 0.05);
        inss = (salariomensal * 0.07);
        desconto = (ir + inss);

        salarioliquido = (salariomensal - desconto);

        System.out.println("Seu salario bruto é " + salariomensal);
        System.out.println("Seu desconto salarial é " + desconto);
        System.out.println("Seu salario salario líquido é " + salarioliquido);
    }
}