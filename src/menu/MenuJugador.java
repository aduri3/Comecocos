package menu;

public class MenuJugador {

	// Método que da la interfaz de los movimientos
	/**
	 * Clase MenuJugador
	 * 
	 * Contiene las teclas de los movimientos
	 * 
	 * @version 1.0
	 * @author Roberto Ruiz
	 * 
	 */
	
	/**
	 * Método que devuelve la interfaz de los posibles movimientos del jugador
	 * 
	 * @return " -----\n" +" | W |\n" +" -----\n" + "----- ----- -----\n" + "| A | |
	 *         S | | D |\n" + "----- ----- -----\n"
	 *
	 */
	public String getInterfazMovimientos() {
		return "       -----\n" + "       | W |\n" + "       -----\n" + "-----  -----  -----\n"
				+ "| A |  | S |  | D |\n" + "-----  -----  -----\n";
	}

}
