package services;

import exceptions.*;
import models.*;

public class LibraryService {
    
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    // Borrow a book for a member
    public void borrowBook(String isbn, int memberId) throws Exception {
        try {
            Member member = findMemberById(memberId);
            library.borrowBook(isbn, member);
            System.out.println("Book borrowed successfully by member: " + member.getName());
        } catch (BookNotAvailableException | MemberNotFoundException | BookAlreadyBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }

    // Return a book for a member
    public void returnBook(String isbn, int memberId) throws Exception {
        try {
            Member member = findMemberById(memberId);
            library.returnBook(isbn, member);
            System.out.println("Book returned successfully by member: " + member.getName());
        } catch (BookNotAvailableException | MemberNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Find member by ID (throws exception if not found)
    private Member findMemberById(int memberId) throws MemberNotFoundException {
        for (Member member : library.getMembers()) {
            if (member.getMemid() == memberId) {
                return member;
            }
        }
        throw new MemberNotFoundException("Member with ID " + memberId + " not found.");
    }

    // Print library statistics
    public void printStatistics() {
        System.out.println("\nLibrary Statistics:");

        int totalBooks = library.getBooks().size();
        System.out.println("Total books: " + totalBooks);

        long availableBooks = library.getBooks().values().stream()
            .filter(book -> !book.isAvailable())
            .count();
        System.out.println("Available books: " + availableBooks);

        long borrowedBooks = totalBooks - availableBooks;
        System.out.println("Borrowed books: " + borrowedBooks);

        int totalMembers = library.getTotalMembers();
        System.out.println("Total members: " + totalMembers);
    }
}
