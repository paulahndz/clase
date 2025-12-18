package Paula;

import java.util.Scanner;
public class interval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1);
			num1--;
		} else if (num1 < num2) {
			System.out.println("El segon no es mes petit que el primer");
		} else {
			while(num1>=num2) {
				System.out.println(num1);
				
				num1--; 
			}
		}
	}
		
		
		

	}

}
