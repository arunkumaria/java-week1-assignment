package java_collections_challenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueChallenge {
	private Queue<String> queue = new LinkedList<>();
	private Scanner sc;

	public QueueChallenge(Scanner sc) {
		this.sc = sc;
	}

	public void start() {
		while (true) {
			System.out.println("=== Queue Challenge ===");
			System.out.println("1. Add Item");
			System.out.println("2. Remove Item");
			System.out.println("3. Peek Front");
			System.out.println("4. Display Queue");
			System.out.println("5. Back to Main Menu");

			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter item to add:");
				queue.add(sc.nextLine());
				break;
			case 2:
				String removed = queue.poll();
				System.out.println(removed != null ? "Removed: " + removed : "Queue empty.");
				break;
			case 3:
				String front = queue.peek();
				System.out.println(front != null ? "Front: " + front : "Queue empty.");
				break;
			case 4:
				System.out.println("Queue:");
				for (String item : queue)
					System.out.println(item);
				break;
			case 5:
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
