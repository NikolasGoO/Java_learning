package exercicios_java_1;

import java.util.Scanner;

public class exercicio_peca {

	public static void main(String[] args) {
		int code;
		int quantity;
		double unitValue;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Código da peça:\n");
		code = sc.nextInt();
		
		System.out.println("Quantidade: \n");
		quantity = sc.nextInt();
		
		System.out.println("Valor:\n");
		unitValue = sc.nextDouble();
		
		int code2;
		int quantity2;
		double unitValue2;
		
		System.out.println("Código da 2º peça:\n");
		code2 = sc.nextInt();
		
		System.out.println("Quantidade: \n");
		quantity2 = sc.nextInt();
		
		System.out.println("Valor:\n");
		unitValue2 = sc.nextDouble();
		
		double allValue = (quantity * unitValue) + (quantity2 * unitValue);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", allValue);
				
		sc.close();
		
		
	}

}
