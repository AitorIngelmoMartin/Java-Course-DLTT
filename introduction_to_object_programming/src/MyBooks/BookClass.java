package MyBooks;

public class BookClass {

	private int NoOfCopies;

	// Constructor
	BookClass(int NoOfCopies) {
		this.NoOfCopies = NoOfCopies;
	}

	void setNoOfCopies(int NoOfCopies) {
		if (NoOfCopies > 0)
			this.NoOfCopies = NoOfCopies;
	}

	void getNoOfCopies() {
		System.out.println(this.NoOfCopies);
	}

	void test() {
		System.out.println("the test method works!");
	}

	public void increaseStock(int howMuch) {
		setNoOfCopies(this.NoOfCopies + howMuch);
	}

	public void decreaseStock(int howMuch) {
		if (this.NoOfCopies > howMuch)
			setNoOfCopies(this.NoOfCopies - howMuch);
		else
			System.out.println("The decrease is bigger than No of copies, thats not possible...");
	}

	public void stockAviability() {
		if (this.NoOfCopies > 0)
			System.out.printf("Currently in stock with: " + this.NoOfCopies + " copies").println();
		else
			System.out.println("Not in stock");
	}
}
