package Lista3.pt2;

public class Lista3pt2ex1 {
    public static void main(String[] args) {
	int primeiro =1, segundo = 1;
	
	System.out.println("A série de fibonaccia até o 15 termo:");
        System.out.print(primeiro + " " + segundo);

        for (int i = 3; i <= 15; i++) {
            int proximo = primeiro + segundo;
            System.out.print(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
