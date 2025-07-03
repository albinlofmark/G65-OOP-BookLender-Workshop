package se.lexicon.model;

import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    private String id;
    private String title;
    private String author;
    private boolean available;

    private Person borrower;

    public Book(String title, String author) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this.id = generateID();
        setTitle(title);
        setAuthor(author);
        setBorrower(borrower);
        this.available = (borrower == null);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Person getBorrower() {
        return borrower;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        if(borrower == null) {
            available = true;
        } else {
            available = false;
        }
        this.borrower = borrower;
    }

    public String getBookInformation() {

        String borrowerInfo = (borrower != null) ? borrower.getPersonInformation(): "None";

        StringBuilder info = new StringBuilder();

        info.append("Book Info -> ID: ").append(id)
                .append(", Title: ").append(title)
                .append(", Author: ").append(author)
                .append(", Borrower: ").append(borrowerInfo)
                .append(", Available: ").append(available);

        return info.toString();
    }

    private static String generateID() {
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }
}