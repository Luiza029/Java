package entities;

public class Employees {
	private int id;
	private String nome;
	private double salario;
	
	public Employees(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double aumentaSalario(double porcent) {
		salario = salario + (salario * (porcent / 100.0));
		return salario;
	}

	public String toString() {
		return id + ", " + nome + ", " + salario;
	}
	
}
