package jugadores;
//Clase jugador
public class Jugador {
	
	/**
	 * Clase Jugador
	 * 
	 * La cual continene los atributos del jugador y e movimiento de estos
	 * 
	 * @param nombreJug Nombre del Jugador
	 * @param icono el cual cambia dependiendo del movimiento
	 * @param posX contiene la posicion x del Jugador
	 * @param posY contiene la posicion y del jugador
	 * @param nMov Es el numero de movimientos que puede hacer el jugador
	 * 
	 * @author Alfonso Moreno
	 * @author Dani Kuradchyk
	 * 
	 */
	private String nombreJug;
	private String icono;
	protected int posX;
	protected int posY;
	protected int nMov;
	

	// Metodo constructor que le asigna al comecoco un caracter
	// que sera su forma
	
	/**
	 * Metodo constructor que inicializa el Jugador
	 * 
	 */
	public Jugador(String icono,String nombreJug) {
		this.icono=icono;
		this.nombreJug=nombreJug;
	}
	/**
	 * Metodo que contiene la logica de movimiento de los jugadores
	 * 
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
		}
	
}
	/**
	 * Metodo que obtiene el icono del jugador
	 * 
	 */
	public String getIcono() {
		return icono;
	}
	/**
	 * Metodo que pasa por parametros el icono del jugador
	 * 
	 */
	public void setIcon(String icono) {
		this.icono = icono;
	}
	/**
	 * Metodo que cambia la posicion x
	 * 
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Metodo que cambia la posicion y
	 * 
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	/**
	 * Metodo que cambia el numero de movimientos
	 * 
	 */
	public void setnMov(int nMov) {
		this.nMov = nMov;
	}
	/**
	 * Metodo que obtiene la posicion x
	 * 
	 */
	public int getPosX() {
		return posX;
	}
	/**
	 * Metodo que obtiene la posicion y
	 * 
	 */
	public int getPosY() {
		return posY;
	}

	
}
