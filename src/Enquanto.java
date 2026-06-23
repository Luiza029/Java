import java.util.Scanner;
public class Enquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Digite o primeiro numero: ");
		x = sc.nextInt();
		
		while(x != 0) {
			soma += x;
			System.out.println("Digite outro numero: ");
			x = sc.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
		sc.close();
	}

}
