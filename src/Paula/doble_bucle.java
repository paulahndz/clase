package Paula;

import java.util.Scanner;
public class doble_bucle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int repeticiones = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
			System.out.println(i);
			}
		}	
		
	}	

}
