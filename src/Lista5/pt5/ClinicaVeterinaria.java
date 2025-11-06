import java.util.*;

public class ClinicaVeterinaria {
    private List<Animal> animais = new ArrayList<>();
    private int contadorCodigo = 1;

    public void cadastrarMamifero(Scanner sc) {
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Peso: "); double peso = sc.nextDouble();
        System.out.print("Idade: "); int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo: "); String sexo = sc.nextLine();
        System.out.print("Data entrada: "); String data = sc.nextLine();
        System.out.print("Motivo atendimento: "); String motivo = sc.nextLine();
        System.out.print("Nome responsável: "); String resp = sc.nextLine();
        System.out.print("CPF responsável: "); String cpf = sc.nextLine();
        System.out.print("Telefone: "); String tel = sc.nextLine();
        System.out.print("Tipo (gato, cachorro...): "); String tipo = sc.nextLine();
        System.out.print("Cor: "); String cor = sc.nextLine();
        System.out.print("Alimentação (Carnívoro, Herbívoro): "); String alim = sc.nextLine();

        animais.add(new Mamifero(contadorCodigo++, nome, peso, idade, sexo, data, motivo, resp, cpf, tel, tipo, cor, alim));
        System.out.println("Mamífero cadastrado com sucesso!");
    }

    public void cadastrarReptil(Scanner sc) {
        System.out.print("Nome: "); String nome = sc.nextLine();
        System.out.print("Peso: "); double peso = sc.nextDouble();
        System.out.print("Idade: "); int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Sexo: "); String sexo = sc.nextLine();
        System.out.print("Data entrada: "); String data = sc.nextLine();
        System.out.print("Motivo atendimento: "); String motivo = sc.nextLine();
        System.out.print("Nome responsável: "); String resp = sc.nextLine();
        System.out.print("CPF responsável: "); String cpf = sc.nextLine();
        System.out.print("Telefone: "); String tel = sc.nextLine();
        System.out.print("Classificação: "); String classif = sc.nextLine();
        System.out.print("Tipo reprodução: "); String repro = sc.nextLine();
        System.out.print("Habitat: "); String habitat = sc.nextLine();

        animais.add(new Reptil(contadorCodigo++, nome, peso, idade, sexo, data, motivo, resp, cpf, tel, classif, repro, habitat));
        System.out.println("Réptil cadastrado com sucesso!");
    }

    public void pesquisar(int codigo) {
        for (Animal a : animais) {
            if (a.getCodigo() == codigo) {
                a.exibirDados();
                return;
            }
        }
        System.out.println("Animal não encontrado!");
    }

    public void excluir(int codigo) {
        Iterator<Animal> it = animais.iterator();
        while (it.hasNext()) {
            if (it.next().getCodigo() == codigo) {
                it.remove();
                System.out.println("Animal removido com sucesso!");
                return;
            }
        }
        System.out.println("Código não encontrado!");
    }

    public void listar() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal a : animais) {
                a.exibirDados();
            }
        }
    }
}
