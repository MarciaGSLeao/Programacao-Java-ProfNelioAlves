package sec08_POO;

import java.util.Scanner;
import entidades.Aluno;

public class Exerc05_MediaAluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe a nota do 1� trimestre: ");
		aluno.n1 = entrada.nextDouble();
		System.out.println("Informe a nota do 2� trimestre: ");
		aluno.n2 = entrada.nextDouble();
		System.out.println("Informe a nota do 3� trimestre: ");
		aluno.n3 = entrada.nextDouble();
		
		if (aluno.TotalDePontos() >= 60) {
			System.out.printf("\nPontua��o Final: %.2f", aluno.TotalDePontos());
			System.out.println("\nAprovado!");
		}else {
			System.out.printf("\nPontua��o Final: %.2f", aluno.TotalDePontos());
			System.out.println("\nReprovado!");
			System.out.printf("\nFaltam %.2f para a pontua��o m�nima.", aluno.PontosFaltantes());
		}
		
		entrada.close();
	}
}
