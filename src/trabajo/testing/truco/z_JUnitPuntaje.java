package trabajo.testing.truco;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class z_JUnitPuntaje {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void comprobarPuntos() {
		Puntaje puntos = new Puntaje();
		puntos.setPuntaje(20);
		assertEquals(20, puntos.getPuntaje().intValue());
	}

}
