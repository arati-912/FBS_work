package Inheritance;

class Payment {
	String paymentId;
	String payerName;
	double amount;
	String date;
	String status;

	Payment() {
		this.paymentId = "P001";
		this.payerName = "Rahul Sharma";
		this.amount = 2500.50;
		this.date = "2025-11-10";
		this.status = "Successful";
	}

	Payment(String paymentId, String payerName, double amount, String date, String status) {
		this.paymentId = paymentId;
		this.payerName = payerName;
		this.amount = amount;
		this.date = date;
		this.status = status;
	}

	String getPaymentId() {
		return paymentId;
	}

	void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	String getPayerName() {
		return payerName;
	}

	void setPayerName(String payerName) {
		this.payerName = payerName;
	}

	double getAmount() {
		return amount;
	}

	void setAmount(double amount) {
		this.amount = amount;
	}

	String getDate() {
		return date;
	}

	void setDate(String date) {
		this.date = date;
	}

	String getStatus() {
		return status;
	}

	void setStatus(String status) {
		this.status = status;
	}

	void display() {
		System.out.println("Payment ID: " + paymentId);
		System.out.println("Payer Name: " + payerName);
		System.out.println("Amount: " + amount);
		System.out.println("Date: " + date);
		System.out.println("Status: " + status);
	}
}

// Subclass 1: Credit Card Payment
class CreditCardPayment extends Payment {
	String cardNumber;
	String cardHolderName;
	String expiryDate;
	String bankName;
	String cardType;

	CreditCardPayment() {
		super();
		this.cardNumber = "XXXX-XXXX-XXXX-1234";
		this.cardHolderName = "Rahul Sharma";
		this.expiryDate = "12/27";
		this.bankName = "HDFC Bank";
		this.cardType = "Visa";
	}

	CreditCardPayment(String paymentId, String payerName, double amount, String date, String status, String cardNumber,
			String cardHolderName, String expiryDate, String bankName, String cardType) {
		super(paymentId, payerName, amount, date, status);
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.bankName = bankName;
		this.cardType = cardType;
	}

	String getCardNumber() {
		return cardNumber;
	}

	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	String getCardHolderName() {
		return cardHolderName;
	}

	void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	String getExpiryDate() {
		return expiryDate;
	}

	void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	String getBankName() {
		return bankName;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	String getCardType() {
		return cardType;
	}

	void setCardType(String cardType) {
		this.cardType = cardType;
	}

	void display() {
		super.display();
		System.out.println("Card Number: " + cardNumber);
		System.out.println("Card Holder: " + cardHolderName);
		System.out.println("Expiry Date: " + expiryDate);
		System.out.println("Bank: " + bankName);
		System.out.println("Card Type: " + cardType);
	}
}

// Subclass 2: UPI Payment
class UpiPayment extends Payment {
	String upiId;
	String appUsed;
	String transactionRef;
	String mobileNumber;
	String bankName;

	UpiPayment() {
		super();
		this.upiId = "rahul@okaxis";
		this.appUsed = "Google Pay";
		this.transactionRef = "TXN2025111001";
		this.mobileNumber = "9876543210";
		this.bankName = "Axis Bank";
	}

	UpiPayment(String paymentId, String payerName, double amount, String date, String status, String upiId,
			String appUsed, String transactionRef, String mobileNumber, String bankName) {
		super(paymentId, payerName, amount, date, status);
		this.upiId = upiId;
		this.appUsed = appUsed;
		this.transactionRef = transactionRef;
		this.mobileNumber = mobileNumber;
		this.bankName = bankName;
	}

	void display() {
		super.display();
		System.out.println("UPI ID: " + upiId);
		System.out.println("App Used: " + appUsed);
		System.out.println("Transaction Ref: " + transactionRef);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Bank Name: " + bankName);
	}
}

// Subclass 3: NetBanking Payment
class NetBankingPayment extends Payment {
	String bankName;
	String accountNumber;
	String ifscCode;
	String transactionId;
	String loginId;

	NetBankingPayment() {
		super();
		this.bankName = "State Bank of India";
		this.accountNumber = "SBIN123456";
		this.ifscCode = "SBIN0000456";
		this.transactionId = "NB12345TXN";
		this.loginId = "rahul.sbi";
	}

	NetBankingPayment(String paymentId, String payerName, double amount, String date, String status, String bankName,
			String accountNumber, String ifscCode, String transactionId, String loginId) {
		super(paymentId, payerName, amount, date, status);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.transactionId = transactionId;
		this.loginId = loginId;
	}

	String getBankName() {
		return bankName;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	String getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getIfscCode() {
		return ifscCode;
	}

	void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	String getTransactionId() {
		return transactionId;
	}

	void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	String getLoginId() {
		return loginId;
	}

	void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	void display() {
		super.display();
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("IFSC Code: " + ifscCode);
		System.out.println("Transaction ID: " + transactionId);
		System.out.println("Login ID: " + loginId);
	}
}

// Test Class
class TestPayment {
	public static void main(String[] args) {
		CreditCardPayment c1 = new CreditCardPayment();
		c1.display();
		System.out.println();

		UpiPayment u1 = new UpiPayment();
		u1.display();
		System.out.println();

		NetBankingPayment n1 = new NetBankingPayment();
		n1.display();
	}
}
