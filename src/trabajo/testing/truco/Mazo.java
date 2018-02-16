package trabajo.testing.truco;

import java.util.ArrayList;
import java.util.Collections;


import java.util.Random;

import trabajo.testing.truco.Carta; 


public class Mazo {
	
	public static ArrayList<Carta> mazo;
	
	//Creo objeto Mazo
	public Mazo(){
		this.setMazo(new ArrayList<Carta>());
		
		for(int i = 1; i<=7 ; i++){
			Carta carta = new Carta(i, Palo.Basto);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Espada);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Oro);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Copa);
			this.agregarCarta(carta);	
		}
		
		for(int i = 10;i<=12;i++){
			Carta carta = new Carta(i, Palo.Basto);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Espada);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Oro);
			this.agregarCarta(carta);
			carta = new Carta(i, Palo.Copa);
			this.agregarCarta(carta);	
		}
		
		this.darValores();
	}

	public static ArrayList<Carta> getMazo() {
		return mazo;
	}

	public void setMazo(ArrayList<Carta> mazo) {
		Mazo.mazo = mazo;
	}
	
	public void agregarCarta(Carta carta) {
		Mazo.getMazo().add(carta);
	}
	
	public Carta retirarCarta(Integer indice, ArrayList<Carta> mazo){
		if(!mazo.isEmpty() && mazo.size() > indice){
			return mazo.get(indice);
		}
		return null;
	}
	
	public void mezclarMazo(){
		Collections.shuffle(Mazo.getMazo());
	}
	//Seteo valores para las cartas siendo 1000 la carta mas fuerte
	public void darValores(){
		for(Carta carta : Mazo.getMazo()){
			if(carta.getNumero().equals(1) && carta.getPalo().equals(Palo.Espada)){
				carta.setPuntaje(100);
				continue;
			}
			if(carta.getNumero().equals(1) && carta.getPalo().equals(Palo.Basto)){
				carta.setPuntaje(90);
				continue;
			}
			if(carta.getNumero().equals(7) && carta.getPalo().equals(Palo.Espada)){
				carta.setPuntaje(80);
				continue;
			}
			if(carta.getNumero().equals(7) && carta.getPalo().equals(Palo.Oro)){
				carta.setPuntaje(70);
				continue;
			}
			if(carta.getNumero().equals(3)){
				carta.setPuntaje(30);
			}
			if(carta.getNumero().equals(2)){
				carta.setPuntaje(20);
			}
			if(carta.getNumero().equals(1)){
				carta.setPuntaje(13);
			}
			if(carta.getNumero().equals(12)){
				carta.setPuntaje(12);
			}
			if(carta.getNumero().equals(11)){
				carta.setPuntaje(11);
			}
			if(carta.getNumero().equals(10)){
				carta.setPuntaje(10);
			}
			if(carta.getNumero().equals(7)){
				carta.setPuntaje(4);
			}
			if(carta.getNumero().equals(6)){
				carta.setPuntaje(3);
			}
			if(carta.getNumero().equals(5)){
				carta.setPuntaje(2);
			}
			if(carta.getNumero().equals(4)){
				carta.setPuntaje(1);
			}
		}
	}


	public void mostrarCartaMazo(){
		for (int i = 0 ; i < Mazo.getMazo().size() ; i ++){
			System.out.println(Mazo.getMazo().get(i));
		}
		
	}

	
	public void repartirCartas(ArrayList<Carta> cartasUser){
		Random ran = new Random();
		if (cartasUser.size() <= 2){
			for (int i = 0 ; i < 3 ; i++){
				int miRandom = 0  + ran.nextInt(3);
				if ( cartasUser.size() < 3){
					
					cartasUser.add(Mazo.getMazo().get(miRandom));
				}	
			}
			eliminarCartasRepetidas(cartasUser);
		}
	}	
	
	public void eliminarCartasRepetidas(ArrayList<Carta> cartaUser){
		if (cartaUser.get(0)== cartaUser.get(1)){
			cartaUser.remove(1);
			repartirCartas(cartaUser);
		}
		else if (cartaUser.get(1) == cartaUser.get(2)){
			cartaUser.remove(2);
			repartirCartas(cartaUser);
		}
		else if (cartaUser.get(0) == cartaUser.get(2)){
			cartaUser.remove(2);
			repartirCartas(cartaUser);
		}
		else{
			for(int i = 0 ; i< cartaUser.size(); i++){
				for ( int j = 0 ; j < Mazo.getMazo().size() ; j++){
					if(cartaUser.get(i) == Mazo.getMazo().get(j)){
						Mazo.getMazo().remove(j);
					}
				}
			}
		}
	}
	
}