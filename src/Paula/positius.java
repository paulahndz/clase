package Paula;

import java.util.Scanner;

public class positius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int contador = 0;
		
		while (casos>0) {
			int numero = sc.nextInt();
			if (numero > 0) {
				contador++;
			}
			casos--;
		}
		
		System.out.println(contador);
	}
}
