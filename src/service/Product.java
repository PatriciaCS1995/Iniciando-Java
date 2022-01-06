package service;

import java.util.Locale;
import java.util.Scanner;

import entity.ProductEntity;

public class Product {
public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	ProductEntity product = new ProductEntity();
	System.out.println("Enter product name: ");
	
	System.out.println("name: ");
	product.name = sc.nextLine();
	
	System.out.println("Price");
	product.price = sc.nextDouble();
	
	System.out.println("Quantity in Stock: ");
	product.quantity = sc.nextInt();
	
	System.out.println("Product data: " + product);
	
	System.out.println();
	
	System.out.println("Enter the number of products to be added in stock: ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);
	
	System.out.println("Updated product data: " + product);
	
	System.out.println();
	
	System.out.println("Enter the number of products to be removed in stock: ");
	quantity = sc.nextInt();
	product.removeProducts(quantity);
	
	System.out.println("Updated product data: " + product);
	
	sc.close();
}
}
