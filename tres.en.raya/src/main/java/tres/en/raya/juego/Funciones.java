package tres.en.raya.juego;

import java.util.Scanner;

public class Funciones {
	
	public static void mostrarTablero(String[] tablero) {
		
		System.out.println(tablero[0]+" | "+tablero[1]+" | "+tablero[2]);
		System.out.println(tablero[3]+" | "+tablero[4]+" | "+tablero[5]);		
		System.out.println(tablero[6]+" | "+tablero[7]+" | "+tablero[8]);
	}
	
	public static void juegaJugador(String ficha, String tablero []) {
		Scanner sc=new Scanner (System.in);
		System.out.println("¿Donde quieres mover, jugador "+ ficha+"?");
		int posicion=sc.nextInt();
		
		tablero[posicion]=ficha;
	}
	
	public static boolean ganadorPartida (String tablero[]) {
		if(tablero[0].equals(tablero[1]) && tablero[0].equals(tablero[2]) && !tablero[0].equals("_")){
			return true;
		} else if(tablero[3].equals(tablero[4]) && tablero[3].equals(tablero[5]) && !tablero[3].equals("_")) {
			return true;
		} else if(tablero[6].equals(tablero[7]) && tablero[6].equals(tablero[8]) && !tablero[6].equals("_")) {
			return true;
		} else if(tablero[0].equals(tablero[3]) && tablero[0].equals(tablero[6]) && !tablero[0].equals("_")) {
			return true;
		} else if(tablero[1].equals(tablero[4]) && tablero[1].equals(tablero[7]) && !tablero[1].equals("_")) {
			return true;
		} else if(tablero[2].equals(tablero[5]) && tablero[2].equals(tablero[8]) && !tablero[2].equals("_")) {
			return true;
		} else if(tablero[0].equals(tablero[4]) && tablero[0].equals(tablero[8]) && !tablero[0].equals("_")) {
			return true;
		} else if(tablero[2].equals(tablero[4]) && tablero[2].equals(tablero[6]) && !tablero[2].equals("_")) {
			return true;
		}
		return false;
	}
	
}
