package Aulas;
import java.util.Scanner;
public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Digite quantos numeros serao digitados: ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("Numeros digitados: ");
		for(i=0; i<n; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
	}

}
