package Obligatoriskinnlevering;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class obligatoriskoppgave3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tall = parseInt(showInputDialog("Skriv inn tall"));
		int sum = 1;
		for (int i = tall; i>0;i--) {
			sum *=i;
			System.out.println(i);
			System.out.println();

}
			System.out.println(sum);
		
	}

}
