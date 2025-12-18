package Paula;

import java.util.Scanner;

public class positius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notaQueAcaboDeLeer = sc.nextInt();
		int contador1 = 0;
		int contador2 = 0;
		
		while(notaQueAcaboDeLeer!=-1) {
			
			if (notaQueAcaboDeLeer == 10) {
				contador1++;
			} else {
				contador2++;
			}

			
			notaQueAcaboDeLeer = sc.nextInt();
		}
		// Quan sortim del bucle, vol dir que hem llegit un -1
		System.out.println(("TOTAL NOTES:" && contador1) && ("NOTES10:" &&contador2));

	
	}
}
