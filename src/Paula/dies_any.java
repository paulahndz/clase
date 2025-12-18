package Paula;

import java.util.Scanner;
public class dies_any {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num == 366) {
			System.out.println("Correcte per un any bixest!");
		} else if (num >= 1 && num <=365) {
			System.out.println("Correcte per un any no bixest!");
		} else {
			System.out.println("Incorrecte!");
		}
	}
}
