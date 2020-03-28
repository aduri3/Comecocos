package jugadores;
//Clase jugador
/**
 * Clase Jugador
 * 
 * La cual continene los atributos del jugador y movimiento de estos
 * 
 * @author Dani Kuradchyk
 * 
 */
public class Jugador {
	
	/**
	 * Nombre del Jugador
	 */
	private String nombreJug;
	/**
	 * icono el cual cambia dependiendo del movimiento
	 */
	private String icono;
	/**
	 * posicion x del Jugador
	 */
	protected int posX;
	/**
	 * posicion y del jugador
	 */
	protected int posY;
	/**
	 * numero de movimientos que puede hacer el jugador
	 */
	protected int nMov;
	

	// Metodo constructor que le asigna al comecoco un caracter
	// que sera su forma
	
	/**
	 * Metodo constructor que inicializa el Jugador
	 * 
	 * @param icono cambia dependiendo del movimiento
	 * @param nombreJug nombre del jugador
	 * 
	 */
	public Jugador(String icono,String nombreJug) {
		this.icono=icono;
		this.nombreJug=nombreJug;
	}
	/**
	 * Metodo que contiene la logica de movimiento de los jugadores
	 *  @param pos contiene la posicion a la que se quiere mover el jugador
	 */
	public void mover(String pos) {
		switch (pos) {
		case "a":
			this.posX--;
			setIcon("> ");  
			break;
		case "d":
			this.posX++;
			setIcon("< ");
			break;
		case "w":
			this.posY--;
			setIcon("v ");
			break;
		case "s":
			this.posY++;
			setIcon("/\\");
			break;
		default: 
		}
	
}
	/**
	 * Metodo que obtiene el icono del jugador
	 *  @return 
	 *  	<ul>
	 *  		<li>Onbiene el icono del jugador</li>
	 *  	</ul>
	 */
	public String getIcono() {
		return icono;
	} 
	/**
	 * Metodo que pasa por parametros el icono del jugador
	 * 	@param icono es el icono del jugador
	 */
	public void setIcon(String icono) {
		this.icono = icono;
	}
	/**
	 * Metodo que cambia la posicion x
	 *  @param posX contiene la posicion x del jugador
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Metodo que cambia la posicion y
	 * @param posY contiene la posicion y del jugador
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * Metodo que cambia el numero de movimientos
	 * @param nMov contiene el numero de movimientos del jugador
	 */
	public void setnMov(int nMov) {
		this.nMov = nMov;
	}
	/**
	 * Metodo que obtiene la posicion x
	 *  @return 
	 *  	<ul>
	 *  		<li>Onbiene la posicion x del jugador</li>
	 *  	</ul>
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * Metodo que obtiene la posicion y
	 *  @return 
	 *  	<ul>
	 *  		<li>Onbiene la posicion y del jugador</li>
	 *  	</ul>
	 */
	public int getPosY() {
		return posY;
	}

	
}
