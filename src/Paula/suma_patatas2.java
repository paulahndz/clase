package Paula;

import java.util.Scanner;
public class suma_patatas2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int camions;
		int pregunta;
		int total = 0;
		
		for (int i = 0; i < casos; i++) {
			camions = sc.nextInt();
			total = 0;
			for (int j = 0; j < camions; j++) {
				pregunta = sc.nextInt();
				
				total+= pregunta;
			}System.out.println(total);
		}
	}

}
