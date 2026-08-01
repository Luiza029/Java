package Exercicios;
import java.util.Scanner;

import entities.Student;
public class Notas_POO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		System.out.println("Digite as notas do aluno: ");
		s1.n1 = sc.nextDouble();
		s1.n2 = sc.nextDouble();
		s1.n3 = sc.nextDouble();
		
		System.out.println(s1);
		
		sc.close();
	}

}
