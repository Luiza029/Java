package Exercicios;
import java.util.Scanner;
public class Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, peri, diag;
		
		System.out.println("Digite a Base do retangulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		peri = 2 * (base + altura);
		diag = (base * base) + (altura* altura);
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + peri);
		System.out.println("Diagonal: " + String.format("%.4f",Math.sqrt(diag)));
		
		sc.close();
	}

}
