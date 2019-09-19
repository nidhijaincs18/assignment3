package main;

public class Book {
    private String book;
    private String author;
    private String isbn;

    public Book(String book, String author, String isbn) {
        this.book = book;

        this.isbn = isbn;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("-----------------------------\n");
        result.append("Book Name:\t" + getBook() + "\nAuthor Name:\t" + getAuthor() + "\nISBN:\t" + getIsbn() + "\n");
        result.append("-----------------------------");
        return result.toString();

    }
}

