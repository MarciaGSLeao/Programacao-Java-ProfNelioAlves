package sec08_POO;

import java.util.Scanner;

import entidades.CurrencyConverter;

public class Exerc07_ConversaoMoeda {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a cota��o do d�lar hoje: ");
		double cotacao = entrada.nextDouble();
		
		System.out.print("Quantos d�lares deseja comprar? ");
		double totalDolar = entrada.nextDouble();
		
		System.out.printf("Total a pagar em R$: R$ %.2f", CurrencyConverter.valorLiquidoDolar(cotacao, totalDolar) );
		
		entrada.close();
	}

}
