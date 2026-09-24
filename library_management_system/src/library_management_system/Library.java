package library_management_system;

import java.util.*;

public class Library {
	private List<Book> books = new ArrayList<>();
	private List<IssueRecord> records = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully!");
	}

	public void viewBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in library.");
		} else {
			books.forEach(System.out::println);
		}
	}

	public Book searchBookById(int id) {
		return books.stream().filter(b -> b.getBookId() == id).findFirst().orElse(null);
	}

	public Book searchBookByTitle(String title) {
		return books.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
	}

	public void issueBook(int bookId, User user) {
		Book book = searchBookById(bookId);
		if (book != null && book.isAvailable()) {
			book.setAvailable(false);
			IssueRecord record = new IssueRecord(book, user);
			records.add(record);
			System.out.println("Book issued to " + user.getName());
		} else {
			System.out.println("Book not available.");
		}
	}

	public void returnBook(int bookId) {
		for (IssueRecord record : records) {
			if (record.getBook().getBookId() == bookId && record.getReturnDate() == null) {
				record.markReturned();
				System.out.println("Book returned successfully!");
				return;
			}
		}
		System.out.println("No active issue record found for this book.");
	}

	public void removeBook(int id) {
		Book book = searchBookById(id);
		if (book != null) {
			books.remove(book);
			System.out.println("Book removed successfully!");
		} else {
			System.out.println("Book not found.");
		}
	}

	public void viewIssueRecords() {
		if (records.isEmpty()) {
			System.out.println("No issue records.");
		} else {
			records.forEach(System.out::println);
		}
	}
}
