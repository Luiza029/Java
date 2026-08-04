package Exercicios;
import java.util.Scanner;
import entities.Dados_Alturas;

public class alturas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas: ");
		int n = sc.nextInt();
		
		Dados_Alturas [] vet = new Dados_Alturas[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + " Pessoa: ");
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			vet[i] = new Dados_Alturas(nome, idade, altura);
			
		}
		
		double soma = 0.0;
		int pessoasNovas = 0;
		
		for(int i=0; i<n; i++) {
			soma += vet[i].getAltura();
			
			if(vet[i].getIdade() < 16) {
				pessoasNovas++;
			}
		}
		
		double porcent = ((double) pessoasNovas / n) * 100;
		
		System.out.printf("Altura media: %.2f%n", soma / n);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcent);
		
		for(int i=0; i<n; i++) {
			if(vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();
	}
}
