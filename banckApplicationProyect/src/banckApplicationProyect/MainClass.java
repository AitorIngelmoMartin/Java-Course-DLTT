package banckApplicationProyect;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	static ArrayList<usuario> ListOfUsers = new ArrayList<usuario>();
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		mainMenu();
		// Cliente PrimerCliente = new Cliente("AitorIngelmoMartin");
		// PrimerCliente.loadMenu();
	}

	private static void mainMenu() {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Bienvenido al banco central.");
		System.out.println("");
		
		System.out.println("LISTA DE OPERACIONES: \n");
		System.out.println("	Iniciar sesión: 1 ");
		System.out.println("	Registrarse: 2 ");
		System.out.println("	Salir: 3 ");
		System.out.println("Introduzca la operación deseada: ");
		int opcion = inputScanner.nextInt();

		switch (opcion) {
		case 1:
			if (ListOfUsers.size() < 0) {
				System.out.println("NO HAY USUARIOS REGISTRADOS");
				break;
			} else {
				System.out.println("Introduzca su numero de cuenta: ");
				int idScanner = inputScanner.nextInt();
				ListOfUsers.indexOf(idScanner);
			}
			break;
		case 2:

			break;
		case 3:

			break;
		}

	}
}
