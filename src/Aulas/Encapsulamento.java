package Aulas;

import java.util.Scanner;

import entities.Product_E;

public class Encapsulamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine(); // Criar uma variavel auxiliar
		
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		int qtd = sc.nextInt();
		
		Product_E p1 = new Product_E(nome, preco, qtd);
		
		p1.setNome("Computer");
		System.out.println("Uptdated nome: " + p1.getNome());
		
		p1.setPreco(1);
		System.out.println("Updated Preco: " + p1.getPreco());
		
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
