package sec06_EstruturasRepetitivas;

import java.util.Scanner;

public class Debugando {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a largura em m�: ");
		double largura = entrada.nextDouble();
		System.out.print("Informe o comprimento em m�: ");
		double comprimento = entrada.nextDouble();
		System.out.print("Informe o pre�o do m�: ");
		double precoMetroQuadrado = entrada.nextDouble();
		
		double area = largura*comprimento;
		double precoTotal = precoMetroQuadrado*area;
		
		System.out.printf("\n�REA: %.2f m�", area);
		System.out.printf("\nPRE�O TOTAL: R$ %.2f.", precoTotal);
		
		entrada.close();
		
	}
}
