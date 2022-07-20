package sec10_ArraysEListas;

import java.util.Scanner;

import entidades.Quarto;

public class Exerc03_Quartos {
	
	public static void main(String[] args) {
		
		Quarto[] listaQuartos = new Quarto[10];
		
		Scanner sc = new Scanner(System.in);
		
 		System.out.print("Quantos quartos ser�o locados? ");
		int qtdQuartos = sc.nextInt();
		
		sc.nextLine();
		
		for(int p = 0; p < qtdQuartos; p++) {
			
			System.out.printf("\n%d� H�spede: ", p+1);
			System.out.print("\nNome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("N� Quarto: ");
			int numero = sc.nextInt();
			sc.nextLine();
			
			listaQuartos[p] = new Quarto(nome, email, numero);
		}
		
		System.out.println("\nQUARTOS LOCADOS");
		
		for (int p = 0; p < qtdQuartos; p++) {
			if (listaQuartos[p] != null) {
				System.out.println(listaQuartos[p].toString());
			}
		}
		
		sc.close();
	}
}
