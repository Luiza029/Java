package Aulas;

import java.util.ArrayList;
import java.util.List;

public class lista {

	public static void main(String[] args) {
		List<String> list = new  ArrayList<>();
		
		list.add("Luiza");
		list.add("Amanda");
		list.add("Marcia");
		list.add("Carlos");
		
		// inserir um elemento na posicao 2
		list.add(2, "Banana");
		
		// Remover um elemento
		list.remove(1);
		
		// Remover todos que tenham tal condicao
		list.removeIf(x -> x.charAt(0) == 'M');
		
		// Tamanho de uma lista
		System.out.println(list.size());
		
		// Encontrar um elemento
		System.out.println("Index of Banana: " + list.indexOf("Banana"));
		System.out.println("Index of Abacaxi: " + list.indexOf("Abacaxi"));
		
		for(String x : list) {
			System.out.println(x);
		}
	}

}
