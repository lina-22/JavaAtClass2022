package tp1;

import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("entetez un nombre");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("vous avez tapé " + n);
       
       if(n>0) {
    	   System.out.println("Nombre positif");
    	   }
       else if (n==0) 
    	   System.out.println("Nombre nul");
       else
    	   System.out.println("nombre négatif");
	}

}
