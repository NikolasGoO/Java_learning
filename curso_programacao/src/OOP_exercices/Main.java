package OOP_exercices;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos dólares você deseja comprar: ");
		double buyDollar = sc.nextDouble();
		
		double convertedToReal = CurrencyConverter.converterInReal(buyDollar);
		
		System.out.printf("Preço a pagar em R$: $ %.2f", convertedToReal);
		sc.close();
	}

}
