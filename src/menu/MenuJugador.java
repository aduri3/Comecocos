package menu;

public class MenuJugador {

	// Método que da la interfaz de los movimientos
	/**
	 * Método que devuelve la interfaz de los posibles movimientos del jugador
	 * 
	 * @return 
	 *		<ul>
	 *			<li>W - Arriba</li>
	 *			<li>A - Izquierda</li>
	 *			<li>S - Abajo</li>
	 *			<li>D - Derecha</li>
	 *		</ul>
	 */
	public String getInterfazMovimientos() {
		return "Mueva con las teclas:\n" + 
				"W - Arriba\n" + 
				"A - Izquierda\n" + 
				"S - Abajo\n" + 
				"D - Derecha";
	}
	
}
