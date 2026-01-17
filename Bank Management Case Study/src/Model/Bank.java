package Model;

public class Bank {

    public Account[] accounts = new Account[50];
    public int accCount = 0;

    public Transaction[] logs = new Transaction[500];
    public int logCount = 0;

    public void logTransaction(Transaction t) {
        logs[logCount++] = t;
    }

    public boolean addAccount(Account a) {
        accounts[accCount++] = a;
        logTransaction(new Transaction(a.accountNumber, "ACCOUNT_CREATED", 0));
        return true;
    }

    public Account find(int accNo) {
        for (int i = 0; i < accCount; i++)
            if (accounts[i].accountNumber == accNo)
                return accounts[i];
        return null;
    }

    public boolean deleteAccount(int accNo) {
        for (int i = 0; i < accCount; i++) {
            if (accounts[i].accountNumber == accNo) {
                accounts[i] = accounts[accCount - 1];
                accCount--;
                logTransaction(new Transaction(accNo, "ACCOUNT_DELETED", 0));
                return true;
            }
        }
        return false;
    }

    public void printStatement(int accNo) {
        for (int i = 0; i < logCount; i++) {
            if (logs[i].accountNumber == accNo)
                System.out.println(logs[i].format());
        }
    }

    public void endOfDayReport() {
        System.out.println("----- END OF DAY REPORT -----");
        for (int i = 0; i < logCount; i++)
            System.out.println(logs[i].format());
        logCount = 0;
    }
    
 // Show all accounts
    public void showAllAccounts() {
        System.out.println("---- All Accounts ----");
        for (int i = 0; i < accCount; i++) {
            accounts[i].displaySummary();
        }
    }

    // Show a specific account by account number
    public void showAccount(int accNo) {
        Account a = find(accNo);
        if (a != null) {
            a.displaySummary();
        } else {
            System.out.println("Account not found.");
        }
    }

    // Apply monthly interest to all accounts
    public void applyMonthlyInterestToAll() {
        for (int i = 0; i < accCount; i++) {
            accounts[i].applyMonthlyInterest(this);
        }
        System.out.println("Monthly interest applied to all accounts.");
    }
    public void monthPassedForSalaryAccounts() {
        for (int i = 0; i < accCount; i++) {
            if (accounts[i] instanceof SalaryAccount sa) {
                sa.monthPassed(this);
            }
        }
    }

}
