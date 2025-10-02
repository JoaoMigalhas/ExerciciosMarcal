package Lista3.pt2;

public class Lista3pt2ex7 {
    public static void main(String[] args) {
        long soma = 0; 
        int contadorImpares = 0;

        for (int i = 1; i <= 20; i += 2) { 
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }

            soma += fatorial;
            contadorImpares++;
        }

        System.out.println("Número de valores ímpares entre 1 e 20: " + contadorImpares);
        System.out.println("Soma dos fatoriais dos valores ímpares: " + soma);
    }
}
