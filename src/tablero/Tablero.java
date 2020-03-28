package tablero;


import consumibles.Cereza;
import consumibles.Consumibles;

import java.util.Scanner;

import consumibles.Bola;
import jugadores.Comecoco;
import jugadores.Jugador;
import menu.MenuJugador;

/**
 * Clase Tablero
 *
 * Contiene el tablero del juego y sus metodos
 *
 * @version 1.0
 * @author Dani Kuradchyk
 */
public class Tablero {
	/**
	 * Numero de jugadores
	 **/
	private int nJugadores;
	/**
	 * Valor de cereza
	 **/
	private Consumibles cer = new Cereza("& ");
	/**
	 * Valor de bola
	 **/
	private Consumibles bola = new Bola("· ");
	/**
	 * Valor de menu
	 **/
	private Jugador[] jugadores;
	/**
	 * Valor de menu
	 **/
	private String[][] tab = new String[16][16];

	/**
	 * Metodo constructor que inicializa el menu
	 * 
	 * @param jugadores los jugadores que habra en el juego
	 * @param numJug    numero de jugadores
	 * @param cer       una cereza
	 * @param bola      la bola
	 */
	public Tablero(Jugador[] jugadores, int numJug, Cereza cer, Bola bola) {
		this.jugadores = new Jugador[1];
		this.tab = new String[16][16];
		this.nJugadores = 0;

	}

	/**
	 * Metodo que imprime el tablero por pantalla
	 * 
	 */
	public void imprimirTablero() {
		inicializarTablero();
		insertarComecocos();
		insertarParedes();
		insertarBolas();

		for (int fil = 0; fil < tab.length; fil++) {
			for (int col = 0; col < tab[fil].length; col++) {
				System.out.print(tab[fil][col]);
			}
			System.out.println();
		}

	}

	/**
	 * Metodo que inicializa la matriz a campos vacios
	 * 
	 */
	private void inicializarTablero() {
		for (int fil = 0; fil < tab.length; fil++) {
			for (int col = 0; col < tab[fil].length; col++) {
				tab[fil][col] = "  ";
			}

		}
	}

	/**
	 * Metodo que pinta las paredes del tablero
	 * 
	 */
	private void insertarParedes() {
		for (int i = 0; i < tab.length; i++) {
			tab[15][i] = "X ";
			tab[i][0] = "X";
			tab[i][15] = "X";
			tab[0][i] = "X ";
			tab[2][2] = " X";
			tab[3][2] = " X";
			tab[4][2] = " X";
			tab[5][2] = " X";
			tab[6][2] = " X";
			tab[8][2] = " X";
			tab[9][2] = " X";
			tab[11][2] = " X";
			tab[12][2] = " X";
			tab[2][3] = " X";
			tab[8][3] = " X";
			tab[12][3] = " X";
			tab[4][4] = " X";
			tab[8][4] = " X";
			tab[10][4] = " X";
			tab[12][4] = " X";
			tab[2][5] = " X";
			tab[4][5] = " X";
			tab[5][5] = " X";
			tab[6][5] = " X";
			tab[8][5] = " X";
			tab[2][6] = " X";
			tab[4][6] = " X";
			tab[10][6] = " X";
			tab[11][6] = " X";
			tab[2][7] = " X";
			tab[6][8] = " X";
			tab[8][8] = " X";
			tab[9][8] = " X";
			tab[10][8] = " X";
			tab[2][9] = " X";
			tab[3][9] = " X";
			tab[6][9] = " X";
			tab[2][10] = " X";
			tab[5][10] = " X";
			tab[6][10] = " X";
			tab[7][10] = " X";
			tab[8][10] = " X";
			tab[10][10] = " X";
			tab[11][10] = " X";
			tab[2][12] = " X";
			tab[3][12] = " X";
			tab[6][12] = " X";
			tab[10][12] = " X";
			tab[11][12] = " X";
			tab[12][12] = " X";
			tab[7][13] = " X";
			tab[6][13] = " X";
			tab[14][3] = " X";
			tab[14][4] = " X";
			tab[14][7] = " X";
			tab[14][8] = " X";
			tab[14][11] = " X";
			tab[14][12] = " X";
			tab[14][13] = " X";
			tab[14][14] = " X";
			tab[11][14] = " X";
			tab[12][14] = " X";

		}
	}

	/**
	 * Metodo que inserta el comecocos dentro del tablero
	 * 
	 */
	private void insertarComecocos() {
		for (int fil = 0; fil < tab.length; fil++) {
			for (int col = 0; col < tab[fil].length; col++) {
				if (this.jugadores[0] != null && this.jugadores[0].getPosX() == col
						&& this.jugadores[0].getPosY() == fil) {
					if (tab[fil][col].equals("X") || tab[fil][col].equals("X "))
						System.out.println("Te has salido del tablero");
					else
						tab[fil][col] = this.jugadores[0].getIcono();

				}
			}
		}
	}

	/**
	 * Metodo que inserta las bolas dentro del tablero
	 * 
	 */
	private void insertarBolas() {
		for (int fil = 0; fil < tab.length; fil++) {
			for (int col = 0; col < tab[fil].length; col++) {
				if (tab[fil][col].equals("  ")) {
					tab[fil][col] = this.bola.getIcon();

				}
			}
		}
	}

	/**
	 * Metodo que inserta a los jugadores dentro del array de jugadores del tablero
	 * 
	 * @param j jugador a añadir en el tablero
	 * 
	 */
	public void anadirJugador(Jugador j) {
		this.jugadores[nJugadores] = j;
		this.nJugadores++;
	}

	/**
	 * Metodo que va pidiendo al jugador la posicion a la que se quiere mover hasta que el 
	 * jugador introduzca salir por consola.
	 */
	public void jugar() {
		this.jugadores[0] = new Comecoco("< ", "Dani");
		this.imprimirTablero();
		Scanner cur = new Scanner(System.in);
		String cursor = null;
		boolean salir = false;
		while (!salir) {
			MenuJugador men = new MenuJugador();
			System.out.println(men.getInterfazMovimientos());
			cursor = cur.nextLine();
			if (cursor.equalsIgnoreCase("salir"))
				salir = true;
			this.jugadores[0].mover(cursor);
			this.imprimirTablero();
			cur = new Scanner(System.in);
		}
	}

}
