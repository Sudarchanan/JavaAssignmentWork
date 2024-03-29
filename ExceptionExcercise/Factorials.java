package ExceptionExcercise;

import java.util.Scanner;

public class Factorials   {

	public static void main(String[] args) {
		
		String keepGoing = "y";
		 
		while (keepGoing.equals("y") || keepGoing.equals("Y")) {
			
			try {
			Scanner scan =new Scanner(System.in);
				
			System.out.print("Enter an integer: "); 
			int val =scan.nextInt();
			 
			System.out.println("Factorial("+ val+ ")"+  MathUtils.factorial (val)); 
			System.out.print("Another factorial? (y/n):");
			 
			keepGoing= scan.next();
			
			}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		
	}
}
}

