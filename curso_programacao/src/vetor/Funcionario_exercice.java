package vetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario_exercice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Funcionario> funcionarioList = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) +":");
			int id;
			while (true) {
				System.out.println("Id:");
				int newId = sc.nextInt();
				boolean exists = funcionarioList.stream().anyMatch(emp -> emp.getId() == newId);
				if (exists) {
					System.out.println("This ID is already taken! Try again.");
				} else {
					id = newId;
					break;
				}
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			funcionarioList.add(new Funcionario(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idToIncrease = sc.nextInt();
		Funcionario funcionario = funcionarioList.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);
		if(funcionario == null) {
			System.out.println("Aborted, this id does not exist");
		} else {
			System.out.println("Enter the percentage: ");
			funcionario.increaseSalary(sc.nextDouble());
		}
		
		System.out.println("List of employees: ");
		for(Funcionario func : funcionarioList) {
			System.out.println(func);
		}
		sc.close();
	}

}
