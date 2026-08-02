package Aulas;
import java.util.Scanner;
import entities.Vetores;

public class classVet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetores[] vet = new Vetores[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			
			vet[i] = new Vetores(nome, preco);
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += vet[i].getPreco();
		}
		
		double avg = soma / n;
		System.out.printf("A media de preco eh: %.2f", avg);
		
		sc.close();

	}

}
