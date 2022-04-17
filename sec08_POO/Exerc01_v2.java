package sec08_POO;

import java.util.Scanner;
import entidades.Triangulo;

public class Exerc01_v2 {
	
	public static void main(String[] args) {
		
		// Exempo de aplica��o do conceito de Programa��o Orientada a Objetos.
		// Ler as medidas do lado de dois tri�ngulo distintos
		// em seguida mostrar o valor da �rea de cada um
		// e qual tri�ngulo possui maior �rea.
		// Usar a f�rmula de Heron.
		
		Scanner entrada = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as medidas dos lados do primeiro tri�ngulo: ");
		x.ladoA = entrada.nextDouble(); // chamada dos atributos...
		x.ladoB = entrada.nextDouble();
		x.ladoC = entrada.nextDouble();
		
		System.out.println("Informe as medidas dos lados do segundo tri�ngulo: ");
		y.ladoA = entrada.nextDouble();
		y.ladoB = entrada.nextDouble();
		y.ladoC = entrada.nextDouble();
		
		double xArea = x.area(); // Chamada do m�todo "area"...
		double yArea = y.area();

		System.out.printf("�rea do Primeiro Tri�ngulo: %.2f%n", xArea);
		System.out.printf("�rea do Segundo Tri�ngulo: %.2f%n", yArea);
		
		if (xArea > yArea) {
			System.out.printf("O Primeiro Tri�ngulo � o maior: %.2f%n", xArea);
		}else {
			System.out.printf("O Segundo Tri�ngulo � o maior: %.2f%n", yArea);
		}
		
		entrada.close();
		
	}

}
