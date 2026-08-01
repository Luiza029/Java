package Exercicios;
import java.util.Scanner;

import entities.Employee;
public class Salario_POO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee f1;
		f1 = new Employee();
		
		System.out.println("Nome: ");
		f1.nome = sc.nextLine();
		
		System.out.println("Salario Bruto: ");
		f1.salarioBruto = sc.nextDouble();
		
		System.out.println("Taxa: ");
		f1.taxa = sc.nextDouble();

		System.out.println(f1);
		
		System.out.println("Digite o aumento: ");
		double porcentagem = sc.nextDouble();
		
		f1.porcentagem(porcentagem);
		System.out.println(f1);
		sc.close();		
	}

}
