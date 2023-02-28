package MyFirstObjects;

public class MotorBike {

	// State
	private int speed; // Al ser privada, solo puedo aceder a ella
							// desde aqui.
	// Default Constructor of the class

	MotorBike() {
		// This line calls the other constructor
		this(25);
	}

	// Constructor of the class
	MotorBike(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;

	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike started.");
	}

}
