package trabajo.testing.truco;


import java.util.ArrayList;

public class Ronda {
	
	private Boolean envido;
	private Boolean truco;
	private Boolean reTruco;
	private Boolean valeCuatro;
	private ArrayList<Carta> vuelta1;
	private ArrayList<Carta> vuelta2;
	private ArrayList<Carta> vuelta3;
	
	public Ronda(){
		this.setEnvido(Boolean.FALSE);
		this.setTruco(Boolean.FALSE);
		this.setReTruco(Boolean.FALSE);
		this.setValeCuatro(Boolean.FALSE);

	}

	public Boolean getEnvido() {
		return envido;
	}

	public void setEnvido(Boolean envido) {
		this.envido = envido;
	}

	public Boolean getTruco() {
		return truco;
	}

	public void setTruco(Boolean truco) {
		this.truco = truco;
	}

	public Boolean getReTruco() {
		return reTruco;
	}

	public void setReTruco(Boolean reTruco) {
		this.reTruco = reTruco;
	}

	public Boolean getValeCuatro() {
		return valeCuatro;
	}

	public void setValeCuatro(Boolean valeCuatro) {
		this.valeCuatro = valeCuatro;
	}
	
	public ArrayList<Carta> getVuelta1() {
		return this.vuelta1;
	}

	public void setVuelta1(ArrayList<Carta> vuelta1) {
		this.vuelta1 = vuelta1;
	}

	public ArrayList<Carta> getVuelta2() {
		return this.vuelta2;
	}

	public void setVuelta2(ArrayList<Carta> vuelta2) {
		this.vuelta2 = vuelta2;
	}

	public ArrayList<Carta> getVuelta3() {
		return this.vuelta3;
	}

	public void setVuelta3(ArrayList<Carta> vuelta3) {
		this.vuelta3 = vuelta3;
	}

	public void truco(){
		this.setTruco(Boolean.TRUE);
	}
	
	public void reTruco(){
		this.setReTruco(Boolean.TRUE);
	}
	
	public void valeCuatro(){
		this.setValeCuatro(Boolean.TRUE);
	}
	
	public static String compararCartas(Carta carta1, Carta carta2){
		if(carta1.getPuntaje() > carta2.getPuntaje()){
			return "La carta ganadora es: " + carta1;
		}
		if(carta1.getPuntaje() < carta2.getPuntaje()){
			return "La carta ganadora es:" + carta2;
		}
		if(carta1.getPuntaje().equals(carta2.getPuntaje())){
			return "empate";
		}
		return "";
	}
}
