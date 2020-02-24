package avatares;
//Clase del Comecoco
public class Comecoco {
	private String pacMan;
	private int posX;
	private int posY;
	private int nMov;
	
	
	//Metodo constructor que le asigna al comecoco un caracter
	//que sera su forma
	public Comecoco(String pacMan) {
		this.pacMan=pacMan;
		this.posX=20;
		this.posY=20;
		this.nMov=1;
	}
	public void mover(String pos) {
		switch (pos) {
		case "a": this.posX--;
		case "d": this.posX++;
		case "w": this.posY--;
		case "s": this.posY++;
		}
	}
	
	
}
