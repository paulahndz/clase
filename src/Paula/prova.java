package Paula;

import java.util.Scanner;

public class prova {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("ENTRADA 2, POSA NUMEROS FINS QUE POSES ALGUNA COSA EN CONCRET");
		
		// Llegim el primer número abans d'entrar al bucle
		int casos2 = sc.nextInt();
		
		// Mentre el número NO sigui -1, continuem processant
		while(casos2!=-1) {
			// PRIMER: Fem el que haguem de fer amb el número llegit
			System.out.println("OK HE LLEGIT UN "+casos2);
			
			// Aquí podríem fer càlculs, comparacions, acumular sumatori, etc.
			
			// AL FINAL, I SEMPRE AL FINAL: Tornem a llegir el següent número
			// Això és CRUCIAL! Si no ho fem, tindríem un bucle infinit
			casos2 = sc.nextInt();
		}
		// Quan sortim del bucle, vol dir que hem llegit un -1
		System.out.println("Adios");

	}

}
