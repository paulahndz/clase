package Paula;

import java.util.Scanner;

public class mitjana_tos {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int casos = sc.nextInt();
	int res;
	
	for(int i = 0; i<casos;i++) {
		
		int K = sc.nextInt();
		int [] arr = new int[K];
		
		for(int j = 0; j < arr.length;j++) {
			arr[j] = sc.nextInt();
		}
		int acumulador = 0;
		for(int j = 0; j < arr.length;j++) {
			acumulador += arr[j];
		}
		res= acumulador/K;
		
		if (res>15) {
			System.out.println("A CASA");
		}else {
			System.out.println("A CLASSE");
		}
		
	}
	
	
	
}

}
