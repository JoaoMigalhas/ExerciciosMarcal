package Lista5.pt2;

import java.util.Scanner;

public class Lista5ex4pt2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carros4 carro = new Carros4();

        System.out.println("=== Cadastro de Carro ===");

        System.out.print("Informe a placa do carro: ");
        carro.setPlaca(entrada.nextLine());

        System.out.print("Informe a capacidade do tanque (em litros): ");
        carro.setCapacidadeTanque(entrada.nextDouble());
        entrada.nextLine(); // limpar buffer

        System.out.print("Informe a marca do carro: ");
        carro.setMarca(entrada.nextLine());

        System.out.print("Informe o modelo do carro: ");
        carro.setModelo(entrada.nextLine());

        System.out.print("Informe o número de portas: ");
        carro.setNumeroPortas(entrada.nextInt());

        carro.ImprimirFicha();

        entrada.close();
    }
}
