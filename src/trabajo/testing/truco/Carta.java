package trabajo.testing.truco;

import java.util.ArrayList;

public class Carta {

	
	
	private Palo palo;
	private Integer numero;
	private Integer puntaje;

	public Carta(Integer numero, Palo palos){
		this.setPalo(palos);
		this.setNumero(numero);
	}
	
	
	public Integer getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(Integer puntajesCartas) {
		this.puntaje = puntajesCartas;
	}


	public Palo getPalo() {
		return palo;
	}
	
	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String toString (){
		return this.getNumero().toString().concat("|").concat(this.getPalo().toString()).concat("|");
	}


	public ArrayList<Carta> getCartasUser() {
		return null;
	}
	
	public Boolean es1Espada (Carta carta) {
		if (carta.getPalo().equals(Palo.Espada) && carta.getNumero().equals(1)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
	}
	public Boolean es1Basto (Carta carta) {
		if(carta.getPalo().equals(Palo.Basto) && carta.getNumero().equals(1)){
		return Boolean.TRUE;
		}
		else {
		return Boolean.FALSE;
		}
	}
	
	public Boolean esReyes (Carta carta) {
		if (carta.getNumero().equals(10) || carta.getNumero().equals(10) || carta.getNumero().equals(10)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
		
	}
	
	public Boolean es1Oro (Carta carta) {
		if (carta.getPalo().equals(Palo.Oro) && carta.getNumero().equals(1)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
	}
	
	public Boolean es1Copa(Carta carta) {
		if (carta.getPalo().equals(Palo.Copa) && carta.getNumero().equals(1)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
	}
	
	public Boolean es7Espada (Carta carta) {
		if (carta.getPalo().equals(Palo.Espada) && carta.getNumero().equals(7)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
	}
	
	public Boolean es7Oro (Carta carta) {
		if (carta.getPalo().equals(Palo.Oro) && carta.getNumero().equals(7)) {
			return Boolean.TRUE;
		}
		else {
			return Boolean.FALSE;
		}
	}


		
	}
	
	
	
	
	
	

