package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorRadius;

public class ProgramCalcularRaio {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculatorRadius calc = new CalculatorRadius();
		
		System.out.println("enter radius: ");
		double radius = sc.nextDouble();
		
	double c = calc.circumference(radius);
	
	double v = calc.volume(radius);
	
	System.out.printf("circumference: %.2f%n", c);
	System.out.printf("volume: %.2f%n", v);
	System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}

}
