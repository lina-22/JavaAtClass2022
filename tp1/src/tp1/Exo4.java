package tp1;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("entetez un nombre pour le poids");
	       Scanner sc = new Scanner(System.in);
//	       double n = sc.nextDouble();
	       float n = sc.nextFloat();
	       System.out.println("la poids est " + n);

	       if(n<16.5 ) {
	    	   System.out.println("Dénutrition");
	       }else if(n>16.5 && n<18.5) {
	    	   System.out.println("Maigreur" +n);
	       }else if(n>18.5 && n<25) {
	    	   System.out.println("Corpulence normalet" +n);
	       }else if(n>25 && n<30) {
	    	   System.out.println("Surpoids" +n);
	       }else if(n>30) {
	    	   System.out.println("Obésité" +n);
	       }
	       
//	       switch(n) {
//	       case 1 : System.out.println("Vous avez tapé Dénutrition");
//	               break;
//	       case 2 : System.out.println("Vous avez tapé Maigreur");
//                   break;
//	       case 3 : System.out.println("Vous avez tapé Corpulence normale\r\n"
//	       		+ "");
//                   break;
//	       case 4 : System.out.println("Vous avez tapé Surpoid");
//                   break;
//	       default : System.out.println("Obésité");
//           
//	       
//	       }
	       
	       System.out.println("Fin du programme");
	}

}
