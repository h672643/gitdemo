package Obligatoriskinnlevering;

import java.util.Scanner;


public class obligatoriskoppgave1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int Beløp;
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Vennligst skriv beløp");
    	Beløp = scan.nextInt();
    	scan.close();  
    	
		if ( 934051 <= Beløp ) {
			System.out.println("Trinn4,14.52%" + "\n"+ Beløp * 0.1452);
		}
		else if (580651 <= Beløp && Beløp <= 934050) {
			System.out.println("Trinn3, 11.52%" + "\n"+ Beløp * 0.1152);
		}
		else if (230951 <= Beløp && Beløp <=580650) {
			System.out.println("Trinn 2,2.41% " + "\n"+ Beløp * 0.0241);	
		} 
		else if (164101 <= Beløp && Beløp <= 230950) {
			System.out.println("Trinn 1, 0.93%" + "\n"+ Beløp * 0.093);
		}
		 else{
			System.out.println("Trinn 0, 0%" + "\n"+ Beløp * 0);
		 }

	}

}
