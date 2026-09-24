package library_management_system;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		this.isAvailable = available;
	}

	@Override
	public String toString() {
		return bookId + " - " + title + " by " + author + " [" + (isAvailable ? "Available" : "Issued") + "]";
	}
}
