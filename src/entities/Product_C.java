package entities;

public class Product_C {
	public String nome;
	public double preco;
	public int qtd;

	public Product_C(String nome, double preco, int qtd) {
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
				+ ", " + String.format("%.2f", preco) 
				+ ", $ " 
				+ preco 
				+ ", " 
				+ qtd 
				+ " em estoque, total $ " 
				+ valorTotalEmEstoque();
	}
}
