package entities;

public class Student {
	public double n1;
	public double n2;
	public double n3;
	
	public double somarNotas() {
		if(n1 > 30 || n2 > 35 || n3 > 35) {
			return -1;
		}
		
		else {
			return n1 + n2 + n3;
		}
	}
	
	public String toString() {
		if(somarNotas() >= 60 ) {
			return "Final Grade: " + somarNotas() + "\nPass";
		}
		
		return "Final Grade: " + somarNotas() + "\nFailed" + "\nMISSING: " + (60 - somarNotas()) + " Points";
	}
}
