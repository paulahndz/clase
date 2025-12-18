package Paula;

import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 5;
		arr[3] = 8;
		arr[4] = 4;
		
		//RECORRER DE FIN A INICIO
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("a["+i+"] = "+arr[i]);
		}

	}

}
