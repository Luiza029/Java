package Exercicios;
import java.util.Scanner;

import entities.Triangle;
public class maiorTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		
        System.out.println("Digite os lados do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        
        System.out.println("Area X: " + areaX);
        System.out.println("Area Y: " + areaY);
        
        if(areaX > areaY) {
        	System.out.println("A area X eh maior que a area Y");
        }
        
        else {
        	System.out.println("A area Y eh maior que a area X");
        }

        sc.close();
	}

}
