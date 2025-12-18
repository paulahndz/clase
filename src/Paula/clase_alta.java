package Paula;

import java.util.Scanner;
public class clase_alta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num > 30400 || num == 30400) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}
}
