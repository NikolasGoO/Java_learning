package exercicios_java_1;

import java.util.Scanner;

public class exercicio_diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro para calcular as diferença: ");
		int a = sc.nextInt();
		
		System.out.println("Segundo valor: ");
		int b = sc.nextInt();
		
		System.out.println("Terceiro valor: ");
		int c = sc.nextInt();
		
		System.out.println("Ultimo valor: ");
		int d = sc.nextInt();
		
		int difference = (a * b - c * d);
		
		System.out.printf("A diferença entre os produtos %d, %d, %d, %d = %d", a, b, c, d, difference);
		sc.close();
	}

}
