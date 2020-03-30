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
	private boolean comida;
	/**
	 * Metodo Constructor de Cereza 
	 * 
	 * @param puntCereza nos dice la puntuación que da la Cereza
	 * @param comida nos dice si la cereza ha sido comida o no
	 **/
	public Cereza(String icono) {
		super(icono);
		this.posX=12;
		this.posY=13;
		this.puntCereza=500;
		this.comida=false;
	}


	
}
