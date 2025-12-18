package Paula;

import java.util.Scanner;
public class eleccions_patates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			int K = sc.nextInt();
			int [] arr = new int[K];
			int max = 0;
			int posMax = 0;
			
			for(int j = 0; j <arr.length; j++) {
				arr[j] = sc.nextInt();
				if(arr[j]>max) {
					max = arr[j];
					posMax = j+1;
				}
			
			}
				System.out.println(posMax);	
			
			}
		
	}

}
