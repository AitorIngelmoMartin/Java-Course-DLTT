package MoviesObjects;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieClass BabyDriver = new MovieClass();
		MovieClass Aladin = new MovieClass(2, 65, "Bill Murray");
		
		System.out.println(Aladin.getDirector());

		Aladin.increaseNoOfViews(70);
		System.out.println(Aladin.getNoOfViews());

		Aladin.decreaseNoOfViews(500);

		BabyDriver.setDirector("Jashon Statan");
		BabyDriver.setDuration(2);
		BabyDriver.setNoOfViews(503);

		Aladin.getInfo();

	}

}
