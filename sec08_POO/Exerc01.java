package sec08_POO;

import java.util.Scanner;

public class Exerc01 {
	
	public static void main(String[] args) {
		
		// Exempo de aplica��o do conceito de Programa��o Estruturada
		// Ler as medidas do lado de dois tri�ngulo distintos
		// em seguida mostrar o valor da �rea de cada um
		// e qual tri�ngulo possui maior �rea.
		// Usar a f�rmula de Heron.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as medidas dos lados do primeiro tri�ngulo: ");
		double xA = entrada.nextDouble();
		double xB = entrada.nextDouble();
		double xC = entrada.nextDouble();
		
		System.out.println("Informe as medidas dos lados do segundo tri�ngulo: ");
		double yA = entrada.nextDouble();
		double yB = entrada.nextDouble();
		double yC = entrada.nextDouble();
		
		double xP = (xA + xB + xC) / 2;
		double yP = (yA + yB + yC) / 2;
		double xArea = Math.sqrt(xP*(xP-xA)*(xP-xB)*(xP-xC));
		double yArea = Math.sqrt(yP*(yP-yA)*(yP-yB)*(yP-yC));

		System.out.printf("�rea do Primeiro Tri�ngulo: %.2f%n", xArea);
		System.out.printf("�rea do Segundo Tri�ngulo: %.2f%n", yArea);
		
		if (xArea > yArea) {
			System.out.printf("O Primeiro Tri�ngulo � maior: %.2f%n", xArea);
		}else {
			System.out.printf("O Segundo Tri�ngulo � maior: %.2f%n", yArea);
		}
		
		entrada.close();
		
		
	}

}
