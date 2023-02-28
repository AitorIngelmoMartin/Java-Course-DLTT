package MoviesObjects;

public class MovieClass {

	private int NoOfViews;
	private int Duration;
	private String Director;

	MovieClass() {
		this(0, 0, "None");
	}

	MovieClass(int duration, int NoOfViews, String Director) {
		setNoOfViews(NoOfViews);
		setDuration(duration);
		setDirector(Director);
	}

	void getInfo() {
		System.out.println(getDuration());
		System.out.println(getNoOfViews());
		System.out.println(getDirector());
	}

	public int getDuration() {
		return this.Duration;
	}

	public void setDuration(int duration) {
		this.Duration = duration;
	}

	public String getDirector() {
		return this.Director;
	}

	public void setDirector(String director) {
		this.Director = director;
	}

	public int getNoOfViews() {
		return this.NoOfViews;
	}

	public void setNoOfViews(int noOfViews) {
		if (noOfViews >= 0)
			this.NoOfViews = noOfViews;
		else
			System.out.println("The new number of views is smaller than the original, thats not possible...");
	}

	void increaseNoOfViews(int howMuch) {
		setNoOfViews(this.NoOfViews + howMuch);

	}

	void decreaseNoOfViews(int howMuch) {
		setNoOfViews(this.NoOfViews - howMuch);

	}
}
