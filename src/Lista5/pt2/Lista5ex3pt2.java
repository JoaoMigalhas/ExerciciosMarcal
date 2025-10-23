package Lista5.pt2;

import java.util.Scanner;

public class Lista5ex3pt2 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cadastro de Cliente ===");
        System.out.println("Informe o sexo do cliente:");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        System.out.print("Opção: ");
        int opc = entrada.nextInt();
        entrada.nextLine(); // limpar buffer

        EnumSexo3 sexo;
        if (opc == 1) {
            sexo = EnumSexo3.Masc;
        } else {
            sexo = EnumSexo3.Fem;
        }

        // Cria o cliente já com o sexo definido
        Cliente3 cliente = new Cliente3(sexo);

        System.out.print("Informe o código: ");
        cliente.setCodigo(entrada.nextInt());
        entrada.nextLine(); // limpar buffer

        System.out.print("Informe o nome: ");
        cliente.setNome(entrada.nextLine());

        System.out.print("Informe a idade (maior ou igual a 21): ");
        cliente.setIdade(entrada.nextInt());

        // Exibe os dados do cliente
        cliente.ImprimirFicha();

        entrada.close();
    }
}
