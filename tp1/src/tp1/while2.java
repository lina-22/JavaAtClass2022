package tp1;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("combien de fois dites vous bonjour chaque jour:");
	       Scanner sc = new Scanner(System.in);
	       int nb = sc.nextInt();
	       int i = 0;
	       while (i<nb) {
	    	   System.out.println("Bonjour");
//	    	   i = i+1;
	    	   i++; //post incémentation i<- i+1
	       }
	       
	       System.out.println("fin du prog");

	}

}
