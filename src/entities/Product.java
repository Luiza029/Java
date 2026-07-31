package entities;

public class Product {
	public String nome;
	public double preco;
	public int qtd;
	
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
		return nome + ", " + String.format("%.2f", preco) + ", $ " + preco + ", " + qtd + " em estoque, total $ " + valorTotalEmEstoque();
	}
}
