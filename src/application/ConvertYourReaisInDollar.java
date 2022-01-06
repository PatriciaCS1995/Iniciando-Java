package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ConvertYourReaisInDollar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter corrency = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		double dollarP = sc.nextDouble();
		
		System.out.println("How many dollars whill be bought? ");
		double buyD = sc.nextDouble();
		
		double result = corrency.CurrencyC(dollarP, buyD);
		
		System.out.println("Amount to be paid in reais = " +  result);
		
		sc.close();

	}

}
