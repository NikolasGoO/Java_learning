package vetor;

import java.util.Scanner;

public class vetor_exercice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Número você vai digitar?");
		boolean next = true;
		int n = sc.nextInt();
		if(n > 10) {
			while(next) {
				System.out.print("Inválido, selecione uma quantidade menor que 10:");
				n = sc.nextInt();
				if(n < 10) {
					next = false;
				}
			}
		}
		int[] numbers = new int[n];

		for(int i = 0; i < n ;i++)
		{
			System.out.println("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Numeros Negativos: ");
		for(int i = 0; i < n; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();
	}

}
