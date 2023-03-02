package MyBooks;

public class MyBooksRunner {

	public static void main(String[] args) {

		BookClass ArtOfComputerProgramming = new BookClass(1000);
		BookClass EffectiveJava = new BookClass(1000);
		BookClass CleanCode = new BookClass(50);

		ArtOfComputerProgramming.test();
		EffectiveJava.test();
		CleanCode.test();

		CleanCode.stockAviability();

		CleanCode.decreaseStock(89);
		CleanCode.stockAviability();

		CleanCode.increaseStock(94);
		CleanCode.stockAviability();
	}

}
