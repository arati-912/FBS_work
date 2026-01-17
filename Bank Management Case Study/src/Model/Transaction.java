package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    public int accountNumber;
    public String type;
    public double amount;
    public LocalDateTime timestamp;

    public Transaction(int acc, String t, double amt) {
        accountNumber = acc;
        type = t;
        amount = amt;
        timestamp = LocalDateTime.now();
    }

    public String format() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return timestamp.format(f) + " | " + accountNumber + " | " + type + " | " + amount;
    }
}
