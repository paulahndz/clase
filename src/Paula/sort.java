package Paula;

import java.util.Scanner;

public class sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int numeromesgran = 0;

		while (num != 0) {
			if(num > numeromesgran) {
				numeromesgran = num;
			}
			num = sc.nextInt();

		}
		System.out.println(numeromesgran);
	}

}
