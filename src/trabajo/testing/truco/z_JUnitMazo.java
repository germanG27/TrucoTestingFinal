package trabajo.testing.truco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class z_JUnitMazo {

	private ArrayList<Carta> mazo;
	
	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void repartirCartas() {
		Carta c1 = new Carta(1, Palo.Basto);
		mazo.add(c1);
		Jugador a = new Jugador("a");
		a.getCartasUser().add(mazo.get(0));
		assertEquals(12, mazo.retirarCarta(39, mazo.getMazo()).getNumero().intValue());
		
	}

}
