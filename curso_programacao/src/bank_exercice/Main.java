package bank_exercice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int id = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String holderName = sc.next();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		String response = sc.next();
		
		Bank bankAccount = new Bank(id, holderName);

		if(response == "y" || response == "Y") {
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			bankAccount.MakeDeposit(initialValue);
		}
		
		System.out.println("\nAccount data: ");
		System.out.print(bankAccount.toString());
		
		System.out.println("\nEnter a deposit value: ");
		bankAccount.MakeDeposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.print(bankAccount.toString());
		
		System.out.println("Enter a withdraw value: ");
		bankAccount.MakeWithdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.print(bankAccount.toString());
		
		sc.close();

	}

}
