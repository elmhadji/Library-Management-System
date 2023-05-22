package src;

import src.Book;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author, String genre) {
        Book book = new Book(title, author, genre);
        books.add(book);
    }

    public Book searchBookByTitle(String title) {
        Book result = null;
        for (Book book : books) {
            if (book.title.equals(title)) {
                result = book;
                break;
            }
        }
        return result;
    }

    public Book searchBookByAuthor(String author) {
        Book result = null;
        for (Book book : books) {
            if (book.author.equals(author)) {
                result = book;
                break;
            }
        }
        return result;
    }
    //TODO: fix this function not completed yet
/*
    public void checkOutBook(Book book1) {
        int result = -1; // 1 if book available ,2 if
        for (Book book : books) {
            if (book.equals(book1)) {
                if (book1.availabilityStatus) {
                    book1.changeAvailabilityStatus();
                    result = 1;
                    System.out.println("the book of " + book1.title + " have been returned thanks");
                } else {
                    System.out.println("the book of " + book1.title + " is already in Library and this copy isn't ours ");
                }
            } else {
                System.out.println("the book of " + book1.title + " does not belong to this Library");
            }
        }
    }

    public void returnBook(Book book1) {
        for (Book book : books) {
            if (book.equals(book1)) {
                if (!book1.availabilityStatus) {
                    book1.changeAvailabilityStatus();
                    System.out.println("the book of " + book1.title + " have been returned thanks");
                } else {
                    System.out.println("the book of " + book1.title + " is already in Library and this copy isn't ours ");
                }
            } else {
                System.out.println("the book of " + book1.title + " does not belong to this Library");
            }
        }
    }

 */
}
