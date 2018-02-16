package trabajo.testing.truco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class z_JUnitMazo {

	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	private ArrayList<Carta> mazo;
	private ArrayList<Carta> mazo1;
	private static final Integer numero = 100;
	private static final Integer retirarCarta = 2;
	Mazo m2;
	@Before
	public void setUp() throws Exception {
		c1 = new Carta(1, Palo.Basto);
		c2 = new Carta(2, Palo.Oro);
		c3 = new Carta(4, Palo.Espada);
		c4 = new Carta(2,Palo.Oro);
		mazo = new ArrayList<Carta>();
		mazo1 = new ArrayList<Carta>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void agregarCartas() {
	mazo.add(c1);
		assertEquals(mazo.get(0), c1);
	}
	
	@Test
	public void setearPuntos(){
		c1.setPuntaje(100);
		assertEquals(c1.getPuntaje(), numero);
	}
	
	@Test
	public void retirarCarta(){
		mazo1.add(c1);
		mazo1.add(c2);
		mazo1.add(c3);
		mazo1.add(c4);
		if(mazo1.size() > retirarCarta){
			mazo1.remove(2);
		}
		else{
			
		}
		assertEquals(mazo1.get(1).toString(), mazo1.get(2).toString());
	}
}
