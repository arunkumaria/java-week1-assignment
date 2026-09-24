package library_management_system;

import java.time.LocalDate;

public class IssueRecord {
    private Book book;
    private User user;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public IssueRecord(Book book, User user) {
        this.book = book;
        this.user = user;
        this.issueDate = LocalDate.now();
    }

    public Book getBook() { return book; }
    public User getUser() { return user; }
    public LocalDate getIssueDate() { return issueDate; }
    public LocalDate getReturnDate() { return returnDate; }

    public void markReturned() {
        this.returnDate = LocalDate.now();
        book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Book: " + book.getTitle() + ", User: " + user.getName() +
               ", Issued: " + issueDate +
               (returnDate != null ? ", Returned: " + returnDate : ", Not yet returned");
    }
}

