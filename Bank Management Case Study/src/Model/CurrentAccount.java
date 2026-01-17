package Model;

public class CurrentAccount extends Account {
    double overdraftLimit;

    public CurrentAccount(int a, String n, double b, double limit) {
        super(a, n, b);
        overdraftLimit = limit;
    }

    @Override
    public void deposit(double amount, Bank bank) {
        balance += amount;
        bank.logTransaction(new Transaction(accountNumber, "DEPOSIT", amount));
    }

    @Override
    public boolean withdraw(double amount, Bank bank) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            bank.logTransaction(new Transaction(accountNumber, "WITHDRAW", amount));
            return true;
        }
        return false;
    }

    @Override
    public void applyMonthlyInterest(Bank bank) {}

    @Override
    public String getType() {
        return "Current";
    }
}
