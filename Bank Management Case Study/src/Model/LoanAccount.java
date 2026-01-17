package Model;

public class LoanAccount extends Account {

    double rate = 0.08;

    public LoanAccount(int a, String n, double loanAmount) {
        super(a, n, -loanAmount);
    }

    @Override
    public void deposit(double amount, Bank bank) {
        balance += amount;
        bank.logTransaction(new Transaction(accountNumber, "LOAN_REPAY", amount));
    }

    @Override
    public boolean withdraw(double amount, Bank bank) {
        System.out.println("Cannot withdraw from loan account!");
        return false;
    }

    @Override
    public void applyMonthlyInterest(Bank bank) {
        double interest = balance * (rate / 12);
        balance += interest;
        bank.logTransaction(new Transaction(accountNumber, "LOAN_INTEREST", interest));
    }

    @Override
    public String getType() {
        return "Loan";
    }

    public double getEMI(int months) {
        double P = -balance;
        double R = rate / 12;
        return (P * R * Math.pow(1 + R, months)) / (Math.pow(1 + R, months) - 1);
    }
}
