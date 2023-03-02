package StringArrayExercise;

public class stringArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] daysArray = {"Lunes","Martes","Miercoles",
							  "Jueves","Viernes","Sabado",
							  "Domingo"};
		stringManipulatorClass MyStringArray = new stringManipulatorClass(daysArray);

		MyStringArray.largerString();

		MyStringArray.printBackward();
	}

}
