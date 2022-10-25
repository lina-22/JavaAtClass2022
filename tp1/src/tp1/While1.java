package tp1;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    
    int n = 0;
    while (n!=1) {
    	System.out.println("Enterez un nombre, 1 pour sortir");
    	n = sc.nextInt();
    }
    System.out.println("Fin du programme");
	}

}
