package consumibles;

//Clase de Bola Especial
public class BolaEspecial extends Consumibles {
	private int puntesp;
	/**
	 * Clase BolaEspecial
	 *
	 * Contiene todos los atributos de la Bola Especial incluidos los heredados
	 *
	 * @version 1.0
	 * @author Alfonso Moreno
	 */
	
	public BolaEspecial(String icono) {
		super(icono);
		this.posX=5;
		this.posY=5;
		this.puntesp=200;
		
	}
}
