package vetor;

public class Funcionario {
	private Integer id;
	private String name;
	private double salary;
	
	public Funcionario(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		if(percentage <= 0) {
			System.out.println("The value that will be added must be greater than zero");
		} else {
			percentage /= 100;
			double totalIncreaseSalary = percentage * salary;
			salary += totalIncreaseSalary;
		}
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}
