package consumibles;

//Clase de la bola
public class Bola extends Consumibles{
	private int puntBol;
	/**
	 * Clase Bola
	 *
	 * Contiene todos los atributos de la bola incluidos los heredados de consumibles
	 *
	 * @version 1.0
	 * @author Alfonso Moreno
	 */
	
	
	public Bola(int posX, int posY, String icono,int puntBol) {
		super(icono);
		this.posX=10;
		this.posY=10;
		this.puntBol=10;
	}
	public String getIcon(String icono) {
		return icono;
	}
	
//Metodo que asigna un caracter a una bola 
//y los puntos que le suma al jugador
	

}
