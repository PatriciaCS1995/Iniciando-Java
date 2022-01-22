package entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	private Department departamento;

	private List<HourContract> hourContract = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, double baseSalary, Department departamento) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departamento = departamento;

	}

	public void addContract(HourContract contract) {
		hourContract.add(contract);
	}

	public void removeContract(HourContract contract) {
		hourContract.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract cont : hourContract) {
			cal.setTime(cont.getDate());
			int contYear = cal.get(Calendar.YEAR);
			int contMonth = cal.get(Calendar.MONTH);
			if (year == contYear && month == contMonth) {
				sum += cont.totalValue();
			}
		}
		return sum;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Department departamento) {
		this.departamento = departamento;
	}

	public List<HourContract> getHourContract() {
		return hourContract;
	}

}
