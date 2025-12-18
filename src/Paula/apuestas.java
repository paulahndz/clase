package Paula;

import java.util.Scanner;
public class apuestas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pierde = 0;
		int tirada = sc.nextInt();
		
		while (tirada!=0) {
			
			if (tirada<0) {
				pierde++;
			} 
			tirada = sc.nextInt();
		
		}	System.out.println(pierde);
	}

}
