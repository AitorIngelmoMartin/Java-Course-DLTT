package loopsTest;

public class myNumberExerciseClass {
	private int Number;

	myNumberExerciseClass(int number) {
		this.Number = number;
	}

	public int sumUpToN() {
		int suma = 0;
		for (int i = 1; i <= this.Number; i++) {
			suma = suma + i;
		}
		return suma;
	}

	public int sumOfDivisors() {
		int suma = 0;
		for (int i = 1; i <= this.Number; i++) {
			if (this.Number % i == 0) {
				suma = suma + i;
			}
		}
		return suma;
	}

	void printNumberTriangle() {
		for (int i = 1; i <= this.Number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
	}
	void isPrime() {
		if (this.Number < 2) {
			System.out.println("El número introducido no es primo");
		} else {
			for (int i = 2; i <= (this.Number - 1); i++) {

				if (this.Number % i == 0) {
					System.out.println("El número introducido no es primo");
					return;
				}


			}
			System.out.println("El número introducido es primo");

		}

	}

}

