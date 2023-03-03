package BookReviewsExercise;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book MyBook = new Book(23, "La compañia negra: Juego de sombras", "Gleen Cook");

		Review MyBookReview = new Review(36, "What a good book. I like it!", 8.0);

		MyBook.addReview(MyBookReview);
		System.out.println(MyBook);

		Review OtherReview = new Review(23, "Good fantasy book. I recomend it!", 7.8);
		MyBook.addReview(OtherReview);
		System.out.println(MyBook);
	}

}
