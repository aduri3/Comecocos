package jugadores;

import java.util.Scanner;

/**
 * Clase Fantasma
 * 
 * La cual continene los atributos del fantasma y la posicion de estos
 * 
 * @author Dani Kuradchyk
 * 
 */
public class Fantasma extends Jugador{

	/**
	 * Metodo constructor que inicializa el Jugador
	 * 
	 * @param icono cambia dependiendo del movimiento
	 * @param nombreJug nombre del jugador
	 * 
	 */
	public Fantasma(String icono, String nombreJug) {
		super(icono, nombreJug);
		// TODO Auto-generated constructor stub
		this.posX=12;
		this.posY=13;
		this.nMov=calculaNmov();
		
	}
	/**
	 * Metodo que devuelve el numero de movimientos
	 * 
	 * @return devuelve un numero aletorio del 0 al 3
	 */
	private int calculaNmov() {
		return (int) (Math.random()*4); 
	}
	
}
