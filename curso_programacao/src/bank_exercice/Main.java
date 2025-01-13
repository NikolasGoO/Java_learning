package bank_exercice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int id = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine(); 
        String holderName = sc.nextLine();

        System.out.println("Is there an initial deposit (y/n)? ");
        String response = sc.next();

        Bank bankAccount = new Bank(id, holderName);

        if (response.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            if (!bankAccount.MakeDeposit(initialValue)) {
                System.out.println("Deposit value must be positive!");
            }
        }

        System.out.println("\nAccount data: ");
        System.out.println(bankAccount);

        System.out.println("Enter a deposit value: ");
        if (!bankAccount.MakeDeposit(sc.nextDouble())) {
            System.out.println("Deposit failed!");
        }

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println("Enter a withdraw value: ");
        if (!bankAccount.MakeWithdraw(sc.nextDouble())) {
            System.out.println("Withdraw failed!");
        }

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}
