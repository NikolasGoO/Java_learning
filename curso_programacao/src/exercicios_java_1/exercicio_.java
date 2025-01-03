package exercicios_java_1;

import java.util.Scanner;

public class exercicio_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual numero do funcionário: ");
		int employeId = sc.nextInt();
		
		System.out.printf("Quantas horas trabalhadas do funcionário %d:\n", employeId);
		int jobbedHour = sc.nextInt();
		
		System.out.println("Quanto ele recebe por hora:\n");
		double valueHour = sc.nextDouble();
		
		sc.close();
		
		double totalSalary = jobbedHour * valueHour;
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", employeId, totalSalary);
	}

}
