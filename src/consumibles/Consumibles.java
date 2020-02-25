package consumibles;

public class Consumibles {
	protected int posX;
	protected int posY;
	private String icono; 

	public Consumibles(String icono) {
		this.icono=icono;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
}
