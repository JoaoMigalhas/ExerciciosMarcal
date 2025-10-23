package Lista5.pt2;

import java.util.Scanner;

public class Lista5ex2pt2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Alunos2 aluno = new Alunos2();

        System.out.println("=== Cadastro de Aluno ===");

        System.out.print("Informe o RA: ");
        aluno.setRa(entrada.nextLine());

        System.out.print("Informe o Nome (mínimo 10 caracteres): ");
        aluno.setNome(entrada.nextLine());

        System.out.print("Informe o valor da mensalidade: ");
        aluno.setMensalidade(entrada.nextDouble());

        entrada.nextLine(); // limpar buffer

        System.out.println("Informe a situação do aluno:");
        System.out.println("1 - Ativo");
        System.out.println("2 - Desativado");
        System.out.println("3 - Pendente");
        System.out.print("Opção: ");
        int opc = entrada.nextInt();

        switch (opc) {
            case 1:
                aluno.setSituacao(EControleAtivacao2.caAtivo);
                break;
            case 2:
                aluno.setSituacao(EControleAtivacao2.caDesativado);
                break;
            case 3:
                aluno.setSituacao(EControleAtivacao2.caPendente);
                break;
            default:
                System.out.println("Opção inválida! Situação definida como Pendente.");
                aluno.setSituacao(EControleAtivacao2.caPendente);
        }

        // Imprimir Relatórios
        aluno.ImprimirRelatorio(EControleRelatorio2.crSintetico);
        aluno.ImprimirRelatorio(EControleRelatorio2.crAtivo);

        entrada.close();
    }
}
