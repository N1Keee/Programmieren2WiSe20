package while_loop;

public class Aufgabe2 {

	public static void main(String[] args) {
		double paper = 0.1;
		int counter = 0;
		while(paper < 384400000000.0) {
			paper = paper*2;
			counter++;
		}
		System.out.println("Wenn man ein Blatt Papier theoretisch " + counter + " mal falten w�rde, k�me man damit bis zum Mond.");
	}
}
