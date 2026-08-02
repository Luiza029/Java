package Aulas;
import java.util.Scanner;

public class Vetores02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de pessoas: ");
		int n = sc.nextInt();
		
		double [] altura = new double [n];
		double soma = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite a altura da pessoa " + (i+1) + ": ");
			altura[i] = sc.nextDouble();
			soma += altura[i];
		}
		
		System.out.printf("Media das alturas eh: %.2f", soma / n);
		
		sc.close();
	}

}


