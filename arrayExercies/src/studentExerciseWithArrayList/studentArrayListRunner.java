package studentExerciseWithArrayList;

public class studentArrayListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 4, 3, 7 };
		StudentArrayList student = new StudentArrayList("Javier", marks);

		student.loadStudentProfile();

		System.out.println("");
		student.addNewMark(6);

		System.out.println("");
		student.removeIndexMark(4);

	}

}
