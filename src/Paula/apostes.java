package Paula;

import java.util.Scanner;
public class apostes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pierde = 0;
		int tirada1 = sc.nextInt();
		int tirada2 = sc.nextInt();
		int tirada3 = sc.nextInt();	
		int tirada4 = sc.nextInt();
		int tirada5 = sc.nextInt();
		
		while ((tirada1 && tirada2 && tirada3 && tirada4 && tirada5)>0 && (tirada1 && tirada2 && tirada3 && tirada4 && tirada5)< -1) {
			
			if ((tirada1 && tirada2 && tirada3 && tirada4 && tirada5)<0) {
				pierde++;
			} 
			tirada1 = sc.nextInt();
			tirada2 = sc.nextInt();
			tirada3 = sc.nextInt();	
			tirada4 = sc.nextInt();
			tirada5 = sc.nextInt();
		
		}	System.out.println(pierde);
	}			

}
