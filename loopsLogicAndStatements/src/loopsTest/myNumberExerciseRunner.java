package loopsTest;

public class myNumberExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNumberExerciseClass number = new myNumberExerciseClass(4);
		
		number.isPrime();

		System.out.println(number.sumUpToN());

		System.out.println(number.sumOfDivisors());

		number.printNumberTriangle();

	}

}
