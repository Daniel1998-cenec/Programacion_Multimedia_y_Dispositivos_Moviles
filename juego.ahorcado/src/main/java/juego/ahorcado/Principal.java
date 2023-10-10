package juego.ahorcado;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String nombre;
		String plataforma = null;
		String[] palabras={"cermuzo", "vida", "peluca", "hipopotamo"};
		System.out.println("Bienvenido al juego del ahorcado");
		System.out.println("Por favor, introduzca tu nombre");
		nombre=sc.nextLine();
		
		System.out.println("Cuantas letras tiene tu palabra");
		
		for(byte i=0; i>10; i++) {
			plataforma="_";
		}
		
		System.out.println(plataforma);
		
		
	}

}
