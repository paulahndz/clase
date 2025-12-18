package Paula;

import java.util.Scanner;
public class harrison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
	
		
		for (int i =1000000; i <= num; i = i+1000000) {
			System.out.println(i);
		}
	}

}
