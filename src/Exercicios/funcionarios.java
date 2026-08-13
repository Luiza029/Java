package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import entities.Employees;

public class funcionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de funcionarios: ");
		int n = sc.nextInt();
		
		List<Employees> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%d: %n", i+1);
			
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			boolean existe = list.stream().anyMatch(emp -> emp.getId() == id);
			
			if(existe) {
				System.out.println("Id ja existente");
				System.exit(0);
			}
			list.add(new Employees(id, nome, salario));
		}
		
		System.out.println("Digite o Id do funcionario que ira receber o aumento: ");
		int idSalario = sc.nextInt();
		
		System.out.println("Digite o aumento de funcionario: ");
		double percent = sc.nextDouble();
		
		for(Employees funci : list) {
			if(funci.getId() == idSalario) {
				funci.aumentaSalario(percent);
			}
		}
		
		for(Employees funci : list) {
			System.out.println(funci);
		}
		
		
		sc.close();
	}

}
