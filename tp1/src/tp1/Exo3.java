package tp1;

import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("entetez un nombre pour le prix");
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       System.out.println("la langueur est " + n);
	       
	       if(n>350) {
	    	   System.out.println(" il n'y a pas de réduction"
	    	);
	    	   }
//	       else if (n= 350) { 
//	    	   System.out.println("3% de réduction est accordé");}
	       else if (n <= 600)
	    	   System.out.println("5% de réduction est accordé");
		

	}

}
