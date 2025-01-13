package bank_exercice;

public class Bank {
	private int Id;
	private String Name;
	private double Balance;
	
	public Bank(int id, String name) {
		this.Id = id;
		this.Name = name;
		this.Balance = 0;
	}
		
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	public double MakeDeposit(double deposit) {
		if(deposit < 0) {
			System.out.print("It is not possible to make a deposit with a negative amount");
		} else {
			Balance += deposit;
		}
		return Balance;
	}
	
	public double MakeWithdraw(double withdraw) {
		if(withdraw > Balance) {
			System.out.print("You dont Have a sufficient Money to make this action.\nPlease Make a Deposit.");
		}
		else {
			Balance -= withdraw + 5;
		}
		return Balance;
	}

	@Override
	public String toString() {
		return "\nAccount "
				+ Id +
				", Holder: "
				+ Name +
				", Balance: "
				+ Balance;
	}
	
}
