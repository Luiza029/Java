package Exercicios;
import java.util.Scanner;

import entities.Rectangle;
public class retangulo_POO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle r1;
		r1 = new Rectangle();
				
		System.out.println("Digite a Largura e a Altura: ");
		r1.largura = sc.nextDouble();
		r1.altura = sc.nextDouble();
		
		System.out.println(r1);
		
		sc.close();
	}

}
