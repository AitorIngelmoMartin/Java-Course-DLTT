package fanExample;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Dynamo", 0.254, "Red");

		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 1);

		fan.switchOff();
		System.out.println(fan);

		fan.setSpeed((byte) 4);
		System.out.println(fan);
	}

}