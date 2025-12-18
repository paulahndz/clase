package Paula;

import java.util.Scanner;
public class patates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int camions = sc.nextInt();
		int pregunta;
		int total = 0;
		
		for (int i = 0; i < camions; i++) {
			pregunta = sc.nextInt();
			
			total += pregunta;
			//esto es igual que total = total + pregunta//
		} 
		
		System.out.println(total);
	}

}
