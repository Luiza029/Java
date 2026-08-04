package Exercicios;

import java.util.Scanner;

import entities.Pensionato_Class;

public class pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas vao alugar o quarto? ");
		int n = sc.nextInt();
		
		Pensionato_Class[] vet = new Pensionato_Class[10];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1) + " :");
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			
			vet[quarto] = new Pensionato_Class(nome, email);
		}
		
		for(int i=1; i<=9; i++) {
			if(vet[i] != null) {
				System.out.println(i+ " :" +vet[i]);
			}
		}
		
		sc.close();
	}

}
