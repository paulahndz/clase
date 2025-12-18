package Paula;

import java.util.Scanner;

public class cerca_aproximado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		
		for(int i = 0; i < casos; i++) {
			
			int K = sc.nextInt();
			int [] arr = new int[K];
			
			for(int j = 0; j <arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int num_sabates = sc.nextInt();
			String res = "NO";
			
			for(int j = 0; j<arr.length;j++) {
				if (arr[j]-1==num_sabates||arr[j]==num_sabates||arr[j]+1==num_sabates) {
					res="SI";
				}
			}
			
			System.out.println(res);
		
			
			
			
		}
	}

}
