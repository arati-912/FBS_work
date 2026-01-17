package Model;

public class SalaryAccount extends Account {

    int monthsNoTransaction = 0;

    public SalaryAccount(int a, String n, double b) {
        super(a, n, b);
    }

    @Override
    public void deposit(double amount, Bank bank) {
        balance += amount;
        monthsNoTransaction = 0;
        isFrozen = false;
        bank.logTransaction(new Transaction(accountNumber, "DEPOSIT", amount));
    }

    @Override
    public boolean withdraw(double amount, Bank bank) {
        if (isFrozen) {
            System.out.println("Account is frozen!");
            return false;
        }
        if (balance >= amount) {
            balance -= amount;
            monthsNoTransaction = 0;
            bank.logTransaction(new Transaction(accountNumber, "WITHDRAW", amount));
            return true;
        }
        return false;
    }

    void monthPassed(Bank bank) {
        monthsNoTransaction++;
        if (monthsNoTransaction >= 2) {
            isFrozen = true;
            bank.logTransaction(new Transaction(accountNumber, "ACCOUNT_FROZEN", 0.0));
            System.out.println("Salary account " + accountNumber + " has been frozen due to inactivity.");
        }
    }


    @Override
    public void applyMonthlyInterest(Bank bank) {}

    @Override
    public String getType() {
        return "Salary";
    }
}
