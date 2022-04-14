package sec08_POO;

import java.util.Scanner;

public class Exerc01 {
	
	public static void main(String[] args) {
		
		// Exempo de aplicação do conceito de Programação Estruturada
		// Ler as medidas do lado de dois triângulo distintos
		// em seguida mostrar o valor da área de cada um
		// e qual triângulo possui maior área.
		// Usar a fórmula de Heron.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as medidas dos lados do primeiro triângulo: ");
		double xA = entrada.nextDouble();
		double xB = entrada.nextDouble();
		double xC = entrada.nextDouble();
		
		System.out.println("Informe as medidas dos lados do segundo triângulo: ");
		double yA = entrada.nextDouble();
		double yB = entrada.nextDouble();
		double yC = entrada.nextDouble();
		
		double xP = (xA + xB + xC) / 2;
		double yP = (yA + yB + yC) / 2;
		double xArea = Math.sqrt(xP*(xP-xA)*(xP-xB)*(xP-xC));
		double yArea = Math.sqrt(yP*(yP-yA)*(yP-yB)*(yP-yC));

		System.out.printf("Área do Primeiro Triângulo: %.2f%n", xArea);
		System.out.printf("Área do Segundo Triângulo: %.2f%n", yArea);
		
		if (xArea > yArea) {
			System.out.printf("O Primeiro Triângulo é maior: %.2f%n", xArea);
		}else {
			System.out.printf("O Segundo Triângulo é maior: %.2f%n", yArea);
		}
		
		entrada.close();
		
		
	}

}
