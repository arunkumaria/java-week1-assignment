package java_collections_challenge;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayListChallenge listChallenge = new ArrayListChallenge(sc);
		HashMapChallenge mapChallenge = new HashMapChallenge(sc);
		QueueChallenge queueChallenge = new QueueChallenge(sc);

		while (true) {
			System.out.println("===== Java Collections Challenge =====");
			System.out.println("1. ArrayList Challenge");
			System.out.println("2. HashMap Challenge");
			System.out.println("3. Queue Challenge");
			System.out.println("4. Exit");

			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				listChallenge.start();
				break;
			case 2:
				mapChallenge.start();
				break;
			case 3:
				queueChallenge.start();
				break;
			case 4:
				System.out.println("Exiting... Goodbye!");
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
