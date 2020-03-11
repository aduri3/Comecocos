package exceptions;

public class ChocarException extends Exception{
	/**
	 * Clase ChocarException
	 * 
	 * Contiene la excepcion de choque con una pared
	 * 
	 * @version 1.0
	 * @author Roberto Ruiz
	 */
	
	/**
	 * Método que devuelve un texto de error
	 * 
	 * @return "[ERROR] MOVIMIENTO NO VALIDO"
	 */
	public String getMessage() {
		return "[ERROR] MOVIMIENTO NO VALIDO";
	}

}
