package juego.ahorcado;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String palabraSecreta=Funciones.palabraSecreta();
		char [] palabraGuiones=Funciones.palabrasGuiones(palabraSecreta);
		boolean juegoTerminado=false;
		byte intentos=6;
		
		System.out.println("Bienvenido al juego del ahorcado\n");
		//String a = JOptionPane.showInputDialog("fdf");
		//JOptionPane.showMessageDialog(null, "fz");
		
		do {
			System.out.println("Te quedan "+ intentos+" intentos");
			System.out.println(palabraGuiones);
			System.out.println("Por favor, introduzca una letra\n");
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
				--intentos;
				Funciones.dibujarAhorcado(intentos);
				
				if(intentos==0) {
					System.out.println("Has perdido porque agotaste los intentos");
					juegoTerminado=true;
				}
			}else {
				boolean juegoGanado= !Funciones.hayGuiones(palabraGuiones);
				if (juegoGanado) {
					System.out.println("Has ganado el juego");
					juegoTerminado=true;
				}
			}
		}while (!juegoTerminado);
		
		sc.close();
		//Prueba que me salga palabras random.
		//System.out.println(palabraSecreta);
		
		//Sustituye la palabra secreta por guiones.
		//System.out.println(palabraGuiones);
	}
}
