package OOP_exercices;

public class Employe {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public void NetSalary() {
		double salary = GrossSalary - Tax;
		System.out.printf("Employee: %s, $ %.2f", Name, salary);
	}
	
	public void IncreaseSalary(double percentage) {
		double percent = percentage / 100;
		double increase = percent * GrossSalary;
		double salaryIncreased = increase + (GrossSalary - Tax);
		
		System.out.printf("Updated data: %s, $ %.2f", Name, salaryIncreased);
	}
}
