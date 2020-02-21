package avatares;

import java.util.Scanner;

//Clase del Fantasma 
public class Fantasma {
	private String fantasma;
	private int puntFant;
	private int posX;
	private int posY;

//Metodo que crea un fantasma asignandole y le asigna un nombre
//Y los punto que va a valer
	public Fantasma(String fant, int puntos) {
		this.fantasma = fant;
		this.puntFant = puntos;
	}

	// Método que hace el movimiento del fantasma
	public void movFantasma(String pos) {		
		switch (pos) {
		case "a":
			posX--;
			break;
		case "d":
			posX++;
			break;
		case "w":
			posY++;
			break;
		case "s":
			posY--;
			break;
		}
	}
}
