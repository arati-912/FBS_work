package View;

import java.util.Scanner;

public class BankView {

    Scanner sc = new Scanner(System.in);

    public int askInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    public double askDouble(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    public String askString(String msg) {
        System.out.print(msg);
        sc.nextLine();
        return sc.nextLine();
    }

    public void showMenu() {
        System.out.println("\n***** XYZ BANK *****");
        System.out.println("1 Create Account");
        System.out.println("2 Deposit");
        System.out.println("3 Withdraw");
        System.out.println("4 Show All Accounts");
        System.out.println("5 Show Account Details");
        System.out.println("6 Print Statement");
        System.out.println("7 Delete Account");
        System.out.println("8 Simulate Month Passing");
        System.out.println("9 Apply Monthly Interest");
        System.out.println("10 EMI Calculator");
        System.out.println("11 End of Day Report");
        System.out.println("12 Exit");
    }
}
