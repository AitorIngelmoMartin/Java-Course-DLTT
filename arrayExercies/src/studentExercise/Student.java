package studentExercise;


public class Student {
	public int[] ListOfMarks;
	public String StudentName;

	Student(String name, int... listOfMarks) {
		this.ListOfMarks = listOfMarks;
		this.StudentName = name;
	}

	int getNumberOfMarks() {
		return this.ListOfMarks.length;
	}

	int getMaximunMarks() {
		int maxValue = this.ListOfMarks[0];
		for(int mark:this.ListOfMarks) {
			if (maxValue <= mark) {
				maxValue = mark;
			}
		}
		return maxValue;
	}

	int getMinimunMarks() {
		int minValue = this.ListOfMarks[0];
		for (int mark : this.ListOfMarks) {
			if (minValue >= mark) {
				minValue = mark;
			}
		}
		return minValue;
	}

	int getTotalSumOfMarks() {
		int sumatory = 0;
		for (int marks : this.ListOfMarks) {
			sumatory += marks;
		}
		return sumatory;
	}

	int getAverageMark() {
		int sumOfMarks = getTotalSumOfMarks();
		int numOfMarks = getNumberOfMarks();
		return sumOfMarks / numOfMarks;
	}

	void addNewMark(int newMark) {

		int numberOfMarks = getNumberOfMarks();
		int[] newArray = new int[numberOfMarks + 1];

		for (int i = 0; numberOfMarks > i; i++) {
			newArray[i] = this.ListOfMarks[i];
		}
		newArray[numberOfMarks] = newMark;
		this.ListOfMarks = newArray;
		printAllMarks();
	}

	void removeIndexMark(int index) {
		int numberOfMarks = getNumberOfMarks();
		int[] newArray = new int[numberOfMarks - 1];
		for (int i = 0; index > i; i++) {
			newArray[i] = this.ListOfMarks[i];
		}
		for (int i = index; (numberOfMarks - 1) > i; i++) {
			newArray[i] = this.ListOfMarks[i + 1];
		}
		this.ListOfMarks = newArray;
		printAllMarks();
	}

	void printAllMarks() {
		for (int mark : this.ListOfMarks) {
			System.out.println(mark);
		}
	}
}
