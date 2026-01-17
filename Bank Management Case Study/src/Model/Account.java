package Model;

public abstract class Account {
    public int accountNumber;
    public String holderName;
    public double balance;
    public boolean isFrozen;

    public Account(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
        isFrozen = false;
    }

    public abstract void deposit(double amount, Bank bank);
    public abstract boolean withdraw(double amount, Bank bank);
    public abstract void applyMonthlyInterest(Bank bank);
    public abstract String getType();

    public void displaySummary() {
        System.out.printf("[%s] AccNo: %d | Name: %s | Balance: %.2f %s\n",
                getType(), accountNumber, holderName, balance, (isFrozen ? "[FROZEN]" : ""));
    }
}
