package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispariBonus {

	public static void main(String[] args) {
		/*
		 * array lunghezza n (con scanner)
		 * ^ numeri int RANDOM tra 0 e 99
		 * Scorrere array + sysout SOLO n dispari
		 */
		
		System.out.println("Lunghezza dell'array: ");
		// init Scanner + random
		Scanner scanner = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		int lunghezza = scanner.nextInt();
		
		System.out.println("Creo un array con " + lunghezza + " n naturali, di cui stampo i dispari");
		int[] n = new int[lunghezza];
		
		for(int i = 0; i < n.length; i++) {
			n[i] = randomGenerator.nextInt(100);
			
			if(n[i] % 2 != 0){
				System.out.print(n[i] + " ");	
			} 
		
		}
		
		
		
		
		
		
		
		
		
		
		//close Scanner
		scanner.close();

	}

}
