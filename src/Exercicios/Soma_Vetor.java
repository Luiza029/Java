package Exercicios;
import java.util.Scanner;
public class Soma_Vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i, soma = 0;
		
		System.out.println("Quantos Numeros vc vai digitar: ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
			soma += vet[i];
		}
		
		System.out.print("Valores: ");
		for(i=0; i<n; i++) {
			System.out.print(vet[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + soma/n);
		
		sc.close();
	}

}
