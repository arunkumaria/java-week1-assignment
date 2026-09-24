package banking_application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
	public static int getInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a numeric value.");
				sc.nextLine();
			}
		}
	}

	public static double getDouble(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			try {
				return sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a numeric value.");
				sc.nextLine();
			}
		}
	}

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
}
