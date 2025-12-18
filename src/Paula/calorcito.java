package Paula;

import java.util.Scanner;
public class calorcito {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alumnes = sc.nextInt();
		int temperatura = sc.nextInt();
		int comandament = sc.nextInt();
		
		if ((alumnes <=30 || alumnes >=0) && (temperatura <=42 || temperatura >= 0) && comandament == "SI") {
			System.out.println("Aire");
		} else if ((alumnes <=30 || alumnes >=0) && (temperatura <=42 || temperatura >= 0) && comandament == "NO") {
			System.out.println("Obrir Finestra");
		} else {
			System.out.println("Res");
		}
	}

}
