package Lista5.pt3;

import java.util.ArrayList;

public class ProdutosBanco {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    // Adicionar produto (com validação de código duplicado)
    public void adicionarProduto(Produto p) {
        for (Produto prod : listaProdutos) {
            if (prod.getCodigoEAN() == p.getCodigoEAN()) {
                System.out.println("Erro: já existe um produto com este código EAN!");
                return;
            }
        }
        listaProdutos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Listar produtos
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for (Produto p : listaProdutos) {
                p.ImprimirFicha();
            }
        }
    }

    // Atualizar margem de lucro de todos os produtos
    public void AtualizarMargemLucroEm(double percentual) {
        for (Produto p : listaProdutos) {
            p.setMargemLucro(p.getMargemLucro() + percentual);
        }
        System.out.println("Margem de lucro atualizada em " + percentual + "% para todos os produtos.");
    }

    // Remover produto pelo código
    public void removerProduto(long codigo) {
        Produto encontrado = null;
        for (Produto p : listaProdutos) {
            if (p.getCodigoEAN() == codigo) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            listaProdutos.remove(encontrado);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}

