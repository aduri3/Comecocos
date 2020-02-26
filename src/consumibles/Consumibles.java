package consumibles;
/**
 * Clase consumibles
 *
 * Contiene todos los atributos de los consumibles
 *
 * @version 1.0
 * @author Alfonso Moreno
 */
public class Consumibles {
	/**
	 * Atributos
	 **/
	protected int posX;
	protected int posY;
	private String icono; 

	/**
	 * Constructor
	 **/
	public Consumibles(String icono) {
		
		this.icono=icono;
	}
	/**
	 * Método que nos da la posición x del consumible
	 **/
	public int getPosX() {
		
		return posX;
	}
	/**
	 * Método que asigna da la posición x del consumible
	 **/
	
	public void setPosX(int posX) {
		this.posX = posX;
	}
	/**
	 * Método que nos da la posición y del consumible
	 **/
	public int getPosY() {
		return posY;
	}
	/**
	 * Método que  asigna da la posición y del consumible
	 **/
	public void setPosY(int posY) {
		this.posY = posY;
		
	}
	/**
	 * Método que  devuelve el icono
	 **/
	public String getIcon() {
		return icono;
	}
}
