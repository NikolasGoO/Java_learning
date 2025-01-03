package exercicios_java_1;

import java.util.Scanner;

public class exercicio_areaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		System.out.println("Qual raio do cículo para soma da área: ");
		double ray = sc.nextDouble();
		sc.close();
		
		double areaValue = java.lang.Math.pow(ray, 2);
		
		areaValue *= pi;
		
		System.out.printf("O valor da área do Círculo é %.4f", areaValue);
	}

}
