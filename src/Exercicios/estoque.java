package Exercicios;
import java.util.Scanner;

import entities.Product;
public class estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
		
		System.out.println("Dados do produto");
		System.out.println("Nome: ");
		p1.nome = sc.next();
		
		System.out.println("Preco: ");
		p1.preco = sc.nextDouble();
		
		System.out.println("Quantidade em estoque: ");
		p1.qtd = sc.nextInt();
		System.out.println(p1);
		
		int qtd;
		
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
