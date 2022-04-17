package sec08_POO;

import java.util.Scanner;
import entidades.Retangulo;

public class Exerc03_Retangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		

		System.out.println("Informe a altura e a largura do ret�ngulo.");
		System.out.print("Altura: ");
		retangulo.altura = entrada.nextDouble();
		System.out.print("Largura: ");
		retangulo.largura = entrada.nextDouble();
		
		System.out.println();
		System.out.println("�REA: " + retangulo.Area());
		System.out.println("PER�METRO: " + retangulo.Perimetro());
		System.out.println("DIAGONAL: " + String.format("%.2f", retangulo.Diagonal()));
		
		entrada.close();
	}
}
