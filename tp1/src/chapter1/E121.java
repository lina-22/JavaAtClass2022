package chapter1;

import java.util.Scanner;

public class E121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int nb;
		int sp;
		int star = 1;
		System.out.println("Donnez le nombre de ligne:");
		nb = sc.nextInt();
		sp = nb-1;
		for (int i=1; i<=nb; i++) {
			for (int x=0; x<sp;x++) 
				System.out.print("");
			
			for (int y=0; y<star; y++) 
				System.out.println("*");
			
			System.out.println();
			sp--;
			star = star+2;
		}
	}

}
