package tp1;

import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("entetez un nombre pour la longueur");
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       System.out.println("la langueur est " + n);
	       
	       System.out.println("entetez un pour la largeur");
//	       Scanner sc = new Scanner(System.in);
	       int p = sc.nextInt();
	       System.out.println("vous avez tap� largeur " + p);
	       
	       

	       System.out.println("le r�sultat de rectangle est " + p*n);
	}

}
