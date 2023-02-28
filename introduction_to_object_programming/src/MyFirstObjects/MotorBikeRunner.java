package MyFirstObjects;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(50);
		MotorBike honda = new MotorBike(100);
		MotorBike yamaha = new MotorBike();

		ducati.start();
		honda.start();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(yamaha.getSpeed());

		ducati.increaseSpeed(45);
		honda.increaseSpeed(60);

		ducati.decreaseSpeed(50);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());


	}
	

}
