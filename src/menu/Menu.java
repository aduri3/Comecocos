package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import tablero.Tablero;
/**
 * Clase Menu
 *
 * Contiene el menu de comecoco
 *
 * @version 1.0
 */
public class Menu {
	// Atributos

	/**
	 * Valor de menu
	 **/
	private String menu;
	/**
	 * Metodo constructor que inicializa el menu
	 * 
	 * @param Valor de menu
	 */
	public Menu() {
		this.menu = "";
	}
	/**
	 * Metodo que muestra el menu por pantalla y recibe una tecla
	 * 
	 * @param tec es el Scanner que recibira una j para empezar
	 * @param logo Contiene el texto de PACMAN
	 * @param dibujo Contiene un dibujo en ASCI 
	 * @param tecla Almacena la tecla pulsada
	 */
	
	public void mostrar() {
		Scanner tec = new Scanner(System.in);
		String logo = "       _ __   __ _  ___ _ __ ___   __ _ _ __  \n"
					+ "      | '_ \\ / _` |/ __| '_ ` _ \\ / _` | '_ \\ \n"
					+ "      | |_) | (_| | (__| | | | | | (_| | | | |\n"
					+ "      | .__/ \\__,_|\\___|_| |_| |_|\\__,_|_| |_|\n"
					+ "      | |                                     \n" 
					+ "      |_|        ";
		String dibujo = "__________________|      |________________________\n"
					+ "     ,--.    ,--.          ,--.   ,--.\n" + "    |oo  | _  \\  `.       | oo | |  oo|\n"
					+ "o  o|~~  |(_) /   ;       | ~~ | |  ~~|o  o  o  o  \n"
					+ "    |/\\/\\|   '._,'        |/\\/\\| |/\\/\\|\n"
					+ "__________________        ________________________\n" + "                  |      |";
		String tecla;
		System.out.println(logo);
		System.out.println(dibujo);
		System.out.println();
		System.out.println("Presiona la tecla J para continuar....");
		do {
			tecla = tec.nextLine();
		} while (!tecla.equalsIgnoreCase("j"));
		menuOpciones();
	}
	public void menuOpciones() {
		// Escaner para elegir una opci�n
		Scanner opc = new Scanner(System.in);
		// Escanner para elegir el numero de jugadores
		Scanner jug = new Scanner(System.in);
		int jugadores = 0;
		boolean corr = true;
		Tablero tab = new Tablero();
		int opcion = 0;
		// Validación de opciones
		do {
			corr = true;
			System.out.println("(1) Seleccionar jugadores[2-4].");
			System.out.println("(2) ¡Jugar!");
			System.out.println("(3) ¿Como se juega?");
			System.out.println("(4) Salir");
			try {
				opcion = opc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce una opción valida (1-4)");
				corr = false;
				opc = new Scanner(System.in);
				System.out.println();
			}
		} while ((opcion < 1 || opcion > 4) || !corr);
		switch (opcion) {
		case 1:
			// Validación de de número de jugadores
			do {
				corr = true;
				System.out.println("¿Cuantos jugadores quereis jugar?");
				System.out.println("(1) 2 Jugadores");
				System.out.println("(2) 3 Jugadores");
				System.out.println("(3) 4 Jugadores");
				try {
					jugadores = jug.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Introduce una opción valida (1-3)");
					corr = false;
					jug = new Scanner(System.in);
					System.out.println();
				}
			} while ((jugadores < 1 || jugadores > 3) || !corr);

			break;
		case 2:
			tab.creaTablero();
			break;
		case 3:
			;
			break;
		case 4:
			;
			break;

		}
	}
}
