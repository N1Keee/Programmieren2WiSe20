package while_loop;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		
		int increment = 3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Gib einen ganzzahligen Wert f�r a ein:");
		int a = keyboard.nextInt();

		System.out.println("Gib nun einen ganzzahligen Wert f�r b ein:");
		int b = keyboard.nextInt();
		
		keyboard.close();
		
		while(a < b) {
			a += increment;
		}
		
		System.out.println("a wurde solang um " + increment + " erh�ht, bis a gr��er als b ist.\na = " + a + ", b = " + b);
	}
}
