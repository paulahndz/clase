package Paula;

import java.util.Scanner;
public class torres_bessones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double torreA = sc.nextDouble();
		double torreB = sc.nextDouble();
		double res ;
	
		if (torreA > torreB) {
			res = torreA - torreB;
		} else {
			res = torreB - torreA;
		}
		
		if (res <= 5) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
	}

}
