package entities;

public class Converter {
	public static final double TAXA = 0.06;
	
	public static double converter(double dolar, double dolarTotal) {
		double total = dolarTotal * dolar;
		return total + (dolarTotal * dolar * TAXA);
	}
}
