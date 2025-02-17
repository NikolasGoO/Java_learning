package OOP_exercices;

public class Employe {
	public String name;
	public double grossSalary;
	public double tax;
	
	public void NetSalary() {
		double salary = grossSalary - tax;
		System.out.printf("Employee: %s, $ %.2f", name, salary);
	}
	
	public void IncreaseSalary(double percentage) {
		double percent = percentage / 100;
		double increase = percent * grossSalary;
		double salaryIncreased = increase + (grossSalary - tax);
		
		System.out.printf("Updated data: %s, $ %.2f", name, salaryIncreased);
	}
}
