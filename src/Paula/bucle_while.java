package Paula;

import java.util.Scanner;
public class bucle_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos2 = sc.nextInt();
		
		
		while(casos2!=0) {
			
			System.out.println(casos2 +1);
			
			
			casos2 = sc.nextInt();
		}



	}
}
