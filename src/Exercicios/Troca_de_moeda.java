package Exercicios;
import java.util.Scanner;

import entities.Converter;

public class Troca_de_moeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do dolar: ");
		double valorDolar = sc.nextDouble();
		
		System.out.println("Quantos dolares: ");
		double dolarTotal = sc.nextDouble();
		
		double dolar = Converter.converter(valorDolar, dolarTotal);
		
		System.out.println(dolar);
		
		sc.close();
	}

}
