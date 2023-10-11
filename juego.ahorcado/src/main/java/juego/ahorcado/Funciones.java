package juego.ahorcado;

import java.util.Random;

public class Funciones {
	
	public static String palabraSecreta() {
		
		String palabras[]= {"casa","perro","coche"};
		Random r=new Random();
		byte palabraAleatoria=(byte) r.nextInt(palabras.length);
		
		return palabras[palabraAleatoria];
	}
	
	public static char [] palabrasGuiones(String palabra) {
		//con esto saco las letras de la palabra secreta
		byte nLetrasPalabraSecreta=(byte) palabra.length();
				
		//creo un array de char de guiones 
				
		char palabrasGuiones[]= new char [nLetrasPalabraSecreta];
		for(byte i=0; i<palabrasGuiones.length; i++) {
		palabrasGuiones[i]='_';
		}
		
		return palabrasGuiones;
	}
	
	//Este método lo que hace es comprobar con un for en una array si hay guiones.
	public static boolean hayGuiones(char[] comprobacion) {
		//Este tipo de for solo se usa en array!!
		for(char i:comprobacion) {
			if (i=='_');
				return true;
		}
		return false;
	}
	
	public static void dibujarAhorcado(int intentos) {
		switch (intentos) {
		case 6:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 5:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 4:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 3:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 2:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 1:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      /");
			System.out.println("|");
			System.out.println("|____");
			break;
		case 0:
			System.out.println(" ____");
			System.out.println("|       |");
			System.out.println("|       O");
			System.out.println("|      /|\\");
			System.out.println("|      / \\");
			System.out.println("|");
			System.out.println("|____");
			break;
		}
	}
}
