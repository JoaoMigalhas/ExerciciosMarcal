package Lista3.pt3;
import java.util.Scanner;
public class Lista3pt3ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        int opcao = 1; // começa como "sim" para entrar no laço

        while (opcao == 1 && contador < 5) {
            System.out.print("Digite o salário: ");
            double salario = teclado.nextDouble();
            soma += salario;
            contador++;

            if (contador < 5) { // só pergunta se ainda não atingiu 5 salários
                System.out.print("Deseja informar outro salário (0 = Não, 1 = Sim)? ");
                opcao = teclado.nextInt();
            }
        }

        System.out.println("A soma dos salários informados é: " + soma);


    }
}
