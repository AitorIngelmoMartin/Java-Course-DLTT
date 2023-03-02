package loopsTest;

public class whileLoopClass {
	public int Limit;
	public int Times;

	whileLoopClass(int inputNumber, int Times) {
		this.Limit = inputNumber;
		this.Times = Times;
	}

	whileLoopClass() {
		this.Limit = 30;
		this.Times = 2;
	}

	void printExponentsUpToLimit() {
		int iterationValue = 1;
		while (this.Limit > (exponentCalculator(iterationValue, this.Times))) {

			System.out.println(exponentCalculator(iterationValue, this.Times));
			iterationValue++;
		}
	}

	int exponentCalculator(int exponent, int times) {
		int exponencial = 1;
		for (int i = 1; times >= i; i++) {
			exponencial *= exponent;
		}
		return exponencial;
	}

}
