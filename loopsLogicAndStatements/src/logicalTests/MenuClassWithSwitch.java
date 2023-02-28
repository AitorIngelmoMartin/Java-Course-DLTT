package logicalTests;

import java.util.Scanner;

public class MenuClassWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio programa \n");
		Scanner inputScanner = new Scanner(System.in);

		System.out.print("Introduce el primer número:");
		int number1 = inputScanner.nextInt();
		System.out.print("Introduce el segundo número:");
		int number2 = inputScanner.nextInt();

		System.out.println("Menú: \n");
		System.out.println("Sumarlos: 1 ");
		System.out.println("Multiplicarlos: 2 ");
		System.out.println("Dividirlos: 3 ");
		System.out.println("Restarlos: 4 ");
		System.out.println("\nSalir: 5 \n");

		System.out.print("Seleccione una opción: ");
		int opcion = inputScanner.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("La suma de los dos números es: " + (number1 + number2));
			break;
		case 2:
			System.out.println("La multiplicación de los dos números es: " + (number1 * number2));
			break;
		case 3:
			System.out.println("La división de los dos números es: " + (number1 / number2));
			break;
		case 4:
			System.out.println("La resta de los dos números es: " + (number1 - number2));
			break;
		default:
			System.out.println("Exit...");
		}
		
	}

}
