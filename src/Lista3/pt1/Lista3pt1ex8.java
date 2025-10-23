package Lista3.pt1;

import java.util.Scanner;

public class Lista3pt1ex8 {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	int base = teclado.nextInt();
	int expoente = teclado.nextInt();

	double resultado = 1;

	if (expoente == 0){
		resultado = 1;
	} else {
		for ( int i =0; i < expoente; i++){
			resultado *= base;
		}
	}
	
	System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

	teclado.close();
	}
}
