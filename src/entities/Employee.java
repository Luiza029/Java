package entities;

public class Employee {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public void porcentagem(double porcent) {
		salarioBruto += salarioBruto * (porcent / 100);
	}
	
	public String toString() {
		return "Dados: " + nome + ", $ " + salarioLiquido();
	}
}
