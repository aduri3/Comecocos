package comecocos;
import avatares.Comecoco;
import avatares.Fantasma;
import jugadores.Jugador;

public class Tablero {
	private String[][] tablero;
	private Comecoco pacman;
	private Fantasma[] fantasma;
	private Bolas bolas;
	private BolaEspecial bolaEsp;
	private Jugador[] jugadores;

	public void creaTablero() {
		String[][] tablero = new String[50][50];
		for (int i = 0; i < tablero.length; i++) {
			tablero[0][i]="-";
			tablero[i][0]="-";
		}
	}
}
