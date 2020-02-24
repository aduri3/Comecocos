package jugadores;

import java.util.Scanner;

//Clase del Fantasma 
public class Fantasma extends Jugador{

//Metodo que crea un fantasma asignandole y le asigna un nombre
//Y los punto que va a valer
	public Fantasma(String icono, String nombreJug) {
		super(icono, nombreJug);
		// TODO Auto-generated constructor stub
		this.posX=12;
		this.posY=13;
		this.nMov=calculaNmov();
		
	}
	private int calculaNmov() {
		return (int) (Math.random()*4); 
	}
	
}
