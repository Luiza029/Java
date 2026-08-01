package entities;

public class Product_S {
	public String nome;
	public double preco;
	public int qtd;

	public Product_S(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Product_S(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
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
