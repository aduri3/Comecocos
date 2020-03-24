package menutest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import menu.Menu;

class MenuTest {

	@Test
	public void testMenuOpciones() {
		Menu men = new Menu();
		String expected ="(1) Seleccionar jugadores[2-4].\n" + "(2) Jugar!\n" + "(3) Como se juega?\n" + "(4) Salir";
		String actual = men.menuOpciones();
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void menuImplementarJugadores() {
		Menu men = new Menu();
		String expected ="(1) 2 Jugadores\n" + "(2) 3 Jugadores\n" + "(3) 4 Jugadores";
		String actual = men.menuImplementarJugadores();
		
		assertEquals(expected,actual);
	}
}
