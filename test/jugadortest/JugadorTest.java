package jugadortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jugadores.Jugador;
import menu.Menu;

class JugadorTest {

	@Test
	public void testMoverIconoA() {
		Jugador jug=new Jugador("<","Dani");
		jug.mover("a");
		String expected ="> ";
		String actual = jug.getIcono();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverIconoW() {
		Jugador jug=new Jugador("<","Dani");
		jug.mover("w");
		String expected ="v ";
		String actual = jug.getIcono();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverIconoD() {
		Jugador jug=new Jugador("<","Dani");
		jug.mover("d");
		String expected ="< ";
		String actual = jug.getIcono();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverIconoS() {
		Jugador jug=new Jugador("<","Dani");
		jug.mover("s");
		String expected ="/\\";
		String actual = jug.getIcono();
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMoverSiA() {
		Jugador jug=new Jugador("<","Dani");
		jug.setPosX(5);
		jug.mover("a");
		int expected =4;
		int actual = jug.getPosX();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverSiW() {
		Jugador jug=new Jugador("<","Dani");
		jug.setPosY(5);
		jug.mover("w");
		int expected =4;
		int actual = jug.getPosY();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverSiD() {
		Jugador jug=new Jugador("<","Dani");
		jug.setPosX(5);
		jug.mover("d");
		int expected =6;
		int actual = jug.getPosX();
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMoverSiS() {
		Jugador jug=new Jugador("<","Dani");
		jug.setPosY(5);
		jug.mover("s");
		int expected =6;
		int actual = jug.getPosY();
		
		assertEquals(expected,actual);
	}
	
}
 