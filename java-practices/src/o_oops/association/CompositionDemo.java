package o_oops.association;

import java.util.ArrayList;
import java.util.List;

// Composition is an association that represents a part of a whole relationship where a part cannot exist without a whole.
// In composition, both entities are dependent on each other.
// It represents a part-of-relationship.

class Book {

	// Member variables of this class
	public String title;
	public String author;

	// Constructor of this class
	Book(String title, String author) {

		// This keyword refers top current instance
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

class Library {

	// Reference to refer to list of books.
	private final List<Book> books;

	// Constructor of this class

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getListOfBooksInLibrary() {
		return books;
	}

}

public class CompositionDemo {

	public static void main(String[] args) {

		// Creating the objects of class 1 (Book class)
		// inside main() method
		Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");

		// Creating the list which contains the
		// no. of books.
		List<Book> book = new ArrayList<Book>();

		// Adding books to List object
		// using standard add() method
		book.add(b1);
		book.add(b2);
		book.add(b3);

		// Creating an object of class 2
		Library library = new Library(book);

		// Calling method of class 2 and storing list of
		// books in List Here List is declared of type
		// Books(user-defined)
		List<Book> books = library.getListOfBooksInLibrary();

		// Iterating over for each loop
		for (Book bk : books) {

			// Print and display the title and author of
			// books inside List object
			System.out.println("Title : " + bk.title + " and " + " Author : " + bk.author);
		}
	}
}
