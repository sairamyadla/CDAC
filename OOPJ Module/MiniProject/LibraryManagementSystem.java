package ui;

import models.*;
import services.LibraryService;

import java.util.Scanner;

public class LibraryManagementSystem {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Library library = new Library();
        LibraryService libraryService = new LibraryService(library);

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display Borrowed Books");
            System.out.println("7. Print Library Statistics");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (option) {
                case 1:
                    addBook(library);
                    break;
                case 2:
                    addMember(library);
                    break;
                case 3:
                    borrowBook(libraryService);
                    break;
                case 4:
                    returnBook(libraryService);
                    break;
                case 5:
                    displayBooks(library);
                    break;
                case 6:
                    displayBorrowedBooks(library);
                    break;
                case 7:
                    libraryService.printStatistics();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addBook(Library library) {
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        Book book = new Book(author, title, isbn);
        library.addBook(book);
    }

    private static void addMember(Library library) {
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();

        Member member = new Member();
        library.addMember(member);
    }

    private static void borrowBook(LibraryService libraryService) throws Exception {
        System.out.print("Enter ISBN of the book to borrow: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();

        libraryService.borrowBook(isbn, memberId);
    }

    private static void returnBook(LibraryService libraryService) throws Exception {
        System.out.print("Enter ISBN of the book to return: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter member ID: ");
        int memberId = scanner.nextInt();

        libraryService.returnBook(isbn, memberId);
    }

    // Display all books in the library with their availability status
    private static void displayBooks(Library library) {
        System.out.println("\n--- List of All Books ---");
        if (library.getBooks().isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : library.getBooks().values()) {
                System.out.println(book + " | " + (book.isAvailable() ? "Borrowed" : "Available"));
            }
        }
    }

    // Display all borrowed books and the members who borrowed them
    private static void displayBorrowedBooks(Library library) {
        System.out.println("\n--- List of Borrowed Books ---");
        boolean anyBorrowed = false;

        for (Member member : library.getMembers()) {
            if (!member.getBorrowedBooks().isEmpty()) {
                anyBorrowed = true;
                System.out.println("\nMember: " + member.getName() + " (ID: " + member.getMemid() + ")");
                for (Book book : member.getBorrowedBooks()) {
                    System.out.println(" - " + book.getTitle() + " (ISBN: " + book.getIsbn() + ")");
                }
            }
        }

        if (!anyBorrowed) {
            System.out.println("No books are currently borrowed.");
        }
    }
}
