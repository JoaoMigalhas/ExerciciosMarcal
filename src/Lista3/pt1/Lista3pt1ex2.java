package Lista3.pt1;

import java.util.Scanner;

public class Lista3pt1ex2 {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	System.out.println("Digite um numero para saber a sua tabuada: ");
	int num = teclado.nextInt();

	for ( int i = 1; i <= 10; i++){
		int resultado = num * i;
		System.out.println("A tabuada do " + num + " é " + resultado);
	}
	}
}
