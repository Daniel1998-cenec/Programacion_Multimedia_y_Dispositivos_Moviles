package tres.en.raya.juego;

public class Principal {

	public static void main(String[] args) {
		String tablero[]= {"_","_","_","_","_","_","_","_","_"};
		byte tirada=0;
		Funciones.mostrarTablero(tablero);
		Funciones.juegaJugador("X", tablero);
		
		do {
		Funciones.mostrarTablero(tablero);
		String ficha = tirada%2== 0 ?"X":"O";
		Funciones.juegaJugador(ficha, tablero);
		tirada++;
		}while (true);
	}

}
