package Lista3.pt2;

public class Lista3pt2ex3 {
    public static void main(String[] args) {
        int casas = 64;
        double graos = 1;
        double soma = 1;  

        for (int i = 2; i <= casas; i++) {
            graos *= 2;     
            soma += graos;  
        }

        System.out.println("Total aproximado de grãos de trigo no tabuleiro:");
        System.out.printf("%.0f%n", soma);
    }
}
