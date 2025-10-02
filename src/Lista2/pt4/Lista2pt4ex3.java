


package Lista2.pt4;

import java.util.Scanner;

public class Lista2pt4ex3 {
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);

	//aluno1

	System.out.println("Digite o nome do aluno: ");
	String nome1 = teclado.nextLine();

	System.out.println("Digite o ra do aluno: ");
	double ra1 = teclado.nextDouble();
	teclado.nextLine();

	System.out.println("Digite as notas do aluno: ");
	System.out.print("Digite a nota 1: ");
	double nota1aluno1 = teclado.nextDouble();

	System.out.print("Digite a nota 2: ");
	double nota2aluno1 = teclado.nextDouble();

	System.out.print("Digite a nota pluri: ");
	double notapluri1 = teclado.nextDouble();
	teclado.nextLine();

	//aluno2

	System.out.println("Digite o nome do segundo aluno: ");
	String nome2 = teclado.nextLine();

	System.out.println("Digite o ra do segundo aluno: ");
	double ra2 = teclado.nextDouble();
	teclado.nextLine();

	System.out.println("Digite as notas do aluno: ");
	System.out.print("Digite a nota 1: ");
	double nota1aluno2 = teclado.nextDouble();

	System.out.print("Digite a nota 2: ");
	double nota2aluno2 = teclado.nextDouble();

	System.out.print("Digite a nota pluri: ");
	double notapluri2 = teclado.nextDouble();
	teclado.nextLine();


	//aluno3

	System.out.println("Digite o nome do terceiro aluno: ");
	String nome3 = teclado.nextLine();

	System.out.println("Digite o ra do terceiro aluno: ");
	double ra3 = teclado.nextDouble();


	System.out.println("Digite as notas do aluno: ");
	System.out.print("Digite a nota 1: ");
	double nota1aluno3 = teclado.nextDouble();

	System.out.print("Digite a nota 2: ");
	double nota2aluno3 = teclado.nextDouble();

	System.out.print("Digite a nota pluri: ");
	double notapluri3 = teclado.nextDouble();



	//calcular a media

	double mediaaluno1 = ((nota1aluno1 * 0.30) + (nota2aluno1 * 0.40) + (notapluri1 * 0.30));
	double mediaaluno2 = ((nota1aluno2 * 0.30) + (nota2aluno2 * 0.40) + (notapluri2 * 0.30));
	double mediaaluno3 = ((nota1aluno3 * 0.30) + (nota2aluno3 * 0.40) + (notapluri3 * 0.30));

	//calcular a media geral
	double mediageral = ((mediaaluno1 + mediaaluno2 + mediaaluno3) / 3);

	//mostrar os resultados

	System.out.println("A media do " + nome1 + ", RA: " + ra1 + ", é " + mediaaluno1);
	System.out.println("A media do " + nome2 + ", RA: " + ra2 + ", é " + mediaaluno2);
	System.out.println("A media do " + nome3 + ", RA: " + ra3 + ", é " + mediaaluno3);


	System.out.println("A media geral das notas dos alunos foi: " + mediageral);


	if (mediaaluno1 >=7 ){
		System.out.println(ra1 + " APROVADO");
	} else {
		System.out.println(ra1 + " REPROVADO");
	}


	if (mediaaluno2 >=7 ){
		System.out.println(ra2 + " APROVADO");
	} else {
		System.out.println(ra2 + " REPROVADO");
	}


	if (mediaaluno3 >=7 ){
		System.out.println(ra3 + " APROVADO");
	} else {
		System.out.println(ra3 + " REPROVADO");
	}


	if (mediaaluno1 >= 7 && mediaaluno2 >= 7 && mediaaluno3 >=7 ){
		System.out.println("Todos aprovados!!");
	} else if (mediaaluno1 >= 7 && mediaaluno2 >= 7 && mediaaluno3 < 7){
		System.out.println(nome1 + " e " + nome2 + " Aprovados e " + nome3 + " reprovado");
	} else if (mediaaluno1 >= 7 && mediaaluno2 <7 && mediaaluno3 <7){
		System.out.println(nome1 + " Aprovado " + nome2 + " e " + nome3 + " reprovados");
	} else if (mediaaluno1 >= 7 && mediaaluno2 <  7 && mediaaluno3 >=7){
		System.out.println(nome1 + " e " + nome3 + " Aprovados " + " e " + nome2 + " reprovado");
	} else if (mediaaluno1 < 7 && mediaaluno2 >= 7 && mediaaluno3 >= 7){
		System.out.println(nome2 + " e " + nome3 + " Aprovados " + " e " + nome1 + " reprovado");
	} else {
		System.out.println("TODOS REPROVADOS");
	}


	double d = ra1;
	double e = ra2;
	double f = ra3;

	if (d > e) { double temp = d; d = e; e = temp; }
	if (d > f) { double temp = d; d = f; f = temp; }
	if (e > f) { double temp = e; e = f; f = temp; }

	double a = mediaaluno1;
	double b = mediaaluno2;
	double c = mediaaluno3;

	if (a > b) { double temp = a; a = b; b = temp; }
	if (a > c) { double temp = a; a = c; c = temp; }
	if (b > c) { double temp = b; b = c; c = temp; }


	System.out.println("Ordem crescente das Medias: " + a + ", " + ", " + b + " e " + c );
	System.out.println("Ordem crescente do RA: " + d + ", " + ", " + e + " e " + f );
	}
}