package trabajo.testing.truco;

import java.util.LinkedList;

import trabajo.testing.truco.*;
import junit.framework.TestCase;

public class z_JUnitJugadores extends TestCase {
private Jugadores jugadores;
	
	public void setUp(){		
		jugadores = new Jugadores(4,"Test");		
	}
	
	public void testGetNombre() {
		assertEquals("Test", jugadores.getNombre());
	}
	
	public void testSetNombre() {
		jugadores.setNombre("nombre");
		assertEquals("nombre", jugadores.getNombre());
	}
	
	public void testGetIntegrantes() {
		assertEquals(null, jugadores.getJugadores());
	}
	
	public void testSetIntegrantes() {
		LinkedList<Jugador> integrantes = new LinkedList<Jugador>();
		integrantes.add(new Jugador("a"));
		integrantes.add(new Jugador("b"));
		jugadores.setJugadores(integrantes);
		assertEquals(integrantes, jugadores.getJugadores());
	}
	
	public void testGetCartaGanadoraJugadores() {
		assertEquals(null, jugadores.getCartaGanadoraEquipo());
	}
	
	public void testSetCartaGanadoraEquipo() {
		Carta carta = new Carta(7,Palo.Oro);
		jugadores.setCartaGanadoraJugadores(carta);
		assertEquals(carta, jugadores.getCartaGanadoraEquipo());
	}
	
	public void testGetPuntaje() {
		Puntaje puntaje = new Puntaje();
		jugadores.setPuntos(puntaje);
		assertEquals(puntaje, jugadores.getPuntaje());
	}

	public void testSetPuntaje() {
		Puntaje puntos = new Puntaje();
		jugadores.setPuntos(puntos);
		assertEquals(puntos, jugadores.getPuntaje());
	}
	
	public void testAgregarJugador() {
		LinkedList<Jugador> integrantes = new LinkedList<Jugador>();
		integrantes.add(new Jugador("a"));
		integrantes.add(new Jugador("b"));
		jugadores.setJugadores(integrantes);
		Jugador jugador = new Jugador("a");
		jugadores.agregarJugador(jugador);
		assertEquals(jugador, jugadores.getJugadores().getLast());
	}	
}
