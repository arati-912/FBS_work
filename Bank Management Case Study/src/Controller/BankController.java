package Controller;

import Model.*;
import View.BankView;

public class BankController {

    Bank bank;
    BankView view;

    public BankController(Bank b, BankView v) {
        bank = b;
        view = v;
    }

    public void createAccountMenu() {
        System.out.println("Account Types:");
        System.out.println("1. Savings");
        System.out.println("2. Salary");
        System.out.println("3. Current");
        System.out.println("4. Loan");

        int type = view.askInt("Select type: ");
        int accNo = view.askInt("Enter account number: ");
        String name = view.askString("Enter name: ");
        double amt = view.askDouble("Enter initial amount / loan amount: ");

        Account a = null;

        switch (type) {
            case 1: {
                a = new SavingsAccount(accNo, name, amt);
                break;
            }
            case 2: {
                a = new SalaryAccount(accNo, name, amt);
                break;
            }
            case 3: {
                double limit = view.askDouble("Enter overdraft limit: ");
                a = new CurrentAccount(accNo, name, amt, limit);
                break;
            }
            case 4: {
                a = new LoanAccount(accNo, name, amt);
                break;
            }
            default: {
                System.out.println("Invalid Type!");
                return;
            }
        }

        bank.addAccount(a);
        System.out.println("Account created.");
    }

    public void depositMenu() {
        int no = view.askInt("Account no: ");
        Account a = bank.find(no);
        if (a == null) {
            System.out.println("Not found");
            return;
        }
        double amt = view.askDouble("Amount: ");
        a.deposit(amt, bank);
        System.out.println("Deposit Successful!");
    }

    public void withdrawMenu() {
        int no = view.askInt("Account no: ");
        Account a = bank.find(no);
        if (a == null) {
            System.out.println("Not found");
            return;
        }
        double amt = view.askDouble("Amount: ");
        a.withdraw(amt, bank);
    }

    public void deleteAccountMenu() {
        int no = view.askInt("Account no: ");
        if (bank.deleteAccount(no)) {
            System.out.println("Account deleted.");
        } else {
            System.out.println("Not found.");
        }
    }

    public void emiMenu() {
        int no = view.askInt("Loan account no: ");
        Account acc = bank.find(no);

        if (!(acc instanceof LoanAccount)) {
            System.out.println("Not a loan account.");
            return;
        }

        double amt = view.askDouble("Enter EMI amount to pay: ");
        acc.deposit(amt, bank);
        System.out.println("EMI paid successfully.");
    }
    public void simulateMonthMenu() {
        bank.monthPassedForSalaryAccounts();
        System.out.println("One month simulated. Salary inactivity updated.");
    }

}
