package tablero;

import consumibles.BolaEspecial;
import consumibles.Cereza;
import consumibles.Consumibles;

import java.util.Scanner;

import consumibles.Bola;
import jugadores.Comecoco;
import jugadores.Fantasma;
import jugadores.Jugador;
import menu.MenuJugador;
/**
 * Clase Tablero
 *
 * Contiene el menu de comecoco
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
	private Consumibles cer=new Cereza("& ");;
	/**
	 * Valor de bola
	 **/
	private Consumibles bola=new Bola("· ");
	/**
	 * Valor de menu
	 **/
	private Jugador[] jugadores;
	/**
	 * Valor de menu
	 **/
	private String[][] tablero =new String[16][16];

	/**
	 * Metodo constructor que inicializa el menu
	 * 
	 * @param Valor de menu
	 * @param Valor de menu
	 * @param Valor de menu
	 */
	public Tablero(Jugador[] jugadores, int numJug, Cereza cer, Bola bola) {
		this.jugadores = new Jugador[1];
		this.tablero = new String[16][16];
		this.nJugadores = 0;

	}
	/**
	 * Metodo que muestra el menu por pantalla y recibe una tecla
	 * 
	 * @param tec    es el Scanner que recibira una j para empezar
	 * @param logo   Contiene el texto de PACMAN
	 * @param dibujo Contiene un dibujo en ASCI
	 * @param tecla  Almacena la tecla pulsada
	 */
	public void imprimirTablero() {

		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				if (this.jugadores[0] != null && this.jugadores[0].getPosX() == col &&
						this.jugadores[0].getPosY() == fil) {
					tablero[fil][col] = this.jugadores[0].getIcono();
				} else {
					tablero[fil][col] = "  ";
				}
				
			}

		}
		
		for (int i = 0; i < tablero.length; i++) {
			tablero[15][i] = "X ";
			tablero[i][0] = "X";
			tablero[i][15] = "X";
			tablero[0][i] = "X ";

		}
		
		for(int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				if (tablero[fil][col].equals("  ")) {
					tablero[fil][col] = this.bola.getIcon();
			
			}		
		}
		}
		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				System.out.print(tablero[fil][col]);
			}
			System.out.println();
		}

	}

	public void anadirJugador(Jugador j) {
		this.jugadores[nJugadores] = j;
		this.nJugadores++;
	}

	public void jugar() {
		this.jugadores[0] = new Comecoco("< ", "Dani");
		this.imprimirTablero();
		Scanner cur=new Scanner(System.in);
		String cursor=null;
		// Scanner leyendo el imput
		while(true) {
			MenuJugador men=new MenuJugador();
			System.out.println(men.getInterfazMovimientos());
			cursor=cur.nextLine();
	//		String mov = "input";
			this.jugadores[0].mover(cursor);
			this.imprimirTablero();
			cur=new Scanner(System.in);
		}
	}
	

}
