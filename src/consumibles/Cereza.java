package consumibles;
//Clase Cereza
public class Cereza extends Consumibles{
	/**
	 * Clase consumibles
	 *
	 * Contiene todos los atributos de la Cereza incluidos los heredados
	 *
	 * @version 1.0
	 * @author Alfonso Moreno
	 */
	private int puntCereza;
	/**
	 * Método Constructor de Cereza 
	 * 
	 * @param posX nos dice la posición x de la cereza
	 * @param posY nos dice la posición x de la cereza
	 * @param puntCereza nos dice la puntuación que da la Cereza
	 **/
	public Cereza(String icono) {
		super(icono);
		this.posX=12;
		this.posY=13;
		this.puntCereza=500;
	}


	
}
