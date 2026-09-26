package java_collections_challenge;

import java.util.Scanner;

public class InputHandler {
	private Scanner sc;

	public InputHandler() {
		sc = new Scanner(System.in);
	}

	public int getInt(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid number, try again.");
			}
		}
	}

	public String getString(String prompt) {
		System.out.print(prompt);
		return sc.nextLine();
	}
}
