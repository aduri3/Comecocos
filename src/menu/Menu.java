package menu;

import java.util.Scanner;

import tablero.Tablero;

public class Menu {
	private String menu;

	public Menu() {
		this.menu = "";
	}

	public void mostrar() {
		Scanner tec = new Scanner(System.in);
		String logo = "       _ __   __ _  ___ _ __ ___   __ _ _ __  \n"
				+ "      | '_ \\ / _` |/ __| '_ ` _ \\ / _` | '_ \\ \n"
				+ "      | |_) | (_| | (__| | | | | | (_| | | | |\n"
				+ "      | .__/ \\__,_|\\___|_| |_| |_|\\__,_|_| |_|\n"
				+ "      | |                                     \n" + "      |_|        ";
		String dibujo = "__________________|      |________________________\n"
				+ "     ,--.    ,--.          ,--.   ,--.\n" + "    |oo  | _  \\  `.       | oo | |  oo|\n"
				+ "o  o|~~  |(_) /   ;       | ~~ | |  ~~|o  o  o  o  \n"
				+ "    |/\\/\\|   '._,'        |/\\/\\| |/\\/\\|\n"
				+ "__________________        ________________________\n" + "                  |      |";
		String tecla;
		System.out.println(logo);
		System.out.println(dibujo);
		System.out.println();
		System.out.println("Presiona la tecla J para continuar....");
		do {
			tecla = tec.nextLine();
		} while (!tecla.equalsIgnoreCase("j"));
		menuOpciones();
	}

	public void menuOpciones() {
		Scanner opc = new Scanner(System.in);
		Tablero tab = new Tablero();
		int opcion;
		System.out.println("(1) Seleccionar jugadores[2-4].");
		System.out.println("(2) �Jugar!");
		System.out.println("(3) �Como se juega?");
		System.out.println("(4) Salir");
		opcion = opc.nextInt();
		switch (opcion) {
		case 1:
			;
			break;
		case 2:
			tab.creaTablero();
			break;
		case 3:
			;
			break;
		case 4:
			;
			break;

		}
	}
}
