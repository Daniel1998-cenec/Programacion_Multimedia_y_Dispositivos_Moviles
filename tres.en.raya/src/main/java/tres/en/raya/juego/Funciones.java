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
	
}
