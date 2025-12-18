package Paula;

import java.util.Scanner;
public class bambino {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		if (a == b || a == c || a == n || b ==a || b == c || b == n || c == a || c == b || c == n || n == a || n == b || n == c ) {
			System.out.println("NO");
		} else {
			System.out.println("SI");
		}
	}

}
