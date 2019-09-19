package main;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if (n == 0) {
            System.out.println("N/A");
        } else {
            Book[] books = new Book[n];
            s.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String book = s.nextLine().trim();
                String author = s.nextLine().trim();
                String isbn = s.nextLine().trim();
                books[i] = new Book(book, author, isbn);
            }
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
    }
        s.close();


}


class Book {
    private String book;
    private String author;
    private String isbn;

    public Book(String book, String author, String isbn) {
        this.book = book;
        this.author = author;
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

    }
}

}
