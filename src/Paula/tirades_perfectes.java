package Paula;

import java.util.Scanner;
public class tirades_perfectes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seis = 0;
		int tirada = sc.nextInt();
		
		while (tirada!=-1) {
			
			if (tirada == 6) {
				seis++;
			} tirada = sc.nextInt();

		}
		System.out.println(seis);
	}

}
