package Lista5.pt2;

import java.util.Scanner;

public class Lista5ex1pt2 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Produtos produto = new Produtos();

        System.out.println("=== Cadastro de Produto ===");

        System.out.print("Informe o código EAN: ");
        produto.setCodigoEAN(teclado.nextDouble());
        teclado.nextLine(); // limpa o buffer

        System.out.print("Informe a descrição: ");
        produto.setDescricao(teclado.nextLine());

        System.out.print("Informe o preço de custo: ");
        produto.setPrecoCusto(teclado.nextDouble());

        System.out.print("Informe a margem de lucro (%): ");
        produto.setMargemLucro(teclado.nextDouble());

        // Calcula o preço de venda automaticamente
        double precoVenda = produto.getPrecoCusto() + 
                (produto.getPrecoCusto() * produto.getMargemLucro() / 100);
        produto.setPrecoVenda(precoVenda);

        System.out.print("Informe o saldo em estoque: ");
        produto.setSaldoEstoque(teclado.nextDouble());

        // Exibe os dados
        produto.ImprimirFicha();

        teclado.close();
    }
}
