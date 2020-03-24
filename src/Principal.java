import java.util.InputMismatchException;
import java.util.Scanner;

import menu.Menu;
import tablero.Tablero;

public class Principal {

	public static void main(String[] args) {
		
		Menu men= new Menu();
		men.mostrar();
		// Escaner para elegir una opcion 
		Scanner opc = new Scanner(System.in);
		int jugadores = 0;
		boolean corr = true;
		boolean jugSel = false;
		Tablero tab = new Tablero(null, jugadores, null, null);
		int opcion = 0;
		// Validacion de opciones
		do {
			corr = true;
			System.out.println(men.menuOpciones());
			try {
				opcion = opc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce una opcion valida (1-4)");
				corr = false;
				opc = new Scanner(System.in);
				System.out.println();
			}
		} while ((opcion < 1 || opcion > 4) || !corr);
		switch (opcion) {
		case 1:
			men.menuImplementarJugadores();
			break;
		case 2:
			tab.jugar();
			break;
		case 3:
			// Manual.muestra();
			break;
		case 4:
			System.out.println("Has salido del Juego!");
			break;

		}

	}
	
}
