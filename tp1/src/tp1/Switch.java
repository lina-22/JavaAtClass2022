package tp1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("entetez un nombre");
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
//	       System.out.println("vous avez tapé " + n);
	       
	       switch(n) {
	       case 1 : System.out.println("Vous avez tapé 1");
	               break;
	       case 2 : System.out.println("Vous avez tapé 2");
                   break;
	       case 3 : System.out.println("Vous avez tapé 3");
                   break;
	       case 4 : System.out.println("Vous avez tapé 4");
                   break;
	       default : System.out.println("Autre valeur que 1, 2, 3,4");
           
	       
	       }
	       
	       System.out.println("Fin du programme");

	}

}
