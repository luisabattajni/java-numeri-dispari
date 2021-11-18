package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispariBonus {

	public static void main(String[] args) {
		/*
		 * BONUS
		 *Calcolare e stampare a video anche: 
		 *quanti sono, nell’array, i numeri dispari, 
		 *quanti sono i numeri pari,
		 *la somma dei numeri compresi tra 10 e 50 
		 *(estremi esclusi)
		 */
		
		System.out.println("Lunghezza dell'array: ");
		// init Scanner + random
		Scanner scanner = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		int lunghezza = scanner.nextInt();

		
		System.out.println("Creo un array con " + lunghezza + " n naturali, di cui stampo i dispari");
		int[] n = new int[lunghezza];
		
		int nNDispari = 0;
		int nNPari = 0;
		int somma = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = randomGenerator.nextInt(100);
			
			if (n[i] % 2 != 0) {
				nNDispari++;
			} else if(n[i] % 2 == 0) {
				nNPari++;
			}
				
			
			if (n[i] % 2 != 0) {
				System.out.print(n[i] + " ");
				
			} 
			
			
			if (n[i] > 10 && n[i] < 50) {
				somma = somma + n[i];
			}

			
			
		

			
			

		
		}
		
		System.out.println("\nnumeri dispari: " + nNDispari);
		System.out.println("\nnumeri pari: " + nNPari);
		System.out.println("\nSomma: " + somma);
		
	
		
		
		
		
		
		
		
		
		
		//close Scanner
		scanner.close();

	}

}
