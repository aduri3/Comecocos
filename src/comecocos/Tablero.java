package comecocos;

public class Tablero {
	private String[][] tablero;
//	private Comecocos pacman;
//	private Fantasma[] fantasma;
//	private Bolas bolas;
//	private BolaEspecial bolaEsp;
//	private Jugador[] jugadores;

	public void creaTablero() {
		String[][] tablero = new String[50][50];
		for (int i = 0; i < tablero.length; i++) {
			tablero[0][i]="-";
			tablero[i][0]="-";
		}
	}
}
