package trabajo.testing.truco;

import trabajo.testing.truco.*;
import junit.framework.TestCase;

public class z_JUnitJugador extends TestCase {
	private Jugador jugador;
	private Jugador pc;
	
	public void setUp() {
		jugador = new Jugador("jugador");
		pc = new Jugador();
	}

	public void testGetNombre() {
		assertEquals("jugador", jugador.getNombre());
		assertEquals("Computadora", pc.getNombre());
	}
	
	public void testSetNombre() {
		jugador.setNombre("pablop");
		assertEquals("pablop", jugador.getNombre());
	}
	
	public void testGetMano() {
		Carta carta1 = new Carta(1,Palo.Basto);
		carta1.setPuntaje(90);
		Carta carta2 = new Carta(10,Palo.Copa);
		carta2.setPuntaje(10);
		Carta carta3 = new Carta(3,Palo.Espada);
		carta3.setPuntaje(30);
		Mano m = new Mano(carta1,carta2,carta3);
		jugador.setMano(m);
		assertEquals(m, jugador.getMano());
	}
	
	public void testSetMano() {
		Carta carta1 = new Carta(5,Palo.Basto);
		carta1.setPuntaje(5);
		Carta carta2 = new Carta(1,Palo.Espada);
		carta2.setPuntaje(100);
		Carta carta3 = new Carta(2,Palo.Espada);
		carta3.setPuntaje(20);
		Mano m = new Mano(carta1,carta2,carta3);
		jugador.setMano(m);
		assertEquals(m, jugador.getMano());
	}
	
	public void testGetSoyPie() {
		jugador.setSoyPie(Boolean.TRUE);
		assertTrue(jugador.getSoyPie());
	}
	
	public void testSetSoyPie() {
		jugador.setSoyPie(Boolean.FALSE);
		assertFalse(jugador.getSoyPie());
	}
	
	public void testRecibirMano() {
		Carta carta1 = new Carta(5,Palo.Basto);
		carta1.setPuntaje(5);
		Carta carta2 = new Carta(10,Palo.Copa);
		carta2.setPuntaje(10);
		Carta carta3 = new Carta(3,Palo.Espada);
		carta3.setPuntaje(3);
		Mano m = new Mano(carta1,carta2,carta3);
		jugador.recibirMano(m);
		assertEquals(m, jugador.getMano());
	}
	
	public void testJugarCarta() {
		Carta carta1 = new Carta(5,Palo.Basto);
		carta1.setPuntaje(5);
		Carta carta2 = new Carta(10,Palo.Copa);
		carta2.setPuntaje(10);
		Carta carta3 = new Carta(3,Palo.Espada);
		carta3.setPuntaje(3);
		Mano m = new Mano(carta1,carta2,carta3);
		jugador.recibirMano(m);		
		assertEquals(carta1, jugador.jugarCarta(0));
	}
	
	public void testSosPie() {
		jugador.sosPie();
		assertTrue(jugador.getSoyPie());
	}
}
