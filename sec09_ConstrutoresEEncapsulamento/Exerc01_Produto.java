package sec09_ConstrutoresEEncapsulamento;

import java.util.Scanner;
import entidades.Produto;

public class Exerc01_Produto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os dados do produto: ");
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Preço: ");
		double preco = entrada.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		int qtd = entrada.nextInt();
		
		Produto produto = new Produto(nome, preco, qtd);
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o número de produtos que deseja adicionar: ");
		qtd = entrada.nextInt();
		produto.AdicionarProduto(qtd);
		System.out.println("Dados atualizados: ");
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o número de produtos que deseja remover: ");
		qtd = entrada.nextInt();
		produto.RemoverProduto(qtd);
		System.out.println("Dados atualizados: ");
		System.out.println(produto.toString());
		
		entrada.close();
	}
}
