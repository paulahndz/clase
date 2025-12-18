package Paula;

import java.util.Scanner;
public class numeros_continguts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a + 1 == b || b + 1 == a) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}

}
