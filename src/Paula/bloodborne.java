package Paula;

import java.util.Scanner;

public class bloodborne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos = sc.nextInt();
		int res;
		
		for(int i = 0; i < casos; i++) {
			
			int K = sc.nextInt();
			int [] arr = new int[K];
			
			for(int j = 0; j <arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int encontrado =0;
			for(int j = 0; j <arr.length; j++) {
				if(arr[j]==arr[j]+1) {
				encontrado+=1;
				} 
			}
		}	
	}

}
