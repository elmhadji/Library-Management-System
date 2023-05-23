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

    public int checkOutBook(Book book1) {
        // 1 book can be checkout ,0 book can't be checkout ,-1 book is not in the library
        int result = -1;
        for (Book book : books) {
            if (book.equals(book1)) {
                if (book.availabilityStatus) {
                    book.changeAvailabilityStatus();
                    result = 1;
                    break;
                } else {
                    result = 0;
                    break;
                }
            }
        }
        return result;
    }

    public int returnBook(Book book1) {
        // 1 book can be return ,0 book isn't ours copy   ,-1 if book is not in the library
        int result = -1;
        for (Book book : books) {
            if (book.equals(book1)) {
                if (!book.availabilityStatus) {
                    book.changeAvailabilityStatus();
                    result = 1;
                    break;
                } else {
                    result = 0;
                }
            }
        }
        return result;
    }
}
