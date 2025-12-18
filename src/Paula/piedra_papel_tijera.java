package Paula;

import java.util.Scanner;
public class piedra_papel_tijera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jugador1 = sc.nextInt();
		int jugador2 = sc.nextInt();
		
		if (jugador1 == 1 && jugador2 == 1) {
			System.out.println("EMPAT");
		} else if (jugador1 == 1 && jugador2 == 2) {
			System.out.println("Jugador2");
		} else if (jugador1 == 1 && jugador2 == 3) {
			System.out.println("Jugador1");
		} else if (jugador1 == 2 && jugador2 == 1) {
			System.out.println("Jugador1");
		} else if (jugador1 == 2 && jugador2 == 2) {
			System.out.println("EMPAT");
		} else if (jugador1 == 2 && jugador2 == 3) {
			System.out.println("Jugador2");
		} else if (jugador1 == 3 && jugador2 == 1) {
			System.out.println("Jugador2");
		} else if (jugador1 == 3 && jugador2 == 2) {
			System.out.println("Jugador1");
		} else if (jugador1 == 3 && jugador2 == 3) {
			System.out.println("EMPAT");
		} else {
			System.out.println("ERROR");
		}
	}

}
