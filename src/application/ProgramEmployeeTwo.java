package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.EmployeeTwoList;

public class ProgramEmployeeTwo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeTwoList> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			System.out.println("Id: ");
			Integer id = sc.nextInt();

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			EmployeeTwoList employee = new EmployeeTwoList(id, name, salary);
			list.add(employee);

		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		Integer positionList = SearchId(list, idEmployee);
		if (positionList == null) {
			System.out.println("This id does not exist! ");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(positionList).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (EmployeeTwoList employeer : list) {
			System.out.println(employeer);
		}

		sc.close();

	}

	public static Integer SearchId(List<EmployeeTwoList> SearchList, int id) {
		for (int i = 0; i < SearchList.size(); i++) {
			if (SearchList.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
