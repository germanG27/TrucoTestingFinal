package trabajo.testing.truco;

import java.util.ArrayList;

public class Mano {
	
	private static ArrayList<Carta> mano;
	private int puntajeMano;
	
	public Mano(Carta carta1, Carta carta2, Carta carta3){		
		this.setMano(new ArrayList<Carta>());
		this.agregarCarta(carta1);
		this.agregarCarta(carta2);
		this.agregarCarta(carta3);
		this.setPuntajeMano(this.calcularPuntajeMano());
	}
	
	public void agregarCarta(Carta carta){
		Mano.getMano().add(carta);		
	}
	
	public static ArrayList<Carta> getMano() {
		return mano;
	}

	public void setMano(ArrayList<Carta> mano) {
		Mano.mano = mano;
	}
	
	public int getPuntajeMano() {
		return this.puntajeMano;
	}

	public void setPuntajeMano(int puntajeMano) {
		this.puntajeMano = puntajeMano;
	}

	public static int getMayorNumero(ArrayList<Carta> mano){
		int num = 0;
		for(Carta carta : mano){
			if(carta.getNumero() > num  && carta.getNumero() < 10){
				num = carta.getNumero();				
			}
		}
		return num;
	}
	
	public static int getPosicionCartaMayorPunataje(Mano mano) {
		int posicion = 0;
		for(int i=0;i<Mano.getMano().size();i++) {
			if(Mano.getMano().get(i).getPuntaje() > Mano.getMano().get(posicion).getPuntaje())
				posicion = i;
		}
		return posicion;
	}
	
	
	public int envido(){
		int envido;
		if(Mano.getMano().get(0).getPalo().equals(Mano.getMano().get(1).getPalo())){
			envido = 20 + Mano.getMano().get(0).getNumero() + Mano.getMano().get(1).getNumero();
		}
		else if(Mano.getMano().get(0).getPalo().equals(Mano.getMano().get(2).getPalo())){
			envido = 20 + Mano.getMano().get(0).getNumero() + Mano.getMano().get(2).getNumero();
		}
		else if(Mano.getMano().get(1).getPalo().equals(Mano.getMano().get(2).getPalo())){
			envido = 20 + Mano.getMano().get(1).getNumero() + Mano.getMano().get(2).getNumero();
		}
		else{
			ArrayList<Carta> lista_auxiliar = new ArrayList<Carta>();
			for(Carta carta : Mano.getMano()){
				if(!carta.esReyes(carta)){
					lista_auxiliar.add(carta);
				}
			}
			if(!lista_auxiliar.isEmpty()){
				envido = getMayorNumero(lista_auxiliar);
			}
			else{
				return 0;
			}
		}
		return envido;
	}
	
	public int calcularPuntajeMano(){
		int suma = 0;
		for(Carta carta : Mano.getMano()){
			suma += carta.getPuntaje();
		}
		return suma;
	}

	
}
