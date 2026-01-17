package Model;

public class SavingsAccount extends Account {

    double minBalance = 10000;
    double interest = 0.04;

    public SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    
    public void deposit(double amount, Bank bank) {
        balance += amount;
        bank.logTransaction(new Transaction(accountNumber, "DEPOSIT", amount));
    }

    
    public boolean withdraw(double amount, Bank bank) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            bank.logTransaction(new Transaction(accountNumber, "WITHDRAW", amount));
            return true;
        }
        System.out.println("Minimum balance required: " + minBalance);
        return false;
    }

    
    public void applyMonthlyInterest(Bank bank) {
        double interestAmt = balance * (interest / 12);
        balance += interestAmt;
        bank.logTransaction(new Transaction(accountNumber, "INTEREST", interestAmt));
    }

    @Override
    public String getType() {
        return "Savings";
    }
}
