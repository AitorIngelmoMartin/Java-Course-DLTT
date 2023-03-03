package fanExample;

public class Fan {

	// Variables to represent the state
	private String mark;
	private Double radious;
	private String Color;

	private Boolean isOn;
	private byte speed; // goes from o to 5

	// Creation of the object
	Fan(String fanMark, Double fanRadious, String fanColor) {
		this.mark = fanMark;
		this.radious = fanRadious;
		this.Color = fanColor;

	}

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// Print the state
	public String toString() {
		return String.format("Mark - %s, Radious - %f, Color - %s , isOn - %b, Speed - %d", mark, radious,
				Color, isOn, speed);
	}
}
