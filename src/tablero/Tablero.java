package tablero;

import consumibles.BolaEspecial;
import consumibles.Cereza;
import consumibles.Bola;
import jugadores.Comecoco;
import jugadores.Fantasma;
import jugadores.Jugador;

public class Tablero {
	private int nJugadores;
	private Cereza cer;
	private BolaEspecial bolaEsp;
	private Jugador[] jugadores;
	private String[][] tablero;

	public Tablero(Jugador[] jugadores, int numJug, Cereza cer, BolaEspecial bolaEsp) {
		this.jugadores = new Jugador[1];
		this.tablero = new String[26][26];
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
			tablero[25][i] = "X ";
			tablero[i][0] = "X";
			tablero[i][25] = "X";
			tablero[0][i] = "X ";
//			tablero[25][i] = "__";
//			tablero[i][0] = "|";
//			tablero[i][25] = "|";
//			tablero[0][i] = "__";

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
		//Jugador comecoco = new Comecoco("O", "Dani");
		this.jugadores[0] = new Comecoco("O ", "Dani");
		this.imprimirTablero();
		// Scanner leyendo el imput
		System.out.println("Esperando input...");
//		String mov = "input";
		this.jugadores[0].mover("a");
		this.imprimirTablero();
	}

}
