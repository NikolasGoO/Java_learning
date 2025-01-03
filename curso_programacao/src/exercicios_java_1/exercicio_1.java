package exercicios_java_1;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int number1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int number2 = sc.nextInt();
		sc.close();
		
		int sum = number1 + number2;
		
		System.out.printf("A soma de: %d + %d = %d", number1, number2, sum);
	}

}
