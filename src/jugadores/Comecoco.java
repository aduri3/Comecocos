package jugadores;

/**
 * Clase Comecoco
 * 
 * La cual continene los atributos del Comecoco y la posicion de estos
 * 
 * @author Dani Kuradchyk
 * 
 */

public class Comecoco extends Jugador {

	/**
	 * Metodo constructor que inicializa el Comecoco
	 * 
	 * @param icono cambia dependiendo del movimiento
	 * @param nombreJug nombre del jugador
	 * 
	 */
	public Comecoco(String icono, String nombreJug) {
		super(icono, nombreJug);
		// TODO Auto-generated constructor stub
		this.posX=10;
		this.posY=10;
		this.nMov=1;
		
	}
	

}
