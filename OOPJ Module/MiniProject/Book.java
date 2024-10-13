package models;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author,String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = false; // Book is available when added
    }

    // Getters
    

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow book
    public void borrowBook() {
        this.isAvailable = true;
    }

    // Return book
    public void returnBook() {
        this.isAvailable = false;
    }

    @Override
    public String toString() {
        return "Book{Title='" + title + "', Author='" + author + "', ISBN='" + isbn + "', Available=" + !isAvailable + "}";
    }


		 public void borrowBook1() throws Exception {
		        if (isAvailable) throw new Exception("Book is already borrowed.");
		        this.isAvailable = true;
		    }

		    public void returnBook1() {
		        this.isAvailable = false;
		    }
	}


