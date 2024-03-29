package ExceptionExcercise;

import java.util.Scanner;

public class ParseInts{
	public static void main(String[] args) {
		
		int val, sum=0;
		 
		Scanner sc =  new Scanner(System.in);

		System.out.println("Enter a line of text : ");
		 
		Scanner scanLine = new Scanner(sc.nextLine());
		 
		while (scanLine.hasNext()){ 
			try {
			
				val  = Integer.parseInt(scanLine.next());
				sum += val;
			}
				catch(NumberFormatException e) {
						System.out.println(e);
			}
			
	}System.out.println("The sum of the integers on this line is " + sum);
}}
 