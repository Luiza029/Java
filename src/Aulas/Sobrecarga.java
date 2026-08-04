package Aulas;
import java.util.Scanner;

import entities.Product_S;

public class Sobrecarga {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		
		Product_S p1 = new Product_S(nome, preco);
		System.out.println(p1);
		
		System.out.println("Digite um numero para adicionar no estoque: ");
		int qtd = sc.nextInt();
		p1.addProduto(qtd);
		System.out.println(p1);
		
		System.out.println("Digite um numero para remover do estoque: ");
		qtd = sc.nextInt();
		p1.removeProduto(qtd);
		System.out.println(p1);

		sc.close();
	}
}
