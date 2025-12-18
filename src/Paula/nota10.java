package Paula;

import java.util.Scanner;
public class nota10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notas = sc.nextInt();
		int notasfinal = 0;
		int notas10 = 0;
		
		while(notas!= -1) {
			if (notas >=0 && notas<=10) {
				notasfinal++;
			}
			
			if (notas == 10) {
				notas10++;
			}notas = sc.nextInt();
			
			}
		
		System.out.print("TOTAL NOTES: "+ notasfinal + " NOTES10: "+ notas10);
	}
	
}
