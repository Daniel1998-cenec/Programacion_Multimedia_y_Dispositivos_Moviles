package tres.en.raya.juego;

public class Principal {

	public static void main(String[] args) {
		String tablero[] = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
		byte tirada = 0;
		boolean alguienGano=false;
		do {
			Funciones.mostrarTablero(tablero);
			String ficha = tirada % 2 == 0 ? "X" : "O";
			Funciones.juegaJugador(ficha, tablero);
			alguienGano=Funciones.ganadorPartida(tablero);
			if(alguienGano) {
				System.out.println("Enhorabuena, jugador "+ficha);
			}
			tirada++;
		} while (!alguienGano);
	}

}
