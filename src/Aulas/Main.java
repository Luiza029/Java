package Aulas;

public class Main {

	public static void main(String[] args) {
		
		int idade;
		double salario, altura;
		char genero;
		String nome;
		
		idade = 19;
		salario = 2655;
		altura = 1.65;
		genero = 'F';
		nome = "Luiza";
		
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + String.format("%.2f", salario));
		System.out.println("Altura: "+ altura);
		System.out.println("Genero: " + genero);
		System.out.println("Nome: " + nome);
		
	}

}
