package Aulas;
import java.util.Scanner;

import entities.Calculator;
public class Estatico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circuferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.println("Circuferencia: " + c);
		System.out.println("Volume: " + v);
		System.out.println("Pi: " +Calculator.PI);
		sc.close();
	}

}
