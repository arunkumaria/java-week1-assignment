package java_collections_challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapChallenge {
	private HashMap<Integer, String> data = new HashMap<>();
	private Scanner sc;

	public HashMapChallenge(Scanner sc) {
		this.sc = sc;
	}

	public void start() {
		while (true) {
			System.out.println("=== HashMap Challenge ===");
			System.out.println("1. Insert Key-Value");
			System.out.println("2. Retrieve Value");
			System.out.println("3. Update Value");
			System.out.println("4. Check Key");
			System.out.println("5. Display Entries");
			System.out.println("6. Back to Main Menu");

			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter key:");
				int key = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter value:");
				data.put(key, sc.nextLine());
				break;
			case 2:
				System.out.print("Enter key:");
				key = sc.nextInt();
				sc.nextLine();
				System.out.println(data.getOrDefault(key, "Key not found."));
				break;
			case 3:
				System.out.print("Enter key:");
				key = sc.nextInt();
				sc.nextLine();
				if (data.containsKey(key)) {
					System.out.print("Enter new value:");
					data.put(key, sc.nextLine());
				} else {
					System.out.println("Key not found.");
				}
				break;
			case 4:
				System.out.print("Enter key:");
				key = sc.nextInt();
				sc.nextLine();
				System.out.println(data.containsKey(key) ? "Key exists." : "Key does not exist.");
				break;
			case 5:
				for (Map.Entry<Integer, String> entry : data.entrySet()) {
					System.out.println(entry.getKey() + " -> " + entry.getValue());
				}
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
