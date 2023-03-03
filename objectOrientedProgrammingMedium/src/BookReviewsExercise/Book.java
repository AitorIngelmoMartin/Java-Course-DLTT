package BookReviewsExercise;

import java.util.ArrayList;

public class Book {

	//
	private int bookId;
	private String bookTitle;
	private String author;

	//
	private ArrayList<Review> bookReviews = new ArrayList<>();

	Book(int bookId, String bookTitle, String author) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	public void addReview(Review bookReview) {
		bookReviews.add(bookReview);
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", bookReviews="
				+ bookReviews + "]";
	}

	// Geters & Seters
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}
