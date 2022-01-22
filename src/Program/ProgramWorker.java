package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;
import entity.Department;
import entity.HourContract;
import entity.Worker;

public class ProgramWorker {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String DepartmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("Name: ");
		String NameWorker = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		System.out.println("Base salary: ");
		sc.nextLine();
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(NameWorker, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(DepartmentName));
		
		System.out.println("How many contracts to this worker? ");
		int contract = sc.nextInt();
		
		for (int i = 1; i <= contract; i++) {
			
			System.out.println("Enter contract #" + i + "data");
			System.out.println("Date (DD/MM/YYYY): " );
			
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Value per hour: ");		
			double valuePerHour = sc.nextDouble();
		
			System.out.println("Duration (hours):");
			int duration = sc.nextInt();
			
			HourContract Contract =  new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(Contract);
		}
		
				
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();	
		int month =Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartamento().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}

}
