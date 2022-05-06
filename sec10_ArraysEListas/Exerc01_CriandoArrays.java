package sec10_ArraysEListas;

import java.util.Scanner;

public class Exerc01_CriandoArrays {
	
	public static void main(String[] args) {
		
		int n;
		double soma = 0.0;
		double media;
		double[] alturas;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o total de pessoas: ");
		n = sc.nextInt();
		
		alturas = new double[n];
		
		System.out.printf("\nInforme as %d medidas de altura: \n", n);
		
		for (int p = 0; p < n; p++) {
			alturas[p] = sc.nextDouble();
			soma = soma + alturas[p];
		}
				
		media = soma/n;
		
		System.out.printf("\nMédia: %.2f", media);
		
		sc.close();
	}
}
