package PrimerioObjetoProfessor;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class menu {
    public void exebirMenu(){
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        List<Professor> ListaProfessores = new ArrayList<Professor>();

        do{
            System.out.println("");
            System.out.println(" CRUD PROFESSORES ");
            System.out.println(" 1 - Adicionar - C");
            System.out.println(" 2 - Remover (codigo) - R");
            System.out.println(" 3 - Pequisar (codigo) - U");
            System.out.println(" 4 - Atualizar (codigo) - D");
            System.out.println(" 5 - Imprimir");
            System.out.println(" 9 - Sair");
            System.out.println("Digite a sua opção:");
            opcao = teclado.nextInt();

                if (opcao == 1){
                        Professor professor = new Professor();

                        System.out.println("Digite o RA do professor: ");
                        professor.setCodigo(teclado.nextInt());
                        teclado.nextLine();
                    
                        System.out.println("Digite o nome do professor: ");
                        professor.setNome(teclado.nextLine());
                
                        System.out.println("Digite o salario do professor: ");
                        professor.setSalario(teclado.nextDouble());
                        teclado.nextLine();
                    
                        System.out.println("Digite o email do professor: ");
                        professor.setEmail(teclado.nextLine());

                        ListaProfessores.add(professor);
                        System.out.print("Professor cadastrado!!");

                } else if (opcao == 2){
                        Professor localizado = null;

                        System.out.println("Qual o codigo do professor que voce deseja remover?? ");
                        int codigo = teclado.nextInt();
                    
                        for (Professor professor : ListaProfessores) {
                        if(professor.getCodigo() == codigo){
                            localizado = professor;
                            break;
                            }
                        }

                        if (localizado == null){
                            System.out.println("Professor não esta cadastrado!!");
                        } else {
                            ListaProfessores.remove(localizado);
                            System.out.println("Professor removido com sucesso!!");
                        }
                } else if (opcao == 3){
                        Professor localizado = null;

                        System.out.println("Qual o codigo voce deseja pesquisar?? ");
                        int codigo = teclado.nextInt();
                    
                        for (Professor professor : ListaProfessores) {
                        if(professor.getCodigo() == codigo){
                            localizado = professor;
                            break;
                            }
                        }

                     if (localizado == null){
                            System.out.println("Professor não esta cadastrado!!");
                      } else {
                            System.out.println("Professor encontrado! ");
                            System.out.println("Codigo: " + localizado.getCodigo());
                            System.out.println("Nome: " + localizado.getNome());
                            System.out.println("Email: " + localizado.getEmail());
                            System.out.println("Salario: " + localizado.getSalario());
                        }

                } else if (opcao == 4){

                } else if (opcao == 5){
                    System.out.println("Imprimindo professores...");

                    for (Professor professor : ListaProfessores) {
                        System.out.println("Codigo: " + professor.getCodigo());
                        System.out.println("Nome: " + professor.getNome());
                        System.out.println("Email: " + professor.getEmail());
                        System.out.println("Salario: " + professor.getSalario());
                    }
                } else {

                }

        } while (opcao != 9);
    }
}
