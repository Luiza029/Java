package Aulas;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i, x, soma = 0;
		
		System.out.println("Digite quantos numeros serao digitados: ");
		n = sc.nextInt();
		
		for(i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
			
			soma += x;
		}
		
		System.out.println("Soma: " + soma);
	}

}
