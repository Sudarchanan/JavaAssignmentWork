package airplaneseatings;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Getting no of rows
		System.out.println("Enter the NoOfRows Required :");
		int i = sc.nextInt();
		
		
		//creating seats
		int j =10;
		char[][] seats = new char[i][j];
		for(int row =0; row <i; row++) {
			for(int col =0; col <j ; col++) {
				seats[row][col] = '.';
			}
		}
		
		//Booking Seats
		System.out.println("*******BOOKING SEAT*********");
		System.out.println("Row Number of seat : ");
		int r = sc.nextInt();
		System.out.println("Column Number of seat");
		int c = sc.nextInt();
		sc.close();
		
		
		if(seats != null && seats[r][c]== '.') {
			
			seats[r][c]= 'X';
			
			System.out.println(seats[r][c]);
			
		}
		//printing Seats
		for(int row =0; row <i; row++) {
			for(int col =0; col < j; col++) {
				System.out.print(seats[row][col]);
			}
			System.out.println();
		}

			
		
	}



}
