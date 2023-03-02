package StringArrayExercise;

public class stringManipulatorClass {

	private String[] stringArray;

	stringManipulatorClass(String... stringArray) {
		this.stringArray = stringArray;
	}

	void largerString() {
		String longestStringDay = "";

		for (String day : this.stringArray) {
			if (day.length() >= longestStringDay.length()) {
				longestStringDay = day;
			}
		}
		System.out.printf("The larger string is: " + longestStringDay).println();
	}

	void printBackward() {
		for (int i = (this.stringArray.length - 1); i >= 0; i--) {
			System.out.println(this.stringArray[i]);
		}

	}
}
