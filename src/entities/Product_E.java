package entities;

public class Product_E {
	private String nome;
	private double preco;
	private int qtd;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

//  QTD nao se cria set, para proteger a integridade do produto de alteracoes inconsistentes, ou seja, so vai mudar quando tiver uma entrada e uma saida
//	public void setQtd(int qtd) {
//		this.qtd = qtd;
//	}

	public Product_E(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public double valorTotalEmEstoque() {
		return qtd * preco;
	}
	
	public void addProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProduto(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome 
				+ ", $ " + String.format("%.2f", preco) 
				+ ", " 
				+ qtd 
				+ " em estoque, total $ " 
				+ valorTotalEmEstoque();
	}
}
