package Paula;

import java.util.Scanner;
public class segon_bucle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cas1 = sc.nextInt();
		int cas2;
		int cas3;
		
		for (int i = 0; i < cas1; i++) {
			cas2 = sc.nextInt();
			for (int j = 0; j < cas2; j++) {
				cas3 = sc.nextInt();
				System.out.println(cas3+1);
			}
		}
	}

}
