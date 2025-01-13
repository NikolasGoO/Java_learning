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

    public boolean MakeDeposit(double deposit) {
        if (deposit < 0) {
            return false;
        }
        Balance += deposit;
        return true;
    }

    public boolean MakeWithdraw(double withdraw) {
        double totalWithdraw = withdraw + 5;
        if (totalWithdraw > Balance) {
            return false;
        }
        Balance -= totalWithdraw;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: %.2f", Id, Name, Balance);
    }
}
