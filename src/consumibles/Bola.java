package consumibles;

//Clase de la bola
public class Bola extends Consumibles{
	private int puntBol;
	private boolean comida;

	/**
	 * Clase Bola
	 *
	 * Contiene todos  los atributos de la bola incluidos los heredados de consumibles
	 *
	 * @version 1.0
	 * @author Alfonso Moreno
	 */
	
	
	/**
	 * Metodo constructor que inicializa la bola
	 * @param posX nos dice la posición x de la bola
	 * @param posY nos dice la posición x de la bola
	 * @param puntCereza nos dice la puntuación que da la bola
	 * @param comida nos dice si la bola ha sido comida o no
	 */
	public Bola(String icono) {
		super(icono);
		this.posX=10;
		this.posY=10;
		this.puntBol=10;
		this.comida=false;
	}
	
	

}
