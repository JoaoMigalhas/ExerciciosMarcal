import java.util.*;

public class Sistema {
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void inserir(Colaborador c) {
        colaboradores.add(c);
        System.out.println("Colaborador cadastrado com sucesso! Código: " + c.getCodigoInterno());
    }

    public void alterar(String codigo, double novoSalario) {
        for (Colaborador c : colaboradores) {
            if (c.getCodigoInterno().equals(codigo)) {
                c.setSalario(novoSalario);
                System.out.println("Salário atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Colaborador não encontrado!");
    }

    public void excluir(String codigo) {
        Iterator<Colaborador> it = colaboradores.iterator();
        while (it.hasNext()) {
            if (it.next().getCodigoInterno().equals(codigo)) {
                it.remove();
                System.out.println("Colaborador removido!");
                return;
            }
        }
        System.out.println("Código não encontrado!");
    }

    public void pesquisarPorCodigo(String codigo) {
        for (Colaborador c : colaboradores) {
            if (c.getCodigoInterno().equals(codigo)) {
                c.exibirDados();
                return;
            }
        }
        System.out.println("Colaborador não encontrado!");
    }

    public void pesquisarPorNome(String nomeParcial) {
        boolean encontrado = false;
        for (Colaborador c : colaboradores) {
            if (c.getNome().toLowerCase().contains(nomeParcial.toLowerCase())) {
                c.exibirDados();
                encontrado = true;
            }
        }
        if (!encontrado)
            System.out.println("Nenhum colaborador encontrado com esse nome!");
    }

    public void relatorio() {
        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
        } else {
            for (Colaborador c : colaboradores) {
                c.exibirDados();
            }
        }
    }
}
