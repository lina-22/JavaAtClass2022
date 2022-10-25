package tp1;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("entetez un nombre");
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       System.out.println("vous avez tapé " + n);
	       
	       if (n>10) 
	    	   System.out.println("Ok");
	    	   else
	    		   System.out.println("Pas ok");
	    	  
	}

}
