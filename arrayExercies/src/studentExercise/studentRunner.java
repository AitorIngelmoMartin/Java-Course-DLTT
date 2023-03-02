package studentExercise;

public class studentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 5, 3, 9, 2, 7 };
		Student student = new Student("Javier", marks);

		System.out.println(student.getNumberOfMarks());

		System.out.println(student.getTotalSumOfMarks());

		System.out.println(student.getMaximunMarks());

		System.out.println(student.getMinimunMarks());

		System.out.println(student.getAverageMark());

		System.out.println("");
		student.addNewMark(6);

		System.out.println("");
		student.removeIndexMark(4);

	}

}
