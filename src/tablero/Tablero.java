package tablero;

import avatares.Comecoco;
import avatares.Fantasma;
import comecocos.BolaEspecial;
import comecocos.Bolas;
import jugadores.Jugador;

public class Tablero {
	private Comecoco pacman;
	private Fantasma[] fantasma;
	private Bolas bolas;
	private BolaEspecial bolaEsp;
	private Jugador[] jugadores;
	String[][] tablero = new String[26][27];
	
	public void creaTablero() {

	
		
		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				tablero[fil][col] = " ";
			}

		}
		for (int i = 0; i < tablero.length; i++) {
			tablero[0][i] = "-";
			tablero[i][0] = "|";
			tablero[i][26] = "|";
			tablero[25][i] = "-";
		}
		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				System.out.print(tablero[fil][col]);
			}
			System.out.println();
		}
	}
}
