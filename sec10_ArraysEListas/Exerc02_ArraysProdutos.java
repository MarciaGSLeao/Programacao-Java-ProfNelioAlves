package sec10_ArraysEListas;

import java.util.Scanner;

import entidades.Produto_v2;

public class Exerc02_ArraysProdutos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = sc.nextInt();
		Produto_v2[] listaProdutos = new Produto_v2[n];
		
		System.out.println("Informe abaixo o nome e o preço do produtos, respectivamente:");
		double soma = 0.0;
		
		for (int p = 0; p < n; p++ ) {
			sc.nextLine(); // Para receber o Enter
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			soma += preco;
			
			listaProdutos[p] = new Produto_v2(nome, preco);
		}
		
		double media = soma/n;
		
		System.out.printf("A média dos valores é R$ %.2f%n", media);
		//System.out.println(listaProdutos[1].getNome());
		
		sc.close();
	}
}
