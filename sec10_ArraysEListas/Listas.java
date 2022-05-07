package sec10_ArraysEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Márcia");
		lista.add("João");
		lista.add("Felipe");
		lista.add(1, "Lelê");
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.printf("\nA lista de nomes possui %d elementos.\n", lista.size());
		System.out.println("--------------------------------------");
		
		lista.removeIf(elemento -> elemento.charAt(0) == 'M');
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		List<String> novaLista = lista.stream().filter(elemento -> elemento.charAt(0) == 'L').collect(Collectors.toList());
		System.out.println(novaLista);
	
	
	
	}
}
