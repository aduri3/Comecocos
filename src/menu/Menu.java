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

	/**
	 * Metodo que muestra el menu de opciones por pantalla y recibe un numero del
	 * 1-4 para seleccionar una opcion.
	 * 
	 * @return
	 */
	public String menuOpciones() {
		return "(1) Seleccionar jugadores[2-4].\n" + "(2) Jugar!\n" + "(3) Como se juega?\n" + "(4) Salir";

	}

	/**
	 * Metodo que muestra el menu de opciones por pantalla y recibe un numero del
	 * 1-3 para selecciona el numero de jugadores y crea los jugadores que van a
	 * jugar
	 */
	public String menuImplementarJugadores() {
		return "(1) 2 Jugadores\n" + "(2) 3 Jugadores\n" + "(3) 4 Jugadores";
	
	}
}
