package juego.ahorcado;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String palabraSecreta=Funciones.palabraSecreta();
		char [] palabraGuiones=Funciones.palabrasGuiones(palabraSecreta);
		boolean juegoTerminado=false;
		
		do {
			System.out.println("Bienvenido al juego del ahorcado.\n\n"+
		"Por favor, introduzca una letra\n");
			char letra=sc.next().charAt(0);
			boolean algunaLetraAcertada=false;
			for(int i=0; i<palabraSecreta.length();i++) {
				if(palabraSecreta.charAt(i)==letra) {
					palabraGuiones[i]=letra;
					algunaLetraAcertada=true;
				}
			}
			if(!algunaLetraAcertada) {
				System.out.println("\nNo has acertado ninguna letra\n");
			}
		}while (!juegoTerminado);
		
		//Prueba que me salga palabras random.
		//System.out.println(palabraSecreta);
		
		//Sustituye la palabra secreta por guiones.
		//System.out.println(palabraGuiones);
	}
}
