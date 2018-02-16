package trabajo.testing.truco;

import trabajo.testing.truco.Carta; 
import trabajo.testing.truco.InputProvider; 
import trabajo.testing.truco.Mano; 
import trabajo.testing.truco.Jugar; 

public class Menu<menuAntesTruco> {

	public Menu(){

	}

	public static void menuInicial(){
		System.out.println("++++++++++++++++++++++++++++++++   Bienvenidos al truco!   ++++++++++++++++++++++++++++++++");
	}

	public void menuFinal() {
		InputProvider input = new InputProvider();
		Integer num1;
		do{
			System.out.println("++++++++++++++++++++++++++++++++   Mano terminada, a repartir cartas!   ++++++++++++++++++++++++++++++++ ");
			System.out.println("Queres seguir jugando? ");
			System.out.println("1) Si");
			System.out.println("2) No");
			num1 = input.getIntegerInput();
		}while(!input.controladorInput(num1, 1, 2));
		if(num1.equals(1)){
			Jugar.setFinal(false);
		}
		if(num1.equals(2)){
			Jugar.setFinal(true);
		}

	}
	
	public String menuNombre() throws Exception{
		InputProvider input = new InputProvider();
		System.out.println("Elegi tu nombre de usuario: ");
		return input.getStringInput();
	}
	public static void menuAntesTruco() {
		System.out.println("Tus cartas son: ");
		Integer i = 1;
		
		for(Carta carta : Mano.getMano()) {
			System.out.println(i + ")" + " " + carta.getNumero() + " " + carta.getPalo());
			i++;
		}
	}
	
	public Integer menuCantarTruco(Menu<?> menu) {
		InputProvider input = new InputProvider();
		Integer num1;
		do{
			Menu.menuAntesTruco();
			System.out.println("Desea cantar truco?: ");
			System.out.println("1) Si");
			System.out.println("2) No");
			num1 = input.getIntegerInput();
		}while(!input.controladorInput(num1, 1, 2));
		return num1;
	}
	
	public Integer menuRespuestaReTruco() {
		InputProvider input = new InputProvider();
		Integer num1;
		do{
			
			System.out.println("La computadora canto re truco!");
		
			System.out.println("1) Quiero");
			System.out.println("2) Irme al mazo");
			System.out.println("3) Cantar 'Quiero vale 4'");
			num1 = input.getIntegerInput();
		}while(!input.controladorInput(num1, 1, 3));
		return num1;
	}
	
	public void menuCartas(Mano cartas) {
		System.out.println("Sus cartas son: ");
		Integer i = 1;
		for(Carta carta : Mano.getMano()) {
			System.out.println(i + ")" + " " + carta.getNumero() + " " + carta.getPalo());
			i++;
		}
	}
	
	public void menuEnvido() {
		System.out.println("Desea cantar envido?: ");
		System.out.println("1) Si");
		System.out.println("2) No");
	}




}
