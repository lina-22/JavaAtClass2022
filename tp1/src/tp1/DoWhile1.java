package tp1;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       Scanner sc = new Scanner(System.in);
	       int n;
	       do {
	    	   System.out.println("enterez un nombre, 1 pour sortir");
	    	    
	    	   n = sc.nextInt();
	       }while(n!=1);
	  System.out.println("Fin du programme");      
	}
	}


