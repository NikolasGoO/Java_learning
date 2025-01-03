package OOP_exercices;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite a primeira, segunda e terceira nota:");
		student.Grade[0] = sc.nextDouble();
		if(student.Grade[0] > 30) {
			System.out.println("Erro, apenas a segunda e terceira nota são maiores que 30 e valem 35.\nTente Novamente:");
			student.Grade[0] = sc.nextDouble();
		}
		student.Grade[1] = sc.nextDouble();
		student.Grade[2] = sc.nextDouble();
		if(student.Grade[1] > 35 | student.Grade[2] > 35) {
			System.out.println("Erro, 2º e 3º nota valem no máximo 35.");
		} if(student.Grade[1] > 35) {
			System.out.println("Digite novamente a 2º nota: ");
			student.Grade[1] = sc.nextDouble();
		} if(student.Grade[2] > 35) {
			System.out.println("Digite novamente a 3º nota: ");
			student.Grade[2] = sc.nextDouble();
		}
		
		student.HasPass();
		sc.close();
	}

}
