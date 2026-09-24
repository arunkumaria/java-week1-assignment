package banking_application;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private int accountId;
	private String holderName;
	private double balance;
	private int pin;
	private static final double MIN_BALANCE = 1000.0;
	private List<Transaction> transactions;

	public BankAccount(int accountId, String holderName, double initialBalance, int pin) {
		if (initialBalance < MIN_BALANCE) {
			throw new IllegalArgumentException("Initial balance must be at least " + MIN_BALANCE);
		}
		this.accountId = accountId;
		this.holderName = holderName;
		this.balance = initialBalance;
		this.pin = pin;
		this.transactions = new ArrayList<>();
	}

	public int getAccountId() {
		return accountId;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getBalance() {
		return balance;
	}

	public boolean verifyPin(int enteredPin) {
		return this.pin == enteredPin;
	}

	public void deposit(double amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Deposit amount must be positive.");
		balance += amount;
		transactions.add(new Transaction("Deposit", amount));
		System.out.println("Deposited:" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("Withdrawal amount must be positive.");
		if (amount > balance - MIN_BALANCE) {
			throw new IllegalArgumentException(
					"Cannot withdraw. Minimum balance of " + MIN_BALANCE + " must be maintained.");
		}
		balance -= amount;
		transactions.add(new Transaction("Withdraw", amount));
		System.out.println("Withdrawn:" + amount);
	}

	public void printTransactions() {
		if (transactions.isEmpty()) {
			System.out.println("No transactions yet.");
		} else {
			transactions.forEach(System.out::println);
		}
	}
}
