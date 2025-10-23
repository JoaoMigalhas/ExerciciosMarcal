package Lista3.pt3;
import java.util.Scanner;

public class Lista3pt3ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o valor de a: ");
        int a = teclado.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = teclado.nextInt();

        // Produto dos intervalos
        int prodA = 1, prodB = 1, prodC = 1;

        for (int i = 1; i <= a; i++) prodA *= i;
        for (int i = 1; i <= b; i++) prodB *= i;
        for (int i = 1; i <= c; i++) prodC *= i;

        // Mostrar resultados individuais
        System.out.println("Produto do intervalo até " + a + " = " + prodA);
        System.out.println("Produto do intervalo até " + b + " = " + prodB);
        System.out.println("Produto do intervalo até " + c + " = " + prodC);

        // Menor produto
        int menor = prodA;
        if (prodB < menor) menor = prodB;
        if (prodC < menor) menor = prodC;

        // Maior produto
        int maior = prodA;
        if (prodB > maior) maior = prodB;
        if (prodC > maior) maior = prodC;

        System.out.println("Menor produto = " + menor);
        System.out.println("Maior produto = " + maior);

        // Ordenação sem array (usando ifs)
        System.out.println("Valores ordenados do menor para o maior:");
        if (prodA <= prodB && prodA <= prodC) {
            System.out.print(prodA + " ");
            if (prodB <= prodC) {
                System.out.print(prodB + " " + prodC);
            } else {
                System.out.print(prodC + " " + prodB);
            }
        } else if (prodB <= prodA && prodB <= prodC) {
            System.out.print(prodB + " ");
            if (prodA <= prodC) {
                System.out.print(prodA + " " + prodC);
            } else {
                System.out.print(prodC + " " + prodA);
            }
        } else {
            System.out.print(prodC + " ");
            if (prodA <= prodB) {
                System.out.print(prodA + " " + prodB);
            } else {
                System.out.print(prodB + " " + prodA);
            }
        }
        teclado.close();
}
}
