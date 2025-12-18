package Paula;

import java.util.Scanner;
public class caramelos {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int caramels= sc.nextInt();
		 int nens = sc.nextInt();
		 int res = nens % caramels;
		 
		 System.out.println(res);

	}

}
