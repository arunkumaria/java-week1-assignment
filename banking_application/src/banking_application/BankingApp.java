package banking_application;

import java.util.*;

public class BankingApp {
	private Map<Integer, BankAccount> accounts;
	private Scanner sc;

	public BankingApp() {
		this.accounts = new HashMap<>();
		this.sc = new Scanner(System.in);
	}

	public void start() {
		while (true) {
			System.out.println("===== Banking Application =====");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance Inquiry");
			System.out.println("5. View Transactions");
			System.out.println("6. Exit");

			int choice = InputHandler.getInt(sc, "Enter your choice:");

			switch (choice) {
			case 1:
				createAccount();
				break;
			case 2:
				performDeposit();
				break;
			case 3:
				performWithdraw();
				break;
			case 4:
				performBalanceInquiry();
				break;
			case 5:
				performViewTransactions();
				break;
			case 6:
				System.out.println("Exiting... Goodbye!");
				return;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private void createAccount() {
		int id = InputHandler.getInt(sc, "Enter Account ID:");
		String name = InputHandler.getString(sc, "Enter Holder Name:");
		double initialBalance = InputHandler.getDouble(sc, "Enter Initial Balance:");
		int pin = InputHandler.getInt(sc, "Set PIN:");
		try {
			accounts.put(id, new BankAccount(id, name, initialBalance, pin));
			System.out.println("Account created successfully!");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private BankAccount authenticateAccount() {
		int id = InputHandler.getInt(sc, "Enter Account ID:");
		BankAccount acc = accounts.get(id);
		if (acc == null) {
			System.out.println("Account not found.");
			return null;
		}
		int pin = InputHandler.getInt(sc, "Enter PIN:");
		if (!acc.verifyPin(pin)) {
			System.out.println("Invalid PIN.");
			return null;
		}
		return acc;
	}

	private void performDeposit() {
		BankAccount acc = authenticateAccount();
		if (acc != null) {
			try {
				double amount = InputHandler.getDouble(sc, "Enter deposit amount:");
				acc.deposit(amount);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void performWithdraw() {
		BankAccount acc = authenticateAccount();
		if (acc != null) {
			try {
				double amount = InputHandler.getDouble(sc, "Enter withdrawal amount:");
				acc.withdraw(amount);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private void performBalanceInquiry() {
		BankAccount acc = authenticateAccount();
		if (acc != null) {
			System.out.println("Current Balance:" + acc.getBalance());
		}
	}

	private void performViewTransactions() {
		BankAccount acc = authenticateAccount();
		if (acc != null) {
			acc.printTransactions();
		}
	}
}
