package Aulas;
import java.util.Scanner;
public class Do_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float c, f;
		char resposta;
		
		do {
			System.out.print("Digite a teperatura em Celsius: ");
			c = sc.nextFloat();
			
			f = (float)(9.0 * c / 5.0 + 32.0);
			
			System.out.println("Equivalente a Fahrenheit: " + f);
			System.out.print("Deseja repetir(s/n): ");
			resposta = sc.next().charAt(0);
			
		} while(resposta == 's');
		
		sc.close();
	}

}
