package tablero;

import consumibles.BolaEspecial;
import consumibles.Cereza;
import consumibles.Consumibles;

import java.util.Scanner;

import consumibles.Bola;
import jugadores.Comecoco;
import jugadores.Fantasma;
import jugadores.Jugador;

public class Tablero {
	private int nJugadores;
	private Cereza cer;
	private Consumibles bola=new Bola("· ");
	private Jugador[] jugadores;
	private String[][] tablero =new String[16][16];
	private String [][] posCom =new String[16][16];

	public Tablero(Jugador[] jugadores, int numJug, Cereza cer, Bola bola) {
		this.jugadores = new Jugador[1];
		this.tablero = new String[16][16];
		this.nJugadores = 0;

	}
	
	public void imprimirTablero() {

		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				if (this.jugadores[0] != null && this.jugadores[0].getPosX() == col &&
						this.jugadores[0].getPosY() == fil) {
					tablero[fil][col] = this.jugadores[0].getIcono();
				} else {
//					tablero[fil][col] = "  ";
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
			System.out.println("Introduce A,W,S,D para moverte");
			cursor=cur.nextLine();
	//		String mov = "input";
			this.jugadores[0].mover(cursor);
			this.imprimirTablero();
			cur=new Scanner(System.in);
		}
	}

}
