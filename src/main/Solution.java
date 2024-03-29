package main;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
}

