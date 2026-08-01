package Aulas;

import java.util.Scanner;

import entities.Product_C;

public class Construtor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine(); // Criar uma variavel auxiliar
		
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		int qtd = sc.nextInt();
		
		Product_C p1 = new Product_C(nome, preco, qtd);
		System.out.println(p1);
		
		System.out.println("Digite um numero para adicionar no estoque: ");
		qtd = sc.nextInt();
		p1.addProduto(qtd);
		System.out.println(p1);
		
		System.out.println("Digite um numero para remover do estoque: ");
		qtd = sc.nextInt();
		p1.removeProduto(qtd);
		System.out.println(p1);

		sc.close();
	}
}
