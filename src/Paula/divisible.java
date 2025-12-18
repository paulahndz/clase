package Paula;

import java.util.Scanner;
public class divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextInt();
		
		if (num % 1 == 0 && num % 2 == 0 && num % 3 == 0 && num % 4 == 0 && num % 5 == 0 && num % 6 == 0 && num % 7 == 0 && num % 8 == 0 && num % 9 == 0) {
			 System.out.println("SI");
		} else {
			System.out.println("NO");	
		}
			}

}
