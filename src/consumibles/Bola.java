package consumibles;

//Clase de la bola
public class Bola extends Consumibles{
	private int puntBol;
	/**
	 * Clase Bola
	 *
	 * Contiene todos  los atributos de la bola incluidos los heredados de consumibles
	 *
	 * @version 1.0
	 * @author Alfonso Moreno
	 */
	
	
	public Bola(String icono) {
		super(icono);
		this.posX=10;
		this.posY=10;
		this.puntBol=10;
	}
	

}
