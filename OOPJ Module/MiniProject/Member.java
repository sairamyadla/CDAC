package models;

import java.util.List;

public class Member{
	private String name;
	private int memid;
	private List<Book> borrowedBooks;
	
	public String getName() {
		return name;
	}
	
	public int getMemid() {
		return memid;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public void borrowBook(Book book) throws Exception {
		if(book.isAvailable()) {
			throw new Exception("Book is already borrowed");
		}
		book.borrowBook();
		borrowedBooks.add(book);
		
	}
	public void returnBook(Book book) throws Exception {
        if (!borrowedBooks.contains(book)) {
            throw new Exception("Book not borrowed by this member.");
        }
        book.returnBook();
        borrowedBooks.remove(book);
    }
	@Override
    public String toString() {
        return "Member{" + "Name=" + name + ", ID='" + memid + '\'' + ", Borrowed Books=" + borrowedBooks.size() + '}';
    }

	
}
