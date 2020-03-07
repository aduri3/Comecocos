package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import jugadores.Jugador;
import tablero.Tablero;

/**
 * Clase Menu
 *
 * Contiene el menu de comecoco
 *
 * @version 1.0
 * @author Dani Kuradchyk
 */
public class Menu {
	// Atributos



	private static int maxJug=1;
	/**
	 * Metodo constructor que inicializa el menu
	 * 
	 * @param Valor de menu
	 */
	public Menu() {
	}

	/**
	 * Metodo que muestra el menu por pantalla y recibe una tecla
	 * 
	 * @param tec    es el Scanner que recibira una j para empezar
	 * @param logo   Contiene el texto de PACMAN
	 * @param dibujo Contiene un dibujo en ASCI
	 * @param tecla  Almacena la tecla pulsada
	 */

	public void mostrar() {
		Scanner tec = new Scanner(System.in);
		String logo = "       _ __   __ _  ___ _ __ ___   __ _ _ __  \n"
				+ "      | '_ \\ / _` |/ __| '_ ` _ \\ / _` | '_ \\ \n"
				+ "      | |_) | (_| | (__| | | | | | (_| | | | |\n"
				+ "      | .__/ \\__,_|\\___|_| |_| |_|\\__,_|_| |_|\n"
				+ "      | |                                     \n" + "      |_|        ";
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
	public static int getMaxJug() {
		return maxJug;
	}
	/**
	 * Metodo que muestra el menu de opciones por pantalla y recibe un numero del
	 * 1-3 para seleccionar una opcion, selecciona el numero de jugadores y crea los
	 * jugadores que van a jugar
	 * 
	 * 
	 * @param opc       es el Scanner que recibira un numero para seleccionar una
	 *                  opcion
	 * @param jug       es el Scanner que recibira un numero para seleccionar el
	 *                  numero de jugadores
	 * @param jugadores Almacena la variable de jug
	 * @param corr      Es una variable que servira para la validacion de los campos
	 * @param tab       Crea un nuevo tablero
	 * @param opcion    Almacena el valor de la variable opc
	 * @param jugSel    Te dice si se ha elegido al numero de jugadores o no
	 */
	private void menuOpciones() {
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
			System.out.println("(1) Seleccionar jugadores[2-4].");
			System.out.println("(2) Jugar!");
			System.out.println("(3) Como se juega?");
			System.out.println("(4) Salir");
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
			menuImplementarJugadores();
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
	private void menuImplementarJugadores() {
		
	}
}
