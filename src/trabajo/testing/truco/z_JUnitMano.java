package trabajo.testing.truco;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class z_JUnitMano {
	
	private ArrayList<Carta> manos = new ArrayList<>();
	private ArrayList<Integer> expectedValues = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnvido() {
		Carta car1;
		Carta car2;
		Carta car3;
		car1 = new Carta(6, Palo.Basto);
		car2 = new Carta(7, Palo.Oro);
		car3 = new Carta(3, Palo.Copa);
		Boolean suma1   =  Boolean.FALSE;
		Boolean sumaEsperada1  ;
		expectedValues.add(20);
		manos.add(car1);
		manos.add(car2);
		manos.add(car3);
		for (int i =  0 ; i < manos.size() ; i ++){
			if (manos.get(i).getPalo().toString() == manos.get(1).getPalo().toString()){
				suma1 = Boolean.TRUE;
			}
			else if (manos.get(i).getPalo().toString() == manos.get(2).getPalo().toString()){
				suma1 = Boolean.TRUE;
			}
			
		}
		assertTrue(suma1);
		}
	@Test
	public void testNoEnvido() {
		Carta car1;
		Carta car2;
		Carta car3;
		car1 = new Carta(6, Palo.Basto);
		car2 = new Carta(7, Palo.Copa);
		car3 = new Carta(3, Palo.Oro);
		Boolean suma1   =  Boolean.TRUE;
		expectedValues.add(20);
		manos.add(car1);
		manos.add(car2);
		manos.add(car3);
		for (int i =  0 ; i < manos.size() ; i ++){
			if (manos.get(i).getPalo().toString() != manos.get(0).getPalo().toString()){
				suma1 = Boolean.TRUE;
			}
			
		}
		assertTrue(suma1);
		}
		
	}
	
	
