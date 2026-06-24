package Exercicios;
import java.util.Scanner;
public class Menor_de_Tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		
		System.out.println("Digite o n1: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o n2: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o n3: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			maior = n1;
		}
		
		else if(n2 > n1 && n2 > n3) {
			maior = n2;
		}
		
		else{
			maior = n3;
		}
		
		System.out.println("MAIOR: " + maior);

	}

}
