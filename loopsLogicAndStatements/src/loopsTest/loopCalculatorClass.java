package loopsTest;

import java.util.Scanner;

public class loopCalculatorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Selecciona el número del cual quieres hacer la tabla:");
		int tableNumber = inputScanner.nextInt();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d", tableNumber, i, tableNumber * i).println();
		}

	}

}
