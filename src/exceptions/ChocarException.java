package exceptions;

public class ChocarException extends Exception{
	/**
	 * Generador de excepción cuando un avatar se choca con la pared
	 */
	public String getMessage() {
		return "[ERROR] MOVIMIENTO NO VALIDO";
	}
}
