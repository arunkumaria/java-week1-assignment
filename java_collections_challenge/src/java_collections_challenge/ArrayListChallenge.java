package java_collections_challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {
	private ArrayList<String> items = new ArrayList<>();
	private InputHandler inputHandler = new InputHandler();
	private Scanner sc;

	public ArrayListChallenge(Scanner sc) {
		this.sc = sc;
	}

	public void start() {
		while (true) {
			System.out.println("=== ArrayList Challenge ===");
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Update Item");
			System.out.println("4. Search Item");
			System.out.println("5. Display Items");
			System.out.println("6. Back to Main Menu");

			int choice = inputHandler.getInt("Enter your choice:");

			switch (choice) {
			case 1:
				System.out.print("Enter item to add:");
				items.add(sc.nextLine());
				break;
			case 2:
				System.out.print("Enter item to remove:");
				items.remove(sc.nextLine());
				break;
			case 3:
				System.out.print("Enter index to update:");
				int idx = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter new item:");
				if (idx >= 0 && idx < items.size()) {
					items.set(idx, sc.nextLine());
				} else {
					System.out.println("Invalid index.");
				}
				break;
			case 4:
				System.out.print("Enter item to search:");
				String search = sc.nextLine();
				System.out.println(items.contains(search) ? "Found!" : "Not found.");
				break;
			case 5:
				System.out.println("Items:");
				for (String item : items)
					System.out.println(item);
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
