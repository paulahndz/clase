package Paula;

import java.util.Scanner;
public class apostess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int perder = 0;
		int num;
		
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			if (num <0) {
				perder++;
			}
			
		}
		System.out.print(perder);
	}

}
