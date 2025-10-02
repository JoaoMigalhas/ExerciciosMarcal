package Lista3.pt2;

public class Lista3pt2ex2 {
    public static void main(String[] args) {

	System.out.println("Aqui esta os graus celsius e em fahrenheit:");

        for (int i = 10; i <= 100; i += 10) {
			double fahrenheit = ((i * 1.8) + 32);
			System.out.println("Em Celsius: " + i);
			System.out.println("Em Fahrenheit: " + fahrenheit);
        }
    }
}
