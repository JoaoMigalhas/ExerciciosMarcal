package Lista3.pt3;
import java.util.Scanner;

public class Lista3pt3ex1 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String respostas;

    do{
        System.out.println("Digite o nome que voce quer repetir: ");
        String nome = teclado.nextLine();
        System.out.println("Digite quantas vezes voce quer repetir esse nome: ");
        int k = teclado.nextInt();
        teclado.nextLine();

            int contador = 1;

        while (contador <= k){
            System.out.println(contador + " - " + nome);
            contador++;
        }

        System.out.println("Deseja continuar?");
        respostas = teclado.nextLine().toLowerCase();
        
    } while (respostas.equals("sim"));
    teclado.close();
    }
}
