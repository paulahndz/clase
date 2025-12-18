package Paula;

import java.util.Scanner;
public class repartiment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nombre_fitxes = sc.nextInt();
		int total = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			//PRIMERO CALCULAR LA MULTIPLICICACION
			
			total = nombre_fitxes*i;
			
			System.out.println(nombre_fitxes + " x "+ i + " = "+ total);
		
		}
	
	}

}
