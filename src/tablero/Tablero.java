package tablero;

import avatares.Comecoco;
import avatares.Fantasma;
import consumibles.BolaEspecial;
import consumibles.Cereza;
import consumibles.Bola;
import jugadores.Jugador;

public class Tablero {
	private int priPosLib=0;
	private Cereza cer;
	private BolaEspecial bolaEsp;
	private Jugador[] jugadores;
	private String[][] tablero;
	
	public Tablero(Jugador[] jugadores,int numJug, Cereza cer, BolaEspecial bolaEsp) {
		this.jugadores=new Jugador[numJug];
		this.tablero=new String[26][27];
		
	}
	
	public void creaTablero() {

		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				tablero[fil][col] = " ";
			}

		}
		for (int i = 0; i < tablero.length; i++) {
			tablero[0][i] = "_";
			tablero[i][0] = "|";
			tablero[i][26] = "|";
			tablero[25][i] = "_";
		}
	
		
		for (int fil = 0; fil < tablero.length; fil++) {
			for (int col = 0; col < tablero[fil].length; col++) {
				System.out.print(tablero[fil][col]);
			}
			System.out.println();
		}
		

	}
	public void añadirJugador(Jugador j) {
		this.jugadores[priPosLib]=j;
		this.priPosLib++;
	}
}
