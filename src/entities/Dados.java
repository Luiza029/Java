package entities;

public class Dados {
	private int numConta;
	private String nomeDoTitular;
	private double valor;
	
	public Dados(int numConta, String nomeDoTitular) {
		this.numConta = numConta;
		this.nomeDoTitular = nomeDoTitular;			
	}
	
	public Dados(int numConta, String nomeDoTitular, double valor) {
		this.numConta = numConta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(valor);			
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNomeDoTitutar(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public double getSaldo() {
		return valor;
	}
	
	public void deposito(double valor) {
		if(valor > 0) {
			this.valor += valor;			
		}
		
		else {
			System.out.println("Vc depositou um valor negativo");
		}
	}
	
	public void sacar(double valor) {
		if(valor > 0) {
			this.valor = this.valor - valor - 5;				
		}
		
		else {
			System.out.println("Vc sacou um valor negativo");
		}
	}

	public String toString() {
		return "Dados [numConta = " + numConta + ", nomeDoTitular = " + nomeDoTitular + ", valor = " + valor + "]";
	}
}
