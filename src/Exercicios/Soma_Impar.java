package Exercicios;
import java.util.Scanner;
public class Soma_Impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, i, soma = 0;
		
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > y) {
			int troca = x;
			x = y;
			y = troca;
		}
		
		for(i = x + 1; i<y; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("A soma dos impares: " + soma);
		sc.close();
	}

}
