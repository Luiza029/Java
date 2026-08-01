package entities;

public class Rectangle {
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (altura + largura);
	}
	
	public double diagonal() {
		return Math.sqrt((altura * altura) + (largura * largura));
	}
	
	public String toString() {
		return "Area: " + area() + "\n" + "Perimetro: " + perimetro() + "\n" + "Diagonal: " + diagonal();
	}
}
