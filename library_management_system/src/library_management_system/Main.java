package library_management_system;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		InputHandler input = new InputHandler();

		while (true) {
			System.out.println("===== Library Management System =====");
			System.out.println("1. Add Book");
			System.out.println("2. View Books");
			System.out.println("3. Search Book");
			System.out.println("4. Issue Book");
			System.out.println("5. Return Book");
			System.out.println("6. Remove Book");
			System.out.println("7. View Issue Records");
			System.out.println("8. Exit");

			int choice = input.getInt("Enter your choice:");

			switch (choice) {
			case 1:
				int id = input.getInt("Enter Book ID:");
				String title = input.getString("Enter Title:");
				String author = input.getString("Enter Author:");
				library.addBook(new Book(id, title, author));
				break;

			case 2:
				library.viewBooks();
				break;

			case 3:
				int opt = input.getInt("Search by (1) ID or (2) Title:");
				if (opt == 1) {
					int searchId = input.getInt("Enter ID:");
					Book b = library.searchBookById(searchId);
					System.out.println(b != null ? b : "Book not found.");
				} else {
					String searchTitle = input.getString("Enter Title:");
					Book b = library.searchBookByTitle(searchTitle);
					System.out.println(b != null ? b : "Book not found.");
				}
				break;

			case 4:
				int issueId = input.getInt("Enter Book ID to issue:");
				int userId = input.getInt("Enter User ID:");
				String userName = input.getString("Enter User Name:");
				library.issueBook(issueId, new User(userId, userName));
				break;

			case 5:
				int returnId = input.getInt("Enter Book ID to return:");
				library.returnBook(returnId);
				break;

			case 6:
				int removeId = input.getInt("Enter Book ID to remove:");
				library.removeBook(removeId);
				break;

			case 7:
				library.viewIssueRecords();
				break;

			case 8:
				System.out.println("Exiting... Goodbye!");
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
