package Paula;

import java.util.Scanner;
public class temperatura_dos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int K = sc.nextInt();
			int [] arr = new int[K];
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int r = sc.nextInt();
			for(int j = 0; j <arr.length; j++) {
				if (r == arr[j]) {
					arr[j] = -1;
				}
				System.out.print(arr[j]+ " ");	
			}
			
			
			System.out.println();
			}
	}

}
