import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario1, salario2;
		String nome1, nome2;
		int idade1, idade2;
		char sexo1, sexo2;
		
		System.out.println("=== Dados da primeira pessoa ===");
		System.out.println("Digite o nome da pessoa: ");
		nome1= sc.nextLine();
		
		System.out.println("Digite o salario da pessoa: ");
		salario1 = sc.nextDouble();
		
		System.out.println("Digite o sexo da pessoa: ");
		sexo1 = sc.next().charAt(0);
		
		System.out.println("Digite a idade da pessoa: ");
		idade1 = sc.nextInt();
		
		
		
		System.out.println("=== Digite os dados da segunda pessoa ===");
		sc.nextLine(); // Limpeza de buffer
		
		System.out.println("Digite o nome da pessoa: ");
		nome2 = sc.nextLine();
		
		System.out.println("Digite o salario da pessoa: ");
		salario2 = sc.nextDouble();
		
		System.out.println("Digite o sexo da pessoa: ");
		sexo2 = sc.next().charAt(0);
		
		System.out.println("Digite a idade da pessoa: ");
		idade2 = sc.nextInt();
		
		
		
		System.out.println("=== Informacoes ===");
		
		System.out.println("Nome da Primeira pessoa: " + nome1);
		System.out.println("Nome da Segunda pessoa: " + nome2);
		
		System.out.println();
		
		System.out.println("Salario da Primeira pessoa: " + salario1);
		System.out.println("Salario da Segunda pessoa: " + salario2);
		
		System.out.println();
		
		System.out.println("Sexo da Primeira pessoa: " + sexo1);
		System.out.println("Sexo da Segunda pessoa: " + sexo2);
		
		System.out.println("Idade da Primeira pessoa: " + idade1);
		System.out.println("Idade da Segunda pessoa: " + idade2);
	}

}
