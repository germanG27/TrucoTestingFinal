package trabajo.testing.truco;
import java.lang.Exception;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;



@SuppressWarnings("unused")
public class Jugar {
	
	
	public static Boolean fin;

	public static Boolean getFinal() {
		return fin;
	}

	public static void setFinal(Boolean fin) {
		Jugar.fin = fin;
	}
    

	@SuppressWarnings("unchecked")
	public static void main(String[] args)throws Exception{
		Mazo mazo = new Mazo();
		Menu menu = new Menu();
		ArrayList<Carta> temp = new ArrayList<Carta>();
		InputProvider input = new InputProvider();
		Jugar.setFinal(false);
		Menu.menuInicial();
		String nombre_jugador = menu.menuNombre();
		Jugadores Jugadores = new Jugadores(1, nombre_jugador);
		Jugadores PC = new Jugadores(1);
		Jugador user = Jugadores.getJugadores().get(0);
		do {
			mazo.mezclarMazo();
			Ronda ronda = new Ronda();
			Integer posicion = 0;
			Integer gano_jugador = 0;
			Integer gano_oponente = 0;
			for (Jugador jugador : Jugadores.getJugadores()) {
				Mano mano = new Mano(Mazo.getMazo().get(posicion), Mazo.getMazo().get(posicion + 1),
						Mazo.getMazo().get(posicion + 2));
				jugador.setMano(mano);
				posicion += 3;
			}
			for (Jugador jugador : PC.getJugadores()) {
				Mano mano = new Mano(Mazo.getMazo().get(posicion), Mazo.getMazo().get(posicion + 1),
						Mazo.getMazo().get(posicion + 2));
				jugador.setMano(mano);
				posicion += 3;
			}
			menu.menuCartas(Jugadores.getJugadores().get(0).getMano());
			System.out.println("Tus puntos " + user.getNombre() + " son: " + Jugadores.getPuntaje().getPuntaje());
			System.out.println("Los puntos de la computadora son: " + PC.getPuntaje().getPuntaje());
			for( Integer i = 0 ; i < 3 ; i ++ ){
				temp.clear();
				if(!ronda.getEnvido() && i==0) {									
					menu.menuEnvido();
					Integer num;
					do{
						num = input.getIntegerInput();
					}while(!input.controladorInput(num, 1, 2));
					if(num == 1) {
						ronda.setEnvido(Boolean.TRUE);
						System.out.println(user.getMano().envido());
						System.out.println("Oponente: " + PC.getJugadores().get(0).getMano().envido());
						if(user.getMano().envido() >= PC.getJugadores().get(0).getMano().envido()){
							Jugadores.getPuntaje().sumarPuntos(2);
						}
						else {
							Jugadores.getPuntaje().sumarPuntos(2);
						}
					}
				}
				if(!ronda.getTruco()) {
					Integer num;
					num = menu.menuCantarTruco(menu);
					if(num == 1){
						ronda.setTruco(Boolean.TRUE);
						Integer aux_num;
						aux_num = menu.menuRespuestaReTruco();	
						if(aux_num == 1){
							ronda.setReTruco(Boolean.TRUE);
						}
						if(aux_num == 2){
							ronda.setReTruco(Boolean.FALSE);							
							Jugar.setFinal(true);
						}
						if(aux_num == 3){
							ronda.setValeCuatro(Boolean.TRUE);
						}
					}
				} 
				//try {
					if(!Jugar.getFinal()){
						System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						System.out.println("Se reparten nuevas cartas");
						System.out.println("------------- Tu turno " + nombre_jugador + "! -------------------------");
						menu.menuCartas(Jugadores.getJugadores().get(0).getMano());
						Integer carta = input.getIntegerInput();
						temp.add(user.jugarCarta(carta-1));
						System.out.println("Turno de: Computadora");
						temp.add(PC.getJugadores().get(0).jugarCarta(Mano.getPosicionCartaMayorPunataje(PC.getJugadores().get(0).getMano())));
						String ganador = Ronda.compararCartas(temp.get(0), temp.get(1));
						if(ganador.equals("ganador carta 1")){
							gano_jugador ++;
						}
						if(ganador.equals("ganador carta 2")){
							gano_oponente ++;
						}
						if(gano_jugador == 2) {
							if(ronda.getValeCuatro()){
								Jugadores.getPuntaje().sumarPuntos(4);
							}
							else if(ronda.getReTruco()){
								Jugadores.getPuntaje().sumarPuntos(3);
							}
							else if(ronda.getTruco()){
								Jugadores.getPuntaje().sumarPuntos(2);
							}
							else {
								Jugadores.getPuntaje().sumarPuntos(1);
							}
							System.out.println("***********************************************************************");
							System.out.println("*************   Ganaste " + user.getNombre()+"!     *******************");
							System.out.println("***********************************************************************");
							Jugar.setFinal(true);
						}
					
					
					if(gano_oponente == 2){
						if(ronda.getValeCuatro()){
							PC.getPuntaje().sumarPuntos(4);
						}
						else if(ronda.getReTruco()){
							PC.getPuntaje().sumarPuntos(3);
						}
						else if(ronda.getTruco()){
							PC.getPuntaje().sumarPuntos(2);
						}
						else {
							PC.getPuntaje().sumarPuntos(1);
						}
						System.out.println("Gano la computadora");
						Jugar.setFinal(true);
					}
					
					
				}//}catch(Exception e) {
					//	e.printStackTrace();
					//}
				
			}menu.menuFinal();
			
				
		
			
		} while (!Jugar.getFinal());
	}

}
