package Paula;

import java.util.Scanner;
public class primer_bucle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
	
		while(casos>0) {
			int num = sc.nextInt();
			num = num +1;
			System.out.println(num);
			
			casos--; 
		}
		
		
		
	}
}
