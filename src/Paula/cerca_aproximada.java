package Paula;

import java.util.Scanner;
public class cerca_aproximada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int K = sc.nextInt();
			int [] arr = new int[K];
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			for(int j = 0; j <arr.length; j++) {
				if (arr[j]==p1) {
					arr[j]=p2;
				} 
				System.out.print(arr[j]+ " ");	
			}
			
			
			System.out.println();
			}
		
	}

}
