package service;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class ServiceEmployee {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the name of employee: ");
		employee.name = sc.nextLine();
		
		System.out.println("Enter the Gross Salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.println("Enter the tax: ");
		double tax = sc.nextDouble();
		
		employee.NetSalary(tax);
		
		System.out.println("Enter the percentage to add Gross salary: ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println("Employee: " + employee.name + ", $ " + employee.GrossSalary + "Tax: " + tax );
		
		System.out.println("Which percentage to increase salary? " + percentage);
		
		System.out.println("Updated data: " + employee.name + ", $ " + employee.GrossSalary );
		
		
		sc.close();
		}

}
