package models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import exceptions.*;

public class Library {
    private Map<String, Book> books;  
    private Set<Member> members;      

    public Library() {
        books = new HashMap<>();
        members = new HashSet<>();
    }

    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            System.out.println("Book with ISBN " + book.getIsbn() + " already exists.");
        } else {
            books.put(book.getIsbn(), book); 
            System.out.println("Book added: " + book.getTitle() +" by "+ book.getAuthor()+" with ISBN "+ book.getIsbn());
        }
    }


    public void addMember(Member member) {
        if (members.contains(member)) {
            System.out.println("Member with ID " + member.getMemid() + " already exists.");
        } else {
            members.add(member); 
            System.out.println("Member added: " + member.getName());
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        Iterator<Book> iterator = books.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }

    public Book searchBook(String isbn) throws BookNotAvailableException {
        if (books.containsKey(isbn)) {
            return books.get(isbn);
        } else {
            throw new BookNotAvailableException("Book with ISBN " + isbn + " is not available.");
        }
    }
    public Map<String, Book> getBooks() { 
    	return books; }
    
    public Set<Member> getMembers() { 
    	return members; }
    
    public int getTotalMembers() {
        return members.size();
    }

    public void borrowBook(String isbn, Member member) throws Exception {
        if (!members.contains(member)) {
            throw new MemberNotFoundException("Member with ID " + member.getMemid() + " not found.");
        }
        Book book = searchBook(isbn); 
        if (!book.isAvailable()) {
            throw new BookAlreadyBorrowedException("Book with ISBN " + isbn + " is already borrowed.");
        }
        member.borrowBook(book); 
        System.out.println("Book borrowed successfully.");
    }

    
    public void returnBook(String isbn, Member member) throws Exception {
        if (!members.contains(member)) {
            throw new MemberNotFoundException("Member with ID " + member.getMemid() + " not found.");
        }
        Book book = searchBook(isbn); 
        member.returnBook(book); 
        System.out.println("Book returned successfully.");
    }

    public void printAllMembers() {
        if (members.isEmpty()) {
            System.out.println("No members in the library.");
        } else {
            System.out.println("Members of the library:");
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }
}
