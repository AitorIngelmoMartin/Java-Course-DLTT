package MyFirstObjects;

public class MotorBike {

	// State
	private int speed; // Al ser privada, solo puedo aceder a ella
							// desde aqui.

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;

	}

	void start() {
		System.out.println("Bike started.");
	}

}
