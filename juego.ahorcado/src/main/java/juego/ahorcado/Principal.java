package juego.ahorcado;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		
		String palabraSecreta=Funciones.palabraSecreta();
		char [] palabraGuiones=Funciones.palabrasGuiones(palabraSecreta);
		boolean juegoTerminado=false;
		byte fallos=7;
				
		
		//System.out.println("Bienvenido al juego del ahorcado\n");
		JOptionPane.showMessageDialog(null, "Bienvenido al juego del ahorcado", "Bienvenido", JOptionPane.PLAIN_MESSAGE);
		do {
			//System.out.println("Te quedan "+ intentos+" intentos");
			JOptionPane.showMessageDialog(null, "Te quedan " + fallos + " vidas");
			//System.out.println(palabraGuiones);
			JOptionPane.showMessageDialog(null, new String(palabraGuiones));
			
			//System.out.println("Por favor, introduzca una letra\n");
			String letraIntroducida=JOptionPane.showInputDialog("Por favor, introduzca una letra\n");
			
			// Verifica si el usuario presionó "Cancelar" o cerró la ventana del cuadro de diálogo
			if (letraIntroducida == null) {
				JOptionPane.showMessageDialog(null, "Juego terminado por cancelación del usuario");
			    break; // Sale del bucle del juego
            }
			//Sirve para que no pete el programa sino introduces ninguna letra
			if (letraIntroducida.isEmpty()) {
				continue;
			}
			char letra=letraIntroducida.charAt(0);
			boolean algunaLetraAcertada=false;
			for(int i=0; i<palabraSecreta.length();i++) {
				if(palabraSecreta.charAt(i)==letra) {
					palabraGuiones[i]=letra;
					algunaLetraAcertada=true;
				}
			}
			if(!algunaLetraAcertada) {
				JOptionPane.showMessageDialog(null, "\nNo has acertado ninguna letra\n");
				
				//Metodo que dibuja el ahorcado cuando fallo una letra.
				//Funciones.dibujarAhorcado(intentos);
				//String dibujo = Funciones.dibujarAhorcado(intentos);
				JTextArea textArea = new JTextArea(Funciones.dibujarAhorcado(fallos));
				 textArea.setColumns(20); // Ancho personalizado
				 textArea.setRows(10);   // Alto personalizado
				 
				JOptionPane.showMessageDialog(null, textArea, "Ahorcado", JOptionPane.PLAIN_MESSAGE);
				--fallos;
				
				if(fallos==0) {
					JOptionPane.showMessageDialog(null, "Has perdido porque se ha completado el ahorcado");
					juegoTerminado=true;
				}
			}else {
				boolean juegoGanado= !Funciones.hayGuiones(palabraGuiones);
				if (juegoGanado) {
					JOptionPane.showMessageDialog(null, "Has ganado el juego");
					juegoTerminado=true;
				}
			}
		}while (!juegoTerminado);
		
		//sc.close();
		//Prueba que me salga palabras random.
		//System.out.println(palabraSecreta);
		
		//Sustituye la palabra secreta por guiones.
		//System.out.println(palabraGuiones);
	}
}
