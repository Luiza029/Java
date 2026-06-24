import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int l, c, i, j;
		
		System.out.print("Digite o numero de Linhas: ");
		l = sc.nextInt();
		
		System.out.print("Digite o numero de Colunas: ");
		c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		for(i=0; i<l; i++) {
			for(j=0; j<c; j++) {
				System.out.print("Elemento["+i+", "+j+"]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("Matriz Digitada: ");
		for(i=0; i<l; i++) {
			for(j=0; j<c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
