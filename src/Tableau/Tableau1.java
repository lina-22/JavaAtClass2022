package Tableau;

public class Tableau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] tab1 = {4, 8 , 10}; //(*1)
		double tab2 [] = {1.3, 5.6, 7.8, 4.75}; //(*2)
		String [] tab3 = {"toto", "tata"}; //(*3)
		char tab4 [] = {'a', 'b', 'c', 'd'}; //(*4)
		
		System.out.println("1er �lement:" + tab1[0]);
		System.out.println("2�me �lement:" + tab1[1]);
		System.out.println("3�me �lement:" + tab3[0]);
		System.out.println("1er �lement:" + tab3[1]);
		System.out.println("2�me �lement:" + tab1[0]);
		tab1[1] =15;
		
		System.out.println("1er �lement:" + tab1[0]);
		System.out.println("2�me �lement:" + tab1[1]);
		System.out.println("3�me �lement:" + tab1[2]);
		//System.out.println("3�me �lement:" + tab1[3]); G�n�re une expention d�clench�e par l'acc�s � une case
		
		int t = tab1.length;
		System.out.println("Taille: "+ t);
		
		System.out.println();
		
		for(int i = 0; i<t; i++) {
			System.out.println(tab1[i]+" ");
			System.out.println();
		}
			// On incr�ment de 5 la valeur de chaque �l�ment du tableau
			
			for(int i=0; i<t; i++) {
				
				tab1[i] = tab1[i]+5;
				System.out.println(tab1[i]+ " ");
					
			}
			
			//Autre solution pour parcourir le tableau
			System.out.println();
         	for(int x: tab1) {			
				System.out.println(x+ " ");
				System.out.println();	
			}
		}
		
		
		
	}


