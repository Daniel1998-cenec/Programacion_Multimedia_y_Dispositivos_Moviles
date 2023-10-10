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
}
