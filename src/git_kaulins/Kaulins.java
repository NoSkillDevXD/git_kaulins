package git_kaulins;

import java.util.Random;
import java.util.Scanner;

public class Kaulins {

	public static void main(String[] args) {
		int skaitlis, reizes;
		Random rand = new Random();
		Scanner dati = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu?");
		reizes = dati.nextInt();
		for(int i = 1; i <= reizes; i++) {
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
		}
		dati.close();
		
	}
	
}
