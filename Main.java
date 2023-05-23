import src.Book;
import src.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean mainRun = true;
        Scanner scanner = new Scanner(System.in);
        int choice ;
        System.out.println("                Welcome to the Library              ");
        while (mainRun) {
            System.out.println("choose one of the bellow option");
            System.out.println("1) Add a Book");
            System.out.println("2) Search a Book");
            System.out.println("3) Checkout a Book");
            System.out.println("4) Return a Book");
            System.out.println("5) Quit the Library");
            System.out.print("your option: ");
            choice = scanner.nextInt();
            System.out.println(" ");
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    String title, author, genre;
                    System.out.println("Adding a Book");
                    System.out.print("    enter the title of the book: ");
                    title = scanner.nextLine();
                    System.out.print("    enter the author of the book: ");
                    author = scanner.nextLine();
                    System.out.print("    enter the genre of the book: ");
                    genre = scanner.nextLine();
                    library.addBook(title, author, genre);
                    System.out.println("the book has been added successfully");
                }
                case 2 -> {
                    System.out.println("Select which method you want to use to search book:");
                    System.out.println("    1)Search By Title");
                    System.out.println("    2)Search By Author");
                    System.out.println("    press any other key to abort");
                    System.out.print("your option: ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    String search;
                    Book book;
                    if (choice == 1) {
                        System.out.println("searching by title");
                        System.out.print("    enter the book title: ");
                        search = scanner.nextLine();
                        book = library.searchBookByTitle(search);
                        if (book == null) {
                            System.out.println("the book your searching is not available");
                            System.out.println(" ");
                        } else {
                            System.out.println("The Book Title: " + book.getTitle());
                            System.out.println("The Book Author: " + book.getAuthor());
                            System.out.println("The Book Genre: " + book.getGenre());
                            System.out.println("The Book Availability: " + book.getAvailabilityStatus());

                        }
                    } else if (choice == 2) {
                        System.out.println("searching by author");
                        System.out.print("  enter the book author: ");
                        search = scanner.nextLine();
                        book = library.searchBookByAuthor(search);
                        if (book == null) {
                            System.out.println("the book your searching is not available");
                            System.out.println(" ");
                        } else {
                            System.out.println("The Book Title: " + book.getTitle());
                            System.out.println("The Book Author: " + book.getAuthor());
                            System.out.println("The Book Genre: " + book.getGenre());
                            System.out.println("The Book Availability: " + book.getAvailabilityStatus());
                        }
                    }
                }
                case 3 -> {
                    String title, author, genre;
                    int result;
                    System.out.println(" ");
                    System.out.println("Checkout a book");
                    System.out.print("    enter the title of the book: ");
                    title = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("    enter the author of the book: ");
                    author = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("    enter the genre of the book: ");
                    genre = scanner.nextLine();
                    result = library.checkOutBook(new Book(title, author, genre));
                    System.out.println(" ");
                    if (result==1) {
                        System.out.println("have a nice reading Sir");
                    } else if (result==0){
                        System.out.println("we're sorry but the book is unavailable for checkout");
                    }else {
                        System.out.println("the book your looking for is not available in library");
                    }
                }
                case 4 -> {
                    String title, author, genre;
                    int result;
                    System.out.println(" ");
                    System.out.println("Returning a book");
                    System.out.print("    enter the title of the book");
                    title = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("    enter the author of the book");
                    author = scanner.nextLine();
                    System.out.println(" ");
                    System.out.print("    enter the genre of the book");
                    genre = scanner.nextLine();
                    result = library.returnBook(new Book(title, author, genre));
                    System.out.println(" ");
                    if (result==1) {
                        System.out.println("thank you sir ,have a nice reading");
                    } else if (result==0){
                        System.out.println("the book is not our copy ,you may donate it if you don't need it");
                    }else {
                        System.out.println("the book your looking for is not available in library");
                    }
                }
                case 5 -> {
                    System.out.println("Are you sure you want to quite (yes/press any key)?");
                    String answer = scanner.nextLine();
                    if (answer.equals("yes"))
                        mainRun = false;
                }
                default ->
                    System.out.println("Please select a valid option");
            }

        }
    }
}
