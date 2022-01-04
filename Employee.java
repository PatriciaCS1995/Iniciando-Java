package entity;

public class Employee {
	
	public String name;
	public double GrossSalary;
	
	public double NetSalary(double tax) {
	return this.GrossSalary -= tax;
	}

	public double IncreaseSalary(double percentage) {
	return this.GrossSalary += percentage/100 * GrossSalary;
	}
	
	public String toString() {
		return "Name: "
				+ name
				+ "Gross salary: "
				+ GrossSalary;
			
			
	}
	
}

