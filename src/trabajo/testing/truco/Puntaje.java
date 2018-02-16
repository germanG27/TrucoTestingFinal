package trabajo.testing.truco;

public class Puntaje {

		
		private Integer puntaje;
		
		public Puntaje(){
			this.setPuntaje(0);
		}

		public Integer getPuntaje() {
			return puntaje;
		}

		public void setPuntaje(Integer puntaje) {
			this.puntaje = puntaje;
		}
		
		public void sumarPuntos(Integer puntaje){
			this.setPuntaje(this.getPuntaje() + puntaje);
		}
		
	}


