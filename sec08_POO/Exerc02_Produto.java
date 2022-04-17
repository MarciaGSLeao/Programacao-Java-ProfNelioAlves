package sec08_POO;

import java.util.Scanner;
import entidades.Produto;

public class Exerc02_Produto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = entrada.nextLine();
		System.out.print("Pre�o: ");
		produto.preco = entrada.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.qtd = entrada.nextInt();
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos que deseja adicionar: ");
		int qtd = entrada.nextInt();
		produto.AdicionarProduto(qtd);
		System.out.println("Dados atualizados: ");
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o n�mero de produtos que deseja remover: ");
		qtd = entrada.nextInt();
		produto.RemoverProduto(qtd);
		System.out.println("Dados atualizados: ");
		System.out.println(produto.toString());
		
		entrada.close();
	}
}
