package jugadores;
//Clase jugador
public class Jugador {
	private String nombreJug;
	private String icono;
	protected int posX;
	protected int posY;
	protected int nMov;
	

	// Metodo constructor que le asigna al comecoco un caracter
	// que sera su forma
	public Jugador(String icono,String nombreJug) {
		this.icono=icono;
		this.nombreJug=nombreJug;
	}

	public void mover(String pos) {
		switch (pos) {
		case "a":
			this.posX--;
			break;
		case "d":
			this.posX++;
			break;
		case "w":
			this.posY--;
			break;
		case "s":
			this.posY++;
			break;
		}
	
}

	public String getIcono() {
		return icono;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	
}
