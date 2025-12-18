package Paula;

import java.util.Scanner;
public class notes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num < 5) {
			 System.out.println("Suspes");
		} else if (num < 7 && num > 4) {
			 System.out.println("Aprovat");
		} else if (num < 9 && num > 6) {
			System.out.println("Notable");
		} else {
			System.out.println("Excelent");
		}
	}
	
}
