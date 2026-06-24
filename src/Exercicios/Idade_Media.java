package Exercicios;
import java.util.Scanner;
public class Idade_Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, n = 2, soma = 0;
		double media;
		String [] nome = new String[n];
		int [] idade = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.println("Digite um nome: ");
			nome[i] = sc.nextLine();
			
			System.out.println("Digite a idade: ");
			idade[i] = sc.nextInt();
			
			sc.nextLine();
			
			soma += idade[i];
		}
		
		media = (double) soma / n;
		
		System.out.println("A idade media eh de: " + String.format("%.1f", media));

	}

}
