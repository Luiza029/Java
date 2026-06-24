package Exercicios;
import java.util.Scanner;
public class Diagonal_negativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l, c, i, j, cont = 0;
		
		System.out.println("Digite a linha e coluna: ");
		l = sc.nextInt();
		c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		for(i=0; i<l; i++) {
			for(j=0; j<c; j++) {
				System.out.println("Elemento ["+ i + ", " + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Diagonal Principal: ");
		for(i=0; i<l; i++) {
			for(j=0; j<c; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + " ");
				}
				
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de Negativos: " + cont);

	}

}
