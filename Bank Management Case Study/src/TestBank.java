
import Controller.BankController;
import Model.Bank;
import View.BankView;

public class TestBank {
    public static void main(String[] args) {

        Bank bank = new Bank();
        BankView view = new BankView();
        BankController c = new BankController(bank, view);

        while (true) {
            view.showMenu();
            int choice = view.askInt("Choose: ");

            switch (choice) {
                case 1 -> c.createAccountMenu();
                case 2 -> c.depositMenu();
                case 3 -> c.withdrawMenu();
                case 4 -> bank.showAllAccounts();
                case 5 -> bank.showAccount(view.askInt("Acc no: "));
                case 6 -> bank.printStatement(view.askInt("Acc no: "));
                case 7 -> c.deleteAccountMenu();
                case 8 -> c.simulateMonthMenu();

                case 9 -> bank.applyMonthlyInterestToAll();
                case 10 -> c.emiMenu();
                case 11 -> bank.endOfDayReport();
                case 12 -> { System.out.println("Goodbye!"); return; }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

