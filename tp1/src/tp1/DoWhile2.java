package tp1;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Combien de fois dites vous bonjour chaque jour:");
		
		Scanner sc = new Scanner(System.in);
		
		int nb = sc.nextInt();
		int i = 0;
		do {
			System.out.println("Bonjour");
			i++;
		}while (i<nb);
		System.out.println("\fin du prog");

	}

}
