package Exercicios;
import java.util.Scanner;
import entities.Dados;

public class Conta_bancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double deposito;
		
		System.out.println("Numero da conta: ");
		int numConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Nome do Titular: ");
		String nome = sc.nextLine();
		
		System.out.println("Deseja depositar um valor inicial na conta? [s/n]: ");
		String continuar = sc.nextLine();
		
		if(continuar.equals("s") || continuar.equals("S")) {
			System.out.println("Digite o valor do deposito inicial: ");
			deposito = sc.nextDouble();
			sc.nextLine();
		}
		
		else {
			deposito = 0;
		}
		
		
		Dados d1 = new Dados(numConta, nome, deposito);
		String depositar;
		
		System.out.println(d1);
		
		System.out.println("Deseja continuar [s/n]: ");
		depositar = sc.nextLine();
		
		while(depositar.equals("s")) {
			System.out.println("Deseja sacar ou depositar: ");
			String modo = sc.nextLine();
			
			if(modo.equals("sacar") || modo.equals("Sacar")) {
				System.out.println("Digite o valor desejado para sacar: ");
				double sacar = sc.nextDouble();
				sc.nextLine();
				d1.sacar(sacar);
			}
			
			else {
				System.out.println("Qual valor deseja depositar: ");
				double deposito2 = sc.nextDouble();
				sc.nextLine();
				d1.deposito(deposito2);
			}
			
			System.out.println(d1);
			System.out.println("Deseja continuar [s/n]: ");
			depositar = sc.nextLine();
		}
		
		sc.close();
	}

}
