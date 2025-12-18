package Paula;

import java.util.Scanner;
public class diferencia_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && b >c) {
			System.out.println(a - c);
		} else if (a > c && c >b) {
			System.out.println(a - b);
		} else if (b > a && a > c) {
			System.out.println(b -c);
		} else if (b > c && c >a) {
			System.out.println(b -a);
		} else if (c > a && a >b) {
			System.out.println(c-b);
		} else {
			System.out.println(c-a);
		}
	}

}
