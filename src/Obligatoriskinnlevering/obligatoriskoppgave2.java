package Obligatoriskinnlevering;

import java.util.Scanner;


public class obligatoriskoppgave2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int poeng;
		Scanner scan = new Scanner (System.in);
		System.out.println("Vennligst skriv poengsum");
		poeng = scan.nextInt();
		scan.close();
		
		for (int i=0; i <=10; i++) {
			
		
			if (90<= poeng && poeng <= 100) {
			System.out.println("A");
			}
		else if (80 <= poeng && poeng <= 89) {
			System.out.println("B");
		}
		else if (60 <= poeng && poeng <=79) {
			System.out.println("C");
		} else if (50 <= poeng && poeng <= 59) {
			System.out.println("D");
		}
		 else if (40 <= poeng && poeng <= 49) {
			System.out.println("E");
		 }
		else if (0 <= poeng && poeng <=39) {
			System.out.println("F");
		}
			else {
				System.out.println("Ugyldig tall, vennligst prøv igjen");
			}
			  }
	}

}
