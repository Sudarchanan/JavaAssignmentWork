package ExceptionExcercise;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {

		int[] counts = new int [26]; 
		Scanner scan= new Scanner(System.in);
		 
		//get word from user 
		System.out.print("Enter a single word (letters only, please): "); 
		String word = scan.next();
		scan.close();

		//convert to all upper case 
		word = word.toUpperCase();
		 
		//count frequency of each letter in string 
		int i = 0;
		try {

			for ( i = 0 ; i < word.length(); i++) {
				counts [word.charAt(i)-'A']++;
			} 
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Not A Letter : " + word.charAt(i));
			
			

		}
		

		
		//print frequencies 
		System.out.println(); 
		for (int j=0; j < counts.length; j++) 
			if (counts [j] != 0) 
				System.out.println((char) (j + 'A')+":"+counts[j]);
	}

}
