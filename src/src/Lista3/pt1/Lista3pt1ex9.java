package Lista3.pt1;

import java.util.Scanner;

public class Lista3pt1ex9 {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	int num = teclado.nextInt();
	long fatorial = 1;
	
	if (num < 0) {
		System.out.println("erro");
	} 
	else if (num == 0) {
		System.out.println("o fatorial é 1");
	} else {
            for (int i = 1; i <= num; i++) {
                fatorial = fatorial * i;
		}
		System.out.println("o fatorial de " + num + " é " + fatorial);
		
	}
	teclado.close();
	}
}
