package vetor;

import java.util.Scanner;

public class sum_exercice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar:\n");
		int n = sc.nextInt();
		double[] numbers = new double[n];
		double sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			numbers[i] = sc.nextInt();
			
			sum =+ numbers[i];
		}
		System.out.println("Valores: ");
		for(int i = 0; i < n; i++) {
			System.out.print(" " + numbers[i]);	
		}
		System.out.println("\nSOMA = " + sum);
		System.out.println("Média = " + sum / n);
		
		sc.close();
	}

}
