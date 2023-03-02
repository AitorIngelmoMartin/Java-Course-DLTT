package studentExerciseWithArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
	private ArrayList<Integer> ListOfMarks = new ArrayList<Integer>();
	private String StudentName;

	StudentArrayList(String name, int... listOfMarks) {
		for (int mark : listOfMarks) {
			this.ListOfMarks.add(mark);
		}
		this.StudentName = name;
	}

	void loadStudentProfile() {
		System.out.print("Perfil del alumno: " + this.StudentName + "\n");

		System.out.print("	Numero total de notas :" + getNumberOfMarks() + "\n");
		System.out.print("	Nota mas alta: " + getMaximunMarks() + "\n");
		System.out.print("	Nota mas baja: " + getMinimunMarks() + "\n");
		System.out.print("	Suma de todas sus notas: " + getTotalSumOfMarks() + "\n");
		System.out.print("	Nota media: " + getAverageMark() + "\n");
	}

	int getNumberOfMarks() {
		return this.ListOfMarks.size();
	}

	int getMaximunMarks() {
		return Collections.max(this.ListOfMarks);
	}

	int getMinimunMarks() {
		return Collections.min(this.ListOfMarks);
	}

	int getTotalSumOfMarks() {
		int sumatory = 0;
		for (int marks : this.ListOfMarks) {
			sumatory += marks;
		}
		return sumatory;
	}

	public BigDecimal getAverageMark() {
		int sumOfMarks = getTotalSumOfMarks();
		int numOfMarks = getNumberOfMarks();
		return new BigDecimal(sumOfMarks).divide(new BigDecimal(numOfMarks), 3, RoundingMode.CEILING);
	}

	void addNewMark(int newMark) {
		this.ListOfMarks.add(newMark);
		printAllMarks();
	}

	void removeIndexMark(int index) {
		this.ListOfMarks.remove(index);
		printAllMarks();
	}

	void printAllMarks() {
		for (int mark : this.ListOfMarks) {
			System.out.println(mark);
		}
	}
}
