package trabajo.testing.truco;
import trabajo.testing.truco.Puntaje;

import java.util.LinkedList;

public class Jugadores {
	String nombre;
	LinkedList<Jugador> jugadores;
	Carta cartaGanadoraJugadores;
	Puntaje puntaje;
	
	public Jugadores(Integer cantidadJugadores, String nombre){
		this.setJugadores(new LinkedList<Jugador>());
		this.setNombre("Jugadores: " + nombre);
		this.setPuntaje(new Puntaje());
		this.setCartaGanadoraJugadores(null);
		this.agregarJugador(new Jugador(nombre));
		if(cantidadJugadores == 2){
			this.agregarJugador(new Jugador());
		}
	}
	
	public Jugadores(Integer cantidadJugadores){
		this.setJugadores(new LinkedList<Jugador>());
		for(Integer i = 0; i < cantidadJugadores; i++){
			this.agregarJugador(new Jugador());
		}
		this.setPuntaje(new Puntaje());
		this.setNombre("Computadora");
		this.getPuntaje().setPuntaje(0);
		this.setCartaGanadoraJugadores(null);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LinkedList<Jugador> getJugadores() {
		return this.jugadores;
	}
	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public Carta getCartaGanadoraEquipo() {
		return this.cartaGanadoraJugadores;
	}
	public void setCartaGanadoraJugadores(Carta cartaGanadoraEquipo) {
		this.cartaGanadoraJugadores = cartaGanadoraEquipo;
	}
	public Puntaje getPuntaje() {
		return this.puntaje;
	}
	public void setPuntaje(Puntaje puntaje) {
		this.puntaje = puntaje;
	}
	
	public void agregarJugador(Jugador jugador){
		this.getJugadores().add(jugador);
	}

	public void setPuntos(Puntaje puntaje2) {
		// TODO Auto-generated method stub
		
	}
	
}